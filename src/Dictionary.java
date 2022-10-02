import java.util.HashMap;
/**
 * This class stores definitions to a hashmap
 * allowing you to print and search for them
 * @author Jake Holovka
 *
 */

public class Dictionary {

	private HashMap<String, String> dictionaryMap;
	/**
	 * empty-argument constructor that instantiates a hashmap
	 */
	public Dictionary() {
	
		dictionaryMap = new HashMap<String, String>();
		
	}//end empty-argument constructor
	/**
	 * Adds a word and the following definition 
	 * to the hashmap
	 * @param word
	 * @param definition
	 */
	public void addDefinition(String word, String definition) {
		dictionaryMap.put(word,definition );
		
	}//end addDefinition
	/**
	 * Searches through the hashmap to find
	 * the word entered when called
	 * @param Word
	 * @return
	 */
	public String getDefinition(String Word)	{
		return Word+"-" +dictionaryMap.get(Word)+" #" + Word.hashCode();
	}//end getDefinition
	/**
	 * Prints out the entire dictionary along with its hashcodes
	 */
	public void printDictionary() {
		for (String key:dictionaryMap.keySet()) {
			System.out.println(getDefinition(key));
		}//end forloop
		
	}//end printDictionary
	
}//end class
