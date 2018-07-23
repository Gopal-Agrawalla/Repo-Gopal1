package my_test;

// A function can be called by using static keyword or object.

public class SampleFunction {

	public static void main(String[] args) {
		System.out.println("I am from main()");
		italy();
		System.out.println("I have executed italy");
		brazil();
		System.out.println("I have executed brazil");
		argentina();
		System.out.println("I have executed argentina");
	}

	static void italy() {
		System.out.println("I am from italy");
	}

	static void brazil() {
		System.out.println("I am from brazil");
	}

	static void argentina() {
		System.out.println("I am from argentina");
	}

}