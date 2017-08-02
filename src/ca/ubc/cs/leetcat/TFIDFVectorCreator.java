package ca.ubc.cs.leetcat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexOptions;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Terms;
import org.apache.lucene.index.TermsEnum;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.BytesRef;

/**
 * This is used to create a vector TFIDF. First call getTFIDFVector() Then
 * addDocument(String doc) Then endDocuments() Call this after you have finished
 * writing all documents. Then getVector()
 *
 * @author leetcat
 *
 */
public class TFIDFVectorCreator {

	private static final String CONTENT = "Content";
	private final Set<String> terms = new HashSet<>();
	private final ArrayList<RealVector> vectors = new ArrayList<>();
	private static TFIDFVectorCreator aTFIDFVectorCreator;
	private final IndexWriter aWriter;
	private Directory aDirectory;

	/**
	 * Gets one instance of TFIDF Vector.
	 *
	 * @return the TFIDF vector creator
	 * @throws IOException
	 *             if there is a problem writing to memory exception needs to be
	 *             throw.
	 */
	public static TFIDFVectorCreator getTFIDFVectorCreator() throws IOException {
		if (aTFIDFVectorCreator == null) {
			aTFIDFVectorCreator = new TFIDFVectorCreator();
		}
		return aTFIDFVectorCreator;
	}

	public static void deleteTFIDFVectorCreator() {
		aTFIDFVectorCreator = null;

	}

	private TFIDFVectorCreator() throws IOException {
		aWriter = createIndex();
	}

	private RealVector toRealVector(Map<String, Integer> map) {
		final RealVector vector = new ArrayRealVector(terms.size());
		int i = 0;
		for (final String term : terms) {
			final int value = map.containsKey(term) ? map.get(term) : 0;
			vector.setEntry(i++, value);
		}
		return vector.mapDivide(vector.getL1Norm());
	}

	private Map<String, Integer> getTermFrequencies(IndexReader reader, int docId) throws IOException {
		final Map<String, Integer> frequencies = new HashMap<>();
		final Terms vector = reader.getTermVector(docId, CONTENT);
		TermsEnum termsEnum = null;
		// If there are no words in a vector or only stop words vector will be
		// null and should return empty map
		if (vector == null) {
			return frequencies;
		}
		termsEnum = vector.iterator();
		BytesRef text = null;
		while ((text = termsEnum.next()) != null) {
			final String term = text.utf8ToString();
			final int freq = (int) termsEnum.totalTermFreq();
			frequencies.put(term, freq);
			terms.add(term);
		}
		return frequencies;
	}

	private IndexWriter createIndex() throws IOException {
		aDirectory = new RAMDirectory();
		final Analyzer analyzer = new EnglishAnalyzer();
		final IndexWriterConfig iwc = new IndexWriterConfig(analyzer);
		final IndexWriter writer = new IndexWriter(aDirectory, iwc);

		return writer;
	}

	/* Indexed, tokenized, stored. */
	private static final FieldType TYPE_STORED = new FieldType();

	static {
		// TYPE_STORED.setIndexed(true);
		TYPE_STORED.setIndexOptions(IndexOptions.DOCS);
		TYPE_STORED.setTokenized(true);
		TYPE_STORED.setStored(true);
		TYPE_STORED.setStoreTermVectors(true);
		TYPE_STORED.setStoreTermVectorPositions(true);
		TYPE_STORED.freeze();

	}

	private void addDocument(IndexWriter writer, String content) throws IOException {
		final Document doc = new Document();
		final Field field = new Field(CONTENT, content, TYPE_STORED);
		doc.add(field);
		writer.addDocument(doc);
	}

	/**
	 * Add a document to TFIDF vector.
	 *
	 * @param content
	 *            the document to be added
	 * @throws IOException
	 *             if a document cannot be added exception will be thrown
	 */
	public void addDocument(String content) throws IOException {
		addDocument(aWriter, content);
	}

	/**
	 * Closes the writer and creates the TFIDF vector, only call once you are
	 * finished loading all files.
	 *
	 * @throws IOException
	 *             Throws exception if there is a problem writing to memory.
	 */
	public void endDocuments() throws IOException {
		aWriter.close();
		final IndexReader reader = DirectoryReader.open(aDirectory);

		final ArrayList<Map<String, Integer>> maps = new ArrayList<>();

		// Find term frequency for each term in each document
		for (int j = 0; j < reader.maxDoc(); j++) {
			maps.add(getTermFrequencies(reader, j));
		}

		// Create real vector for each document.
		for (int j = 0; j < maps.size(); j++) {
			vectors.add(toRealVector(maps.get(j)));
		}
		reader.close();
	}

	/**
	 * Need to call endDocument before calling get vector or vector will be
	 * empty.
	 *
	 * @return vector with frequency of terms weighted.
	 */
	public ArrayList<RealVector> getVector() {
		return vectors;
	}
}