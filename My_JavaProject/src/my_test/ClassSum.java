package my_test;

public class ClassSum {

	public static void main(String[] args) {

		int a = 10, b = 20;
		// a = 10;
		// b = 20;
		// int c= a+b;
		System.out.println("Sum of a and b:" + (a + b));

		// The below line will not go to next line.
		System.out.print("Gopal \n");

		// Ternary Comparison
		System.out.println("Smaller Value is:" + ((a < b) ? a : b));
		System.out.println("Bigger Value is:" + ((a > b) ? a : b));

	}

}
