package cross.feature;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import weka.classifiers.Classifier;
/*import weka.classifiers.bayes.ComplementNaiveBayes;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.bayes.NaiveBayesMultinomial;*/
import weka.classifiers.trees.RandomForest;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class Step3GenerateDatasets {
	private static String nl = System.lineSeparator();
	private static String dir = "output2/";

	public Step3GenerateDatasets() throws Exception {
		String stringRemove = "_output.arff";
		
		List<File> allFiles = getAllfiles("output/", "arff");
		ArrayList<String> projNames = new ArrayList<String>();
		for (File a : allFiles) {
			projNames.add(a.getName());
		}

		List<File> allFilesAnnotated = getAllfiles("annotated/", "txt");
		ArrayList<String> projNamesAnnotated = new ArrayList<String>();
		for (File ae : allFilesAnnotated) {
			projNamesAnnotated.add(ae.getName());
		}
		
		for (String proj : projNames) {
			if(!projNamesAnnotated.contains(proj.replace(stringRemove, ""))){
				System.out.println(proj);
				DataSource source = new DataSource("output2/finalTF.arff");
				Instances dataRaw = source.getDataSet();
	
				Instances trainingSet = new Instances(dataRaw, 0);
				Instances testSet = new Instances(dataRaw, 0);
	
				for (int i = 0; i < dataRaw.numInstances(); i++) {
					Instance cur = dataRaw.instance(i);
	
					if (cur.stringValue(0).equals(proj)) {
						testSet.add(cur);
					} else {
						trainingSet.add(cur);
					}
				}
				Instances backTrain = new Instances(trainingSet);
				Instances backTest = new Instances(testSet);
	
				removeNontextualFeatures(trainingSet);
	
				removeNontextualFeatures(testSet);
	
				/*double[] nbmTestScore = testScores(new NaiveBayesMultinomial(), trainingSet, testSet);
	
				double[] nbmTrainScore = trainScores(new NaiveBayesMultinomial(), trainingSet);
	
				double[] NBTestScore = testScores(new NaiveBayes(), trainingSet, testSet);
	
				double[] NBTrainScore = trainScores(new NaiveBayes(), trainingSet);
	
				double[] CompTestScore = testScores(new ComplementNaiveBayes(), trainingSet, testSet);
	
				double[] CompTrainScore = trainScores(new ComplementNaiveBayes(), trainingSet);*/
	
				double[] RFTestScore = testScores(new RandomForest(), trainingSet, testSet);
	
				double[] RFTrainScore = trainScores(new RandomForest(), trainingSet);
	
				createWekaFiles(backTrain, RFTrainScore, proj, "_Train");
	
				double scoreT = createWekaFiles(backTest, RFTestScore, proj, "_Test");
				
				
				createTxtFileDpComment(scoreT, backTest, RFTestScore, proj);
			}
		}

	}
	
	private static void createTxtFileDpComment(double score, Instances trainingSet, double[] RFTestScore, String fileName) throws Exception{
		final FileWriter parsedDiscussionOut = new FileWriter("output3/" + fileName + ".txt");
		Instances dataset = new DataSource("output/" + fileName).getDataSet();
		dataset.setClassIndex(dataset.numAttributes() - 2);
		ArrayList<Integer> listIdComment = new ArrayList<Integer>();
		for (int i = 0; i < dataset.numInstances(); i++) {
			Instance cur = dataset.instance(i);
			if(RFTestScore[i] >= score){
				if(listIdComment.size() <= 0){
					parsedDiscussionOut.write("para" + (int) cur.value(13) + "_" + (int) cur.value(14));
				}else{
					parsedDiscussionOut.write("\npara" + (int) cur.value(13) + "_" + (int) cur.value(14));
				}
				
				listIdComment.add((int) cur.value(13));
			}
			
		}
		parsedDiscussionOut.close();
	}
	
	private static double createWekaFiles(Instances trainingSet, double[] rFTrainScore, String proj, String type) throws IOException {
		String s = "";
		s += constructHeader();
		s += nl;
		s += constructAttributes();
		s += nl;
		double a = 0.0;
		for (int i = 0; i < trainingSet.numInstances(); i++) {
		
			Instance cur = trainingSet.instance(i);
			 //s += cur.value(2) + ",";
			s += cur.value(2) + ",";
			s += cur.stringValue(3) + ",";
			s += cur.stringValue(4) + ",";
			s += cur.value(5) + ",";
			s += cur.value(6) + ",";
			s += cur.stringValue(7) + ",";
			s += cur.value(8) + ",";
			s += cur.stringValue(9) + ",";
			s += cur.stringValue(10) + ",";
			s += cur.stringValue(11) + ",";
			s += cur.stringValue(12) + ",";
			s += cur.stringValue(13) + ",";
			s += cur.stringValue(14) + ",";
			s += cur.stringValue(15) + ",";
			s += cur.value(16) + ",";
			s += cur.value(17) + ",";

			s += rFTrainScore[i] + ",";

			s += cur.stringValue(18) + nl;
			if(type == "_Test"){
				a += rFTrainScore[i];
			}
		}
		BufferedWriter out = new BufferedWriter(new FileWriter(dir + proj + type + ".arff"));
		
		out.write(s);
		out.close();
		return (a / trainingSet.numInstances());
	}

	private static String constructAttributes() {
		String s = "";

	//	s += "@attribute authorPreDP0 numeric" + nl;
		s += "@attribute authorNumPosts0 numeric" + nl;
		s += "@attribute isProjectMember0 {TRUE, FALSE}" + nl;
		s += "@attribute isInvited0 {TRUE, FALSE}" + nl;
		// position
		s += "@attribute positionInPost0 numeric" + nl;
		s += "@attribute positionInPR0 numeric" + nl;
		s += "@attribute replayOriginalPost0 {TRUE, FALSE}" + nl;

		// Words
		s += "@attribute numberOfWords0 numeric" + nl;
		s += "@attribute hasCapitalizedWord0  {TRUE, FALSE}" + nl;
		s += "@attribute hasShould0  {TRUE, FALSE}" + nl;
		s += "@attribute hasHow0  {TRUE, FALSE}" + nl;
		s += "@attribute hasWhat0  {TRUE, FALSE}" + nl;
		s += "@attribute hasWhy0  {TRUE, FALSE}" + nl;
		s += "@attribute hasCan0  {TRUE, FALSE}" + nl;
		s += "@attribute hasMay0 {TRUE, FALSE}" + nl;
		s += "@attribute numberQuestionmark0 numeric" + nl;

		// sentiment
		s += "@attribute sentimentScore0 numeric" + nl;

		// textual
		s += "@attribute rfscore numeric" + nl;

		s += "@attribute hasDecisions0 {TRUE, FALSE}" + nl;


		s += "@data" + nl;
		return s;
	}

	private static String constructHeader() {

		String s = "";

		s += "@relation " + "Final_Set" + nl;
		return s;

	}

	private static double[] testScores(Classifier cla, Instances train, Instances test) throws Exception {
		double[] nbmTestScore = new double[test.numInstances()];
		cla.buildClassifier(train);

		for (int i = 0; i < test.numInstances(); i++) {
			nbmTestScore[i] = cla.distributionForInstance(test.instance(i))[1];
		}

		return nbmTestScore;
	}

	private static double[] trainScores(Classifier cla, Instances train) throws Exception {
		double[] nbmTrainScore = new double[train.numInstances()];

		int index = train.numInstances() / 2;

		Instances sub1 = new Instances(train, 0, index);
		Instances sub2 = new Instances(train, index, (train.numInstances() - index));

		cla.buildClassifier(sub1);

		for (int i = 0; i < sub2.numInstances(); i++) {
			nbmTrainScore[i] = cla.distributionForInstance(sub2.instance(i))[1];
		}

		cla.buildClassifier(sub2);
		for (int i = 0; i < sub1.numInstances(); i++) {
			nbmTrainScore[index + i] = cla.distributionForInstance(sub1.instance(i))[1];
		}

		return nbmTrainScore;
	}

	private static void removeNontextualFeatures(Instances dataset) {
		for (int i = 0; i < 18; i++) {
			dataset.deleteAttributeAt(0);
		}

		dataset.deleteAttributeAt(1);

		dataset.setClassIndex(0);

	}

	public static List<File> getAllfiles(String path, String extension) {
		ArrayList<File> ret = new ArrayList<File>();
		try {
			Files.walk(Paths.get(path)).forEach(filePath -> {
				if (Files.isRegularFile(filePath))
					if (filePath.toString().toLowerCase().endsWith("." + extension))
						ret.add(filePath.toFile());
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ret;
	}
}
