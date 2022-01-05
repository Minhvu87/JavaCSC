package Lession7;

public class Dictionary implements Comparable<Dictionary> {
	String word;
	String meaning;
	public Dictionary() {
		
	}
	public Dictionary(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	@Override
	public int compareTo(Dictionary o) {
		return this.word.compareTo(o.word);
	}
	
}
