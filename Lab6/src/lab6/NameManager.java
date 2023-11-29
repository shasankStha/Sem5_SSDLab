package lab6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author ${Shasank Shrestha}
 * Class to manage names
 */
public class NameManager {
	List<String> names = new ArrayList<>();
	
	/**
	 * 
	 * @param name To store name in ArrayList 
	 * To add name in names ArrayList
	 */
	public void addName(String name) {
		names.add(name);
	}
	
	/**
	 * To print all the name in the ArrayList
	 */
	public void printNames() {
		for(String name: names) {
			System.out.println(name);
		}
	}
	
	/**
	 * To remove name which are longer than 15 characters
	 */
	public void removeLongNames() {
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String i = it.next();
			if(i.length()>15) {
				it.remove();
			}
		}
	}
}
