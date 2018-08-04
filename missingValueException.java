package lab03;

public class missingValueException extends RuntimeException {
	public missingValueException() {

	}

	public missingValueException(String message) {
		super(message);
	}
}
