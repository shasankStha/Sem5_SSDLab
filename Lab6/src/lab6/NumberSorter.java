package lab6;

import java.util.Stack;

/**
 * Class to sort the numbers
 * @author ${Shasank Shrestha}
 *
 */
public class NumberSorter {
	
	/**
	 * To sort values in an specified order
	 * @param numbers arrays of integer values to be sorted
	 * @param ascending boolean value to determine to sort numbers in ascending or descending order
	 */
	void sort(int[] numbers, boolean ascending) {
		
		// The source stack, from which the numbers are popped
		Stack<Integer> srcStack = new Stack<Integer>();
		
		// The dest stack, to which the numbers are pushed
		Stack<Integer> destStack = new Stack<Integer>();
		
		
		// Add the initial array of numbers to the source stack.
		for (int number : numbers) {
			srcStack.push(number);
		}
		
		// bulk of code goes here (hint: use while loops rather than if’s)
		while(srcStack.size()>0) {
			Integer next = srcStack.pop();
			if(ascending) {
				while(destStack.size()>0 ) {
					if(destStack.peek()>next)
						srcStack.push(destStack.pop());
					else
						break;
				}
			}
			else {
				while(destStack.size()>0 ) {
					if(destStack.peek()<next)
						srcStack.push(destStack.pop());
					else
						break;
				}
			}
			destStack.push(next);
		}
		
		while(!destStack.isEmpty())
			System.out.print(destStack.pop()+", ");
		
		System.out.println();
	}
}
