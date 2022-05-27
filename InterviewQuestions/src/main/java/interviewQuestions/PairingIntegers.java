package interviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairingIntegers {

	public static void main(String[] args) {
		int[] inputArray = { 1, 8, 9, 3, 2, 6, 5, 4, 0, 7 };
		int mean = 3;
		System.out.println(paringSumIntegers(inputArray, mean));
		// {0,5,1,4,2,3,3,2}
	}

	private static List<Integer> paringSumIntegers(int[] inputArray, int mean) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		List<Integer> temp_list = new ArrayList<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == mean) {
					temp_list.add(inputArray[i]);
					temp_list.add(inputArray[j]);
					map.put(inputArray[i], inputArray[j]);
				}
			}

		} 
		System.out.println(map);
		return temp_list;

	}

}
