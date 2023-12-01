package lab7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * To provide a method for counting unique word within a sentence
 * @author ${Shasank Shrestha}
 *
 */
public class WordCounter {
	private final Map<String, Integer> wordMap = new HashMap<>();
	
	/**
	 * To store/count words in the map
	 * @param word String values to store in map
	 */
	public void addWord(String word) {
		if(wordMap.containsKey(word)) 
			wordMap.put(word, wordMap.get(word) + 1);
		else 
			wordMap.put(word,1);
	}
	
	/**
	 * To add words from sentence in the map
	 * @param sentence String seperated by spaces
	 */
	public void addSentence(String sentence) {
		String[] words = sentence.split(" ");
		for(String word : words)
			addWord(word);
	}
	
	/**
	 * Display each word in the map and its occurence
	 */
	public void outputResults() {
		for(Entry<String, Integer> entry: wordMap.entrySet())
			System.out.println(entry.getKey()+" : "+entry.getValue());
	}

}
