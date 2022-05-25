package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		String input = "this is sample String to reverse";
		reverseFunction(input);

	}

	private static void reverseFunction(String input) {
		char [] input_string = input.toCharArray();
		for (int i = input_string.length-1;i >= 0 ; i--) {
			System.out.print(input_string[i]);
		}
		
	}

}
