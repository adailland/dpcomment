package cross.feature;

public class FeaturesInDP {

	private String projectName;
	
	private int numberDP;
	
	public int getNumberDP() {
		return numberDP;
	}

	public void setNumberDP(int numberDP) {
		this.numberDP = numberDP;
	}

	//author-process
	private String authorName;
	private int authorDI;
	private int authorNopublished;
	private boolean isAuthorProjMem;
	private boolean isInvited;
	
	public boolean isInvited() {
		return isInvited;
	}

	public void setInvited(boolean isInvited) {
		this.isInvited = isInvited;
	}

	//paragraph position
	private int positionInPost;
	private int positionInPR;
	private boolean replayOriginalPost;
	
	
	
	//Textual Content
	private String textualContent;
	
	//Word
	private int numberWords;
	private boolean hasCapitalizedWord;
	private boolean hasShould;
	private boolean hasHow;
	private boolean hasWhat;
	private boolean hasWhy;
	private boolean hasCan;
	private boolean hasMay;
	private int numberQuestionmark;	
	
	//sentiment
	private int sentimentScore;
	
	//label
	private boolean  hasDecisions;
	
	//id comment
	//private int idComment;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAuthorDI() {
		return authorDI;
	}

	public void setAuthorDI(int authorDI) {
		this.authorDI = authorDI;
	}

	public int getAuthorNopublished() {
		return authorNopublished;
	}

	public void setAuthorNopublished(int authorNopublished) {
		this.authorNopublished = authorNopublished;
	}

	public boolean isAuthorProjMem() {
		return isAuthorProjMem;
	}

	public void setAuthorProjMem(boolean isAuthorProjMem) {
		this.isAuthorProjMem = isAuthorProjMem;
	}

	public int getPositionInPost() {
		return positionInPost;
	}

	public void setPositionInPost(int positionInPost) {
		this.positionInPost = positionInPost;
	}

	public int getPositionInPR() {
		return positionInPR;
	}

	public void setPositionInPR(int positionInPR) {
		this.positionInPR = positionInPR;
	}

	public boolean isReplayOriginalPost() {
		return replayOriginalPost;
	}

	public void setReplayOriginalPost(boolean replayOriginalPost) {
		this.replayOriginalPost = replayOriginalPost;
	}

	public String getTextualContent() {
		return textualContent;
	}

	public void setTextualContent(String textualContent) {
		this.textualContent = textualContent;
	}

	public int getNumberWords() {
		return numberWords;
	}

	public void setNumberWords(int numberWords) {
		this.numberWords = numberWords;
	}

	public boolean isHasCapitalizedWord() {
		return hasCapitalizedWord;
	}

	public void setHasCapitalizedWord(boolean hasCapitalizedWord) {
		this.hasCapitalizedWord = hasCapitalizedWord;
	}

	public boolean isHasShould() {
		return hasShould;
	}

	public void setHasShould(boolean hasShould) {
		this.hasShould = hasShould;
	}

	public boolean isHasHow() {
		return hasHow;
	}

	public void setHasHow(boolean hasHow) {
		this.hasHow = hasHow;
	}

	public boolean isHasWhat() {
		return hasWhat;
	}

	public void setHasWhat(boolean hasWhat) {
		this.hasWhat = hasWhat;
	}

	public boolean isHasWhy() {
		return hasWhy;
	}

	public void setHasWhy(boolean hasWhy) {
		this.hasWhy = hasWhy;
	}

	public boolean isHasCan() {
		return hasCan;
	}

	public void setHasCan(boolean hasCan) {
		this.hasCan = hasCan;
	}

	public boolean isHasMay() {
		return hasMay;
	}

	public void setHasMay(boolean hasMay) {
		this.hasMay = hasMay;
	}

	public int getNumberQuestionmark() {
		return numberQuestionmark;
	}

	public void setNumberQuestionmark(int numberQuestionmark) {
		this.numberQuestionmark = numberQuestionmark;
	}

	public int getSentimentScore() {
		return sentimentScore;
	}

	public void setSentimentScore(int sentimentScore) {
		this.sentimentScore = sentimentScore;
	}

	public boolean isHasDecisions() {
		return hasDecisions;
	}

	public void setHasDecisions(boolean hasDecisions) {
		this.hasDecisions = hasDecisions;
	}
	
	/*public int getIdComment(){
		return idComment;
	}
	
	public void setIdComment(int idComment){
		this.idComment = idComment;
	}*/

	 
	
	
	
}
