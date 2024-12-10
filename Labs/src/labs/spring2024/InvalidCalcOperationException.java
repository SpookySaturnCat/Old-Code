package labs.spring2024;
/**
 * File: InvalidCalcOperationException.java
 * @author Christopher Williams, Seraphina Morrison, Taylor O'Neal
 * Created on: Apr 18, 2016
 * Modified: 02/23/24
 */
public class InvalidCalcOperationException extends Exception{

	private char operation;

	InvalidCalcOperationException() {
		super("Invalid Operation");
	}
	
	InvalidCalcOperationException(char c) {
		this();
		setOperation(c);
	}
	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	@Override
	public String getMessage() {
		return String.format("%s: %c was chosen", super.getMessage(), getOperation());
	}
}
