package ca.ubc.cs.leetcat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.math3.linear.RealVector;

public class Sandbox
{
	public Sandbox() throws IOException
	{
		example();
	}

	//HERE is the example code
	public void example() throws IOException
	{

		List<String> fileList = getSample();

		//Initialize the object.
		TFIDFVectorCreator aTFIDFVector = TFIDFVectorCreator.getTFIDFVectorCreator();

		for (String bug : fileList)
		{
			
			/*
			 * remove anything that is not a word pdoc is a string like this: "word1 word2 word3 wor.d4"
			 */
			String pdoc = preprocess(bug);

			//Add document to the vector
			aTFIDFVector.addDocument(pdoc);

		}
		//End the vector addition
		aTFIDFVector.endDocuments();

		//Get set of vectors.
		ArrayList<RealVector> vectorList = aTFIDFVector.getVector();
		for (RealVector vector: vectorList){
			System.out.println(vector);
		}
		/* Here, I have a vector for each comment */
	}

	private String preprocess(String bug) throws IOException
	{
		return TFIDFPreprocess.simplePreprocessor(bug);
	}

	//This loads files from my sample folder and changes them to strings and puts them in memory.
	private List<String> getSample() throws IOException
	{
		String lSampleLocation = "tmp";
		File file = new File(lSampleLocation);
		List<String> bugNumbers = new ArrayList<String>();
		File[] children = file.listFiles();
		String fileName;
		for (File child : children)
		{
			fileName = (child.getName().substring(0, child.getName().lastIndexOf(".")));
			if (!fileName.contains("bugzilla") && !fileName.isEmpty())
			{
				
				//Loads files and makes them a string.
				FileInputStream is = new FileInputStream(lSampleLocation + "/" + fileName + ".txt");
				String bugFile = IOUtils.toString(is);
				
				bugNumbers.add(bugFile);
			}
		}
		return bugNumbers;
	}

	public static void main(String[] args) throws IOException
	{
		new Sandbox();
	}
}
