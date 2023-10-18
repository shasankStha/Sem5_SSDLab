package lab3;

import java.util.Random;


/**
 * 
 * @author ${Shasank Shrestha}
 *
 */
public class Driver {
	public static void main(String[] args) {
		final int VALUES = 10;

		Stats stats = new Stats(VALUES);

		Random random = new Random();

		for (int i = 0; i < VALUES; i++) {

			stats.addValue(random.nextInt(100));
		}

		System.out.println("Numbers stored : ");
		System.out.println(stats.toString());

		System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getCount());
		System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getMinimumValue());
		System.out.println("Maximum value = " + stats.getMaximumValue());
	}
}