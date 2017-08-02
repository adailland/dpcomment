package ca.ubc.cs.leetcat;

import java.io.IOException;
import java.io.StringReader;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.core.StopAnalyzer;
import org.apache.lucene.analysis.core.StopFilter;
import org.apache.lucene.analysis.standard.StandardTokenizer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

public class TFIDFPreprocess
{
	/**
	 * Simple preprocessor Stems and removes stopwords.
	 * 
	 * @param string
	 *            string to preprocess
	 * @return preprocessed string
	 * @throws IOException
	 *             is there is a problem reading and writing to memory.
	 */
	public static String simplePreprocessor(String string) throws IOException
	{
		StringBuffer tokenizedString = new StringBuffer();
		StringReader reader = new StringReader(string);
		Tokenizer whitespaceTokenizer = new StandardTokenizer();
		whitespaceTokenizer.setReader(reader);
		// Filters out stopwords
		TokenStream tokenStream = new StopFilter(whitespaceTokenizer, StopAnalyzer.ENGLISH_STOP_WORDS_SET);
		CharTermAttribute charTermAttribute = tokenStream.addAttribute(CharTermAttribute.class);
		tokenStream.reset();

		while (tokenStream.incrementToken())
		{
			tokenizedString.append(charTermAttribute.toString().toString() + " ");
		}
		tokenStream.close();

		return tokenizedString.toString();
	}
}
