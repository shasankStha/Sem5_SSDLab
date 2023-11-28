package lab5;

/**
 * 
 * @author ${Shasank Shrestha}
 * Driver class to create instance of ArrayProcessor and Menu and implement their method
 */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProcessor ap = new ArrayProcessor();
		int len = ap.getArrayLength(new String[] {"one","two","three"});
		System.out.println("Array length is "+len);
		
		Menu m = new Menu();
		try {
			m.displayMenuOption(1);
			m.displayMenuOption(2);
			m.displayMenuOption(0);
		} catch (InvalidOptionException e) {
			System.out.println(e.getMessage());
		}
	}

}
