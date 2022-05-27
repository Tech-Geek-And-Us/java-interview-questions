package interviewQuestions;

public class ReverseStringAdvance {

	public static void main(String[] args) {
		
		String input = "reverse this using String Buffer";
		StringBuffer stringBuffer = new StringBuffer(input);
		System.out.println(stringBuffer.reverse());
		String input_builder = "reverse this using String Builder";
		StringBuilder stringBuilder = new StringBuilder(input_builder);
		System.out.println(stringBuilder.reverse());
		

	}

}
