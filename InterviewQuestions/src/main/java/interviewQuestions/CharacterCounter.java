package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

	public static void main(String[] args) {
		String input_String = "this is a sample string";
		System.out.println(countCharacter(input_String));

	}

	private static Map<Character, Integer> countCharacter(String input) {
		Map<Character, Integer> temp_map = new HashMap<Character, Integer>();
		char[] temp_char_array = input.toCharArray();
		for (char temp_char : temp_char_array) {
			// if the occurrence is first time, we need to put that into map
			if (!temp_map.containsKey(temp_char) && !Character.isSpaceChar(temp_char)) {
				temp_map.put(temp_char, 1);
			}
			// if char is already available inside the map, we need to increase its
			// occurrence count
			else if (temp_map.containsKey(temp_char)) {
				int temp_value = temp_map.get(temp_char);
				temp_map.put(temp_char, temp_value + 1);
				temp_value = 0;

			}
		}
		return temp_map;

	}

}
