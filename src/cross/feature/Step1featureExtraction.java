package cross.feature;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import uk.ac.wlv.sentistrength.SentiStrength;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class Step1featureExtraction {
	private static String nl = System.lineSeparator();

	public Step1featureExtraction() throws Exception {
		List<File> allFiles = getAllfiles("output/", "arff");

		ArrayList<FeaturesInDP> arr = new ArrayList<FeaturesInDP>();
		String dir = "output2/";
		createFeatures(allFiles, arr);
	
		createWekaFile(arr, dir);
	}

	private static void createWekaFile(ArrayList<FeaturesInDP> arr, String dir) throws IOException {
		String s = "";
		s += constructHeader();
		s += nl;
		s += constructAttributes();
		s += nl;
		for (FeaturesInDP dp : arr) {
			s += "\"" + dp.getProjectName() + "\"" + ",";
			s += "\"" + dp.getAuthorName() + "\"" + ",";
			// s += dp.getAuthorDI() + ",";
			s += dp.getAuthorNopublished() + ",";
			s += bool(dp.isAuthorProjMem()) + ",";

			s += bool(dp.isInvited()) + ",";

			s += dp.getPositionInPost() + ",";
			s += dp.getPositionInPR() + ",";
			s += bool(dp.isReplayOriginalPost()) + ",";

			Pattern p = Pattern.compile("\t|\r|\n");

			Matcher m = p.matcher(dp.getTextualContent());
			String dest = m.replaceAll("");

			dest = dest.replaceAll("\"", " ");
			dest = trimnull(dest);

			s += "\"" + dest + "\"" + ",";

			s += dp.getNumberWords() + ",";
			s += bool(dp.isHasCapitalizedWord()) + ",";
			s += bool(dp.isHasShould()) + ",";
			s += bool(dp.isHasHow()) + ",";
			s += bool(dp.isHasWhat()) + ",";
			s += bool(dp.isHasWhy()) + ",";
			s += bool(dp.isHasCan()) + ",";
			s += bool(dp.isHasMay()) + ",";
			s += dp.getNumberQuestionmark() + ",";

			s += dp.getSentimentScore() + ",";

			s += bool(dp.isHasDecisions()) + ",";
			s += dp.getNumberDP() + nl;
			//s += dp.getIdComment() + nl;
		}
		
		BufferedWriter out = new BufferedWriter(new FileWriter(dir + "final.arff"));

		out.write(s);
		out.close();

	}

	public static String StringFilter(String str) throws PatternSyntaxException {
		String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~£¡@#£¤%¡­¡­&*£¨£©¡ª¡ª+|{}¡¾¡¿¡®£»£º¡±¡°¡¯¡££¬¡¢£¿]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll("").trim();
	}

	public static String trimnull(String string) throws UnsupportedEncodingException {
		ArrayList<Byte> list = new ArrayList<Byte>();
		byte[] bytes = string.getBytes("UTF-8");
		for (int i = 0; bytes != null && i < bytes.length; i++) {
			if (0 != bytes[i]) {
				list.add(bytes[i]);
			}
		}
		byte[] newbytes = new byte[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newbytes[i] = (Byte) list.get(i);
		}
		String str = new String(newbytes, "UTF-8");
		return str;
	}

	private static String bool(boolean test) {
		return test ? "TRUE" : "FALSE";
	}

	private static String constructAttributes() {
		String s = "";
		s += "@attribute projName0 String" + nl;

		// process
		s += "@attribute author0 String" + nl;
		s += "@attribute authorNumPosts0 numeric" + nl;
		s += "@attribute isProjectMember0 {TRUE, FALSE}" + nl;
		s += "@attribute isInvited0 {TRUE, FALSE}" + nl;
		// position
		s += "@attribute positionInPost0 numeric" + nl;
		s += "@attribute positionInPR0 numeric" + nl;
		s += "@attribute replayOriginalPost0 {TRUE, FALSE}" + nl;

		// textula content
		s += "@attribute textual0 String" + nl;

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

		s += "@attribute hasDecisions0 {TRUE, FALSE}" + nl;
		s += "@attribute numDP0 numeric" + nl;
		
		// id comment
		//s += "@attribute idComment numeric" + nl;
		
		s += "@data" + nl;
		return s;
	}

	private static String constructHeader() {

		String s = "";

		s += "@relation " + "Final_Set" + nl;
		return s;

	}

	private static void createFeatures(List<File> allFiles, ArrayList<FeaturesInDP> arr) throws Exception {
		for (File a : allFiles) {

			SentiStrength sentiStrength = new SentiStrength();
			String ssthInitialisationAndText[] = { "sentidata", "sentiment\\"};
			sentiStrength.initialise(ssthInitialisationAndText);

			String wekeName = a.getName();

			System.out.println("output/" + wekeName);

			Instances dataset = new DataSource("output/" + wekeName).getDataSet();
			
			dataset.setClassIndex(dataset.numAttributes() - 3);
			// dataset.deleteAttributeAt(dataset.numAttributes() - 1);
			// dataset.deleteAttributeAt(5);
			
			String[] authors = new String[dataset.numInstances()];
			int[] decisions = new int[dataset.numInstances()];
			int[] postPosted = new int[dataset.numInstances()];

			for (int i = 0; i < dataset.numInstances(); i++) {
				Instance cur = dataset.instance(i);
				FeaturesInDP dp = new FeaturesInDP();

				authors[i] = cur.stringValue(0);

				decisions[i] = (int) (cur.classValue());

				postPosted[i] = (int) (cur.value(5));

				String textContext = cur.stringValue(1);

				dp.setAuthorName(cur.stringValue(0));

				dp.setTextualContent(cur.stringValue(1));

				String sentiment[] = sentiStrength.computeSentimentScores(cur.stringValue(1)).split(" ");

				int positive = Integer.parseInt(sentiment[0]);
				int negative = Integer.parseInt(sentiment[1]);

				dp.setSentimentScore(positive + negative);
				dp.setAuthorProjMem(Boolean.valueOf(cur.stringValue(2)));

				dp.setInvited(Boolean.valueOf(cur.stringValue(3)));

				dp.setNumberWords((int) (cur.value(4)));

				dp.setPositionInPR((int) (cur.value(5)));

				dp.setPositionInPost((int) (cur.value(7)));

				dp.setReplayOriginalPost(Boolean.valueOf(cur.stringValue(8)));

				dp.setHasCapitalizedWord(Boolean.valueOf(cur.stringValue(9)));

				dp.setHasShould(Boolean.valueOf(cur.stringValue(10)));

				dp.setHasDecisions(Boolean.valueOf(cur.stringValue(11)));

				dp.setNumberDP((int) (cur.value(12)));

				dp.setProjectName(wekeName);

				if (textContext.toLowerCase().contains("can") || textContext.toLowerCase().contains("could")) {
					dp.setHasCan(true);
				} else {
					dp.setHasCan(false);
				}

				if (textContext.toLowerCase().contains("should")) {
					dp.setHasShould(true);
				} else {
					dp.setHasShould(false);
				}

				if (textContext.toLowerCase().contains("how")) {
					dp.setHasHow(true);
				} else {
					dp.setHasHow(false);
				}

				if (textContext.toLowerCase().contains("may") || textContext.toLowerCase().contains("might")) {
					dp.setHasMay(true);
				} else {
					dp.setHasMay(false);
				}
				if (textContext.toLowerCase().contains("what")) {
					dp.setHasWhat(true);
				} else {
					dp.setHasWhat(false);
				}

				if (textContext.toLowerCase().contains("why")) {
					dp.setHasWhy(true);
				} else {
					dp.setHasWhy(false);
				}
				String[] size = textContext.split("\\?");
				dp.setNumberQuestionmark(size.length - 1);

				int numDecisions = 0;

				ArrayList<Integer> unique = new ArrayList<Integer>();
				for (int j = 0; j < i; j++) {
					if (authors[i].equals(authors[j])) {
						numDecisions += decisions[j];
						int numPosted = postPosted[j];

						if (!unique.contains(numPosted)) {
							unique.add(numPosted);
						}
					}
				}

				dp.setAuthorDI(numDecisions);

				dp.setAuthorNopublished(unique.size());
				//dp.setIdComment((int) cur.value(13));

				arr.add(dp);
			}


		}
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
