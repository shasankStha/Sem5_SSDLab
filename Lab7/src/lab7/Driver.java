package lab7;

/**
 * To create instance of EmailStore and WordCounter class and implement its methods
 * @author ${Shasank Shrestha}
 *
 */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailStore es = new EmailStore();
		
		System.out.println(es.addEmail("sasan.stha@gmail.com"));
		System.out.println(es.addEmail("rabi.thapa@gmail.com"));
		System.out.println(es.addEmail("ayushkc.ayushkc@gmail.com"));
		System.out.println(es.addEmail("anil.acharya@gmail.com"));
		System.out.println(es.addEmail("sasan.stha@gmail.com"));
		
		System.out.println(es.hasEmail("sasan.stha@gmail.com"));
		System.out.println(es.hasEmail("shasankstha12@gmail.com"));
		
		es.displayEmails();
		
		WordCounter ws = new WordCounter();
		ws.addSentence("This sentence has the word has in it twice");
		ws.outputResults();
	}

}
