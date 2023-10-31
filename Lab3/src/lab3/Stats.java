/**
 * Lab 3 Assingment
 */
package lab3;

import java.util.Arrays;

/**
 * 
 * Contains a number of method to get the different values from an array.
 * @author ${Shasank Shrestha}
 */
public class Stats {
	
	private int[] numbers;
	private int count;

	/**
	 * To add the integer value to the array
	 * @param value is added at the last index to the array numbers
	 */
	public void addValue(int value) {
		numbers[count] = value;
		count++;	//After the value is added count is increased by 1 
	}

	/**
	 * To get the length of array
	 * @return the length of array
	 */
	public int getCount() {
		return numbers.length;
	}

	/**
	 * To get the maximum value from array
	 * @return the mamimum value from the array
	 */
	public int getMaximumValue() {

		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}

		return max;
	}

	/**
	 * To get the minimum value from array
	 * @return the minimum value from the array
	 */
	public int getMinimumValue() {
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < min)
				min = numbers[i];
		}

		return min;
	}

	/**
	 * To get the total sum of all numbers of array
	 * @return the sum of all numbers of the array
	 */
	public int getTotal() {

		int total = 0;

		// total all values within the array
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}

	/**
	 * To get the average value from array
	 * @return the average value from the array
	 */
	public double getAverage() {

		int x = 0;
		for (int i = 0; i < numbers.length; i++) {
			x += numbers[i];
		}

		double y = x / (double) numbers.length;

		return y;
	}
	
	@Override
	/**
	 * Returns a string representation of the contents of the array
	 * 
	 */
	public String toString() {
		return Arrays.toString(numbers); 
	}

	/**
	 * Determine the size of array
	 * @param capacity sets the size of array
	 */
	public Stats(int capacity) {
		numbers = new int[capacity];
	}

}