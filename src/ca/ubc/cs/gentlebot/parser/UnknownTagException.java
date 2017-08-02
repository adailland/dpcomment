package ca.ubc.cs.gentlebot.parser;

public class UnknownTagException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public UnknownTagException(String msg){
		super(msg);
	}

}
