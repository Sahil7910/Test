package NumericPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		printDuplicateElement("programming");
		printDuplicateElement("java");

	}

	private static void printDuplicateElement(String word) {
		// TODO Auto-generated method stub
		char[] characters = word.toCharArray();
		
		Map<Character, Integer> charmap= new HashMap<Character,Integer>();
		
			for(Character ch: characters) {
				if(charmap.containsKey(ch)) {
					charmap.put(ch, charmap.get(ch)+1);
				}else {
					charmap.put(ch, 1);
				}
			}
			
			Set<Map.Entry<Character, Integer>> entrySet = charmap.entrySet();
			System.out.printf("List of duplicate characters in String '%s' %n", word);
			for (Map.Entry<Character, Integer> entry : entrySet)
			{
				if (entry.getValue() > 1) 
				{
					System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
					}
				}

			
	}
	
	
}
