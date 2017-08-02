package ca.ubc.cs.gentlebot.parser;

/**
 * Thrown when a Relationship annotation points to a non existent DP
 * 
 * @author famelis
 *
 */
public class UnknownTargetDPException extends Exception {
	private static final long serialVersionUID = 1L;

	public UnknownTargetDPException(String msg) {
		super(msg);
	}
}
