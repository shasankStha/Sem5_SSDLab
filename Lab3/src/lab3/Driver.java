/**
 * Lab 3 Assingment
 */
package lab3;

import java.util.Random;


/**
 * 
 * Creates an object of Stats class and calls methods.
 * @author ${Shasank Shrestha}
 */
public class Driver {
	/**
	 * 
	 * @param args accepts command line arguments as parameters in an String array format
	 */
	public static void main(String[] args) {
		final int VALUES = 10; //Constant value for the size of array

		Stats stats = new Stats(VALUES); // Create a Stats object with the specified VALUES (Assuming VALUES is an integer variable)

		Random random = new Random(); // Create a Random object for generating random numbers

		// Generate and add random number to the Stats object 'VALUES' times
		for (int i = 0; i < VALUES; i++) {

			stats.addValue(random.nextInt(100));
		}

		System.out.println("Numbers stored : ");
		System.out.println(stats.toString()); // Print the array stored in the Stats object

		System.out.println("Average = " + stats.getAverage()); // Print the average of the stored numbers
		System.out.println("Count = " + stats.getCount()); // Print the count (number of values) stored in the Stats object
		System.out.println("Total = " + stats.getTotal()); // Print the total (sum) of the stored numbers
		System.out.println("Minimum value = " + stats.getMinimumValue()); // Print the minimum value among the stored numbers
		System.out.println("Maximum value = " + stats.getMaximumValue()); // Print the maximum value among the stored numbers
	}
}