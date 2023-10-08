package lab2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		
//		Counter obj = new WordProcessor(); 			//upcasting | It is allowed to enhance flexibiity and scalability of Java code
		WordProcessor obj = new WordProcessor(); 
		obj.setText("Happy Birthday To You!!!");	//While using method that only exists in child class the datatype of the instances must be of child type
		System.out.print("Enter the sentence: ");
		String sentence = scan.nextLine();
		System.out.println("Number of Words: "+obj.countWords(sentence));
		System.out.println("Number of Letters: "+obj.countLetters(sentence));
		System.out.println("Total Length: "+obj.getLength(sentence));
	}

}
