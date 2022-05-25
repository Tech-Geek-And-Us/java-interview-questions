package interviewQuestions;

public class SwappingNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		swappingOutNumbers(a,b);

	}

	private static void swappingOutNumbers(int a, int b) {
		System.out.println("Values before swapping a = "+a + " and b = "+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Values after swapping a = "+a + " and b = "+b);
		
	}

}
