package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCounterFromString {
	
	public static void main(String args[]) {
		
		String str= "Hi this is Jaydeep Sannake";
		
		Map<Character, Integer> numbers= new HashMap<Character, Integer>();
		
		
		numbers=str.trim().toLowerCase().chars().boxed()
				.collect(Collectors.toMap(
						k -> Character.valueOf((char) k.intValue()),
						v->1, 
						Integer::sum));
		
		System.out.println("numbers ==> " +numbers);
		
	}

}
