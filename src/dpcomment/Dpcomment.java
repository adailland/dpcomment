package dpcomment;

import ca.ubc.cs.gentlebot.*;
import cross.feature.*;

public class Dpcomment {
	
	public static void main(String[] args) throws Exception {
		/*System.out.println("*** GIOVANNI'S CODE ***");
		PyhtonScriptInterpreter interpreter = new PyhtonScriptInterpreter();
		interpreter.executeScript("techpriest-master/techpriest.py");*/
		System.out.println("*** GENTLEBOT ***");
		Gentlebot gb = new Gentlebot();
		System.out.println("\n*** STEP 1 ***");
		Step1featureExtraction step1 = new Step1featureExtraction();
		System.out.println("\n*** STEP 2 ***");
		Step2TransferTermstoTF step2 = new Step2TransferTermstoTF();
		System.out.println("\n*** STEP 3 ***");
		Step3GenerateDatasets step3 = new Step3GenerateDatasets();
	}

}
