package dpcomment;

import java.util.Properties;

import org.python.core.PyException;
import org.python.util.InteractiveInterpreter;
import org.python.util.PythonInterpreter;

public class PyhtonScriptInterpreter {
	private InteractiveInterpreter interp = new InteractiveInterpreter();
	
	public PyhtonScriptInterpreter(){
		interp = new InteractiveInterpreter();
		Properties props = new Properties();
		//Le chemin des librairies python
		//props.put("python.path", "lib/Lib" );
		props.put("python.path","lib/Lib");
		props.put("python.console.encoding", "UTF-8"); // Used to prevent: console: Failed to install '': java.nio.charset.UnsupportedCharsetException: cp0.
		props.put("python.security.respectJavaAccessibility", "false"); //don't respect java accessibility, so that we can access protected members on subclasses
		props.put("python.import.site","false");
		PythonInterpreter.initialize( System.getProperties( ), props, new String[]{""});
	}
	
	public void executeScript(String fileName){
		try{
			interp.cleanup();
			interp.execfile( fileName );
		}catch(PyException pyEx){
			System.out.println(pyEx.toString());
		}
	}

}
