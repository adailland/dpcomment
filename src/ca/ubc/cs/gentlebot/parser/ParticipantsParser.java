package ca.ubc.cs.gentlebot.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ca.ubc.cs.gentlebot.model.discussions.Discussion;
import ca.ubc.cs.gentlebot.model.discussions.DiscussionsFactory;
import ca.ubc.cs.gentlebot.model.discussions.Participant;

public class ParticipantsParser {

	private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private final File discussionFile;
	private final Discussion discussionObject;


	public ParticipantsParser(File discussionFile, Discussion discussionObject) {
		this.discussionFile = discussionFile;
		this.discussionObject = discussionObject;
	}

	public void parseParticipants() { 

		try {
			final ArrayList<String> participantNames = new ArrayList<>();
			final BufferedReader reader = new BufferedReader(new FileReader(discussionFile));
			final Pattern singleUsername = Pattern.compile("[>]{3}\\w+(-\\w+)*[,]{1}\\W\\w+(-\\w+)*$");
			String line;
			int begin, end;
			
			while ((line=reader.readLine())!=null){
				final Matcher m1 = singleUsername.matcher(line);
				if(m1.matches()){
					begin = line.indexOf(">");
					end = line.indexOf(",", begin);
					if(!participantNames.contains(line.substring(begin + 3, end))){
						participantNames.add(line.substring(begin + 3, end));
					}
				}
			}
			
			reader.close();
			log.fine("Creating participant objects in the discussion object");
			for (final String participantName : participantNames) {
				final Participant p = DiscussionsFactory.eINSTANCE.createParticipant();
				// make sure there is no whitespace
				p.setName(participantName.trim());
				log.fine("Adding participant " + p.getName() + " to the Discussion object");
				discussionObject.getParticipants().add(p);
			}
		} catch (final FileNotFoundException e) {
			log.severe(e.getMessage());
		} catch (final IOException e) {
			log.severe(e.getMessage());
		}
	}
}
