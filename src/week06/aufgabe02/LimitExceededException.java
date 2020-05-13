package week06.aufgabe02;

public class LimitExceededException extends Exception {

	private static final long serialVersionUID = 1L;

	public LimitExceededException(String message) {
		super(message);
	}
}
