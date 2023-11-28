package lab5;
/**
 * 
 * @author ${Shasank Shrestha}
 * Class that is used to process an array
 */
public class ArrayProcessor {
	
	/**
	 * To get the number of elements in an array
	 * @param a Array of object type
	 * @return Size of the array
	 */
	int getArrayLength(Object [] a) {
//		return a.length;
		int count = 0;
		while(true) {
			try {
			Object t = a[count];
			count++;
			}
			catch(ArrayIndexOutOfBoundsException e){
				break;
			}
		}
		return count;
	}
}
