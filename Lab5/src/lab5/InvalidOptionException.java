package lab5;
/**
 * Exception class for invalid menu option
 * @author ${Shasank Shrestha}
 *
 */
@SuppressWarnings("serial")
public class InvalidOptionException extends Exception{
	/**
	 * Constructor for InvalidOptionException
	 * @param message Detail message for the exception
	 */
	InvalidOptionException(String message){
		super("Invalid menu option: "+message);
	}
}
