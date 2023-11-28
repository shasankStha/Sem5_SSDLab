package lab5;

/**
 * 
 * @author ${Shasank Shrestha}
 * Driver class to create instance of ArrayProcessor and implement its method
 */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProcessor ap = new ArrayProcessor();
		int len = ap.getArrayLength(new String[] {"one","two","three"});
		System.out.println("Array length is "+len);
	}

}
