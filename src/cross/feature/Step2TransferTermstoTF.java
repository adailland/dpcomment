package cross.feature;

import java.io.BufferedWriter;
import java.io.FileWriter;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
//import weka.core.stemmers.SnowballStemmer;
import weka.core.tokenizers.WordTokenizer;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.StringToWordVector;

public class Step2TransferTermstoTF {

	public Step2TransferTermstoTF() throws Exception {
		DataSource source = new DataSource("output2/final.arff");
		Instances dataRaw = source.getDataSet();
		
		StringToWordVector filter = new StringToWordVector();
		filter.setWordsToKeep(100000);
		filter.setInputFormat(dataRaw);
		filter.setTFTransform(true);
		filter.setIDFTransform(true);
		
		filter.setAttributeIndices("9");
		filter.setLowerCaseTokens(true);

		filter.setMinTermFreq(10);
		filter.setOutputWordCounts(true);
		
		WordTokenizer a = new WordTokenizer();
		String opt= " \r\t\n.,;:\'\"()?!-><#$\\%&*+/@^_=[]{}|`~0123456789";
		a.setDelimiters(opt);
		
		filter.setTokenizer(a);
		//SnowballStemmer stemmer = new SnowballStemmer();
		//stemmer.setStemmer("porter");
		//filter.setStemmer(stemmer);

		Instances data = Filter.useFilter(dataRaw, filter);
		

		BufferedWriter out = new BufferedWriter(new FileWriter("output2/finalTF.arff"));

		out.write(data.toString());

		out.close();

	}

}
