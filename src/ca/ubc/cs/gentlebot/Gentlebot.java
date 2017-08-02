package ca.ubc.cs.gentlebot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import ca.ubc.cs.GentleLogger;
import ca.ubc.cs.gentlebot.model.discussions.Discussion;
import ca.ubc.cs.gentlebot.parser.DiscussionParser;
import ca.ubc.cs.gentlebot.query.InstanceComputer;
import ca.ubc.cs.gentlebot.util.FileManager;

public class Gentlebot {

	private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private static String PATH_TO_CODED_DICSUSSIONS;
	private static String PATH_TO_CODED_DICSUSSIONS_ANNOTATED;
	private static String DISCUSSION_FILE_EXTENSION;

	private static String OUTPUT_FOLDER;
	private static String ARFF_FILE;

	public static String ANNOTATION_PREFIX;


	public static final Level LOGGING_LEVEL = Level.WARNING;


	public Gentlebot() {

		// Read the input properties
		final Properties properties = new Properties();
		final String propFileName = "/config.properties";
		final InputStream inputProperties = Gentlebot.class.getClass().getResourceAsStream(propFileName);
		if (inputProperties == null) {
			System.err.println("Could not locate properties file");
			return;
		}
		try {
			properties.load(inputProperties);
			PATH_TO_CODED_DICSUSSIONS = properties.getProperty("path_to_coded_discussions");
			PATH_TO_CODED_DICSUSSIONS_ANNOTATED = properties.getProperty("path_to_coded_discussions_annotated");
			DISCUSSION_FILE_EXTENSION = properties.getProperty("discussion_file_extension");
			OUTPUT_FOLDER = properties.getProperty("output_folder");
			ARFF_FILE = properties.getProperty("arff_file_out");
			ANNOTATION_PREFIX = properties.getProperty("annotation_prefix");
		} catch (final IOException e) {
			log.severe("Failed to load properties from file");
			return;
		}

		// Set up the logger
		try {
			GentleLogger.setup();
			log.setLevel(LOGGING_LEVEL);
		} catch (final IOException e) {
			e.printStackTrace();
		}

		try {
			final List<File> allDiscussions = FileManager.getAllDiscussions(PATH_TO_CODED_DICSUSSIONS,
					DISCUSSION_FILE_EXTENSION);
			final List<File> allDiscussionsAnnotated = FileManager.getAllDiscussions(PATH_TO_CODED_DICSUSSIONS_ANNOTATED,
					DISCUSSION_FILE_EXTENSION);
			allDiscussions.addAll(allDiscussionsAnnotated);
			for (final File aDiscussion : allDiscussions) {
				
				log.info("Working with file: " + aDiscussion.getAbsolutePath());
				final String fileName = aDiscussion.getName();
				
				log.info("Parsing the discussion");
				final DiscussionParser dp = new DiscussionParser(aDiscussion);
				final Discussion d = dp.getDiscussionModel();
				log.info("Computing instance metadata");
				final InstanceComputer computer = new InstanceComputer(d);
				final Discussion updatedDiscussion = computer.computeInstances();

				log.info("Writing ARFF file at: " + OUTPUT_FOLDER + "/" + fileName + "_" + ARFF_FILE);
				final FileWriter arffout = new FileWriter(OUTPUT_FOLDER + "/" + fileName + "_" + ARFF_FILE);
				arffout.write(updatedDiscussion.toARFF());
				arffout.close();

			}
		} catch (final IOException e) {
			log.severe(e.getMessage());
		}

	}

}