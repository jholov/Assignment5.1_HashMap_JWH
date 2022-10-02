import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * This class separates words and their definition from a file
 * and stores them in a hashmap
 * @author Jake Holovka
 *
 */

public class dictionaryApp {

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("DictionaryWordValuePairs2.txt");
		
		BufferedReader myRead = new BufferedReader(new FileReader(file));
		String line;	
		Dictionary definitions = new Dictionary();
		
		//splitting the string and adding it to the hashmap
		try {
			while((line = myRead.readLine()) != null)
				{
				String[] split = line.split(":");
				definitions.addDefinition(split[0], split[1]);
				}
			} catch (IOException e) 
				{
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
		//printing the unsorted Dictionary Hashmap
		definitions.printDictionary();
		
		System.out.println("\n End Entire Dictionary  \n");
		
		//Searching for words and returning their definition and hashkey
		System.out.println(definitions.getDefinition("shrift"));
		
		System.out.println(definitions.getDefinition("mage"));
		
		System.out.println(definitions.getDefinition("yclept"));
		
		System.out.println(definitions.getDefinition("behold"));
		
		System.out.println(definitions.getDefinition("corse"));
		
	}//end main

}//end class
