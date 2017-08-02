package ca.ubc.cs.gentlebot.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

	
	/**
	 * Find all files that contain discussions in a given folder.
	 * @param path of the folder in which discussions are located
	 * @param extension of Discussion files
	 * @return a list of Discussion files
	 */
	public static List<File> getAllDiscussions(String path, String extension){
		ArrayList<File> ret = new ArrayList<File>();
		try {
			Files.walk(Paths.get(path)).forEach(filePath -> {
			    if (Files.isRegularFile(filePath)) 
			    	if(filePath.toString().toLowerCase().endsWith("."+extension))
			    		ret.add(filePath.toFile());
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ret;
	}

}
