package lab2;

public class WordProcessor implements Counter{
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String check(String sentence) {
		if (sentence.isEmpty())
			return text;
		else
			return sentence;
		
	}

	@Override
	public int countWords(String sentence) {
		// TODO Auto-generated method stub
		sentence = check(sentence);
		return sentence.split(" ").length;
	}

	@Override
	public int countLetters(String sentence) {
		// TODO Auto-generated method stub
		sentence = check(sentence);
		int count = 0;
		for(int i=0;i<sentence.length();i++) {
			if(Character.isLetter(sentence.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int getLength(String sentence) {
		// TODO Auto-generated method stub
		sentence = check(sentence);
		return sentence.length();
	}

}
