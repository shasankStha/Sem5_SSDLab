package lab7;

import java.util.HashSet;
import java.util.Set;

/**
 * Class to manipulate a number of unique emails
 * @author ${Shasank Shrestha}
 *
 */
public class EmailStore {
	
	private Set<String> emailAddresses = new HashSet<>();
	
	/**
	 * To store email in the set
	 * @param email String value which gets stored in the set
	 * @return true if set did not already contain the email 
	 */
	public boolean addEmail(String email) {
		return emailAddresses.add(email);
	}
	
	/**
	 * To check if the email is in the set or not
	 * @param email String value to check if it is in set
	 * @return true if set already contain the email
	 */
	public boolean hasEmail(String email) {
		return emailAddresses.contains(email);
	}
	
	/**
	 * To display all the emails in set
	 */
	public void displayEmails() {
		for(String email: emailAddresses) {
			System.out.println(email);
		}
	}
}
