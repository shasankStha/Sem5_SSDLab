package lab2;

public class WordProcessor implements Counter{
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	/**
	 * Checks whether the sentence is empty or not
	 */
	public String check(String sentence) {
		if (sentence.isEmpty())
			return text;
		else
			return sentence;
		
	}

	/**
	 * Splits the sentence and returns the number of words
	 */
	@Override
	public int countWords(String sentence) {
		// TODO Auto-generated method stub
		sentence = check(sentence);
		return sentence.split(" ").length;
	}

	/**
	 * Counts and returns the number of letters(Doesn't includes spaces or other special character)
	 */
	@Override
	public int countLetters(String sentence) {
		// TODO Auto-generated method stub
		sentence = check(sentence);
		int count = 0;
		for(int i=0;i<sentence.length();i++) { 
			if(Character.isLetter(sentence.charAt(i)/*returns the character at given number of index*/)) {//Checks whether the character in letter or not
				count++;
			}
		}
		return count;
	}

	/**
	 * Counts and returns total length of the sentence
	 */
	@Override
	public int getLength(String sentence) {
		// TODO Auto-generated method stub
		sentence = check(sentence);
		return sentence.length();
	}

}
