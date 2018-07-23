package my_test;

/*
Write a program that involves both the concepts like overloading and overriding.
(Reflect both the concepts in the same program).
*/

class BaseClass {
	String sum(String e, String f) {
		System.out.println("Parent Class method executed");
		return e + f;
	}
}

public class Assignment4OverLoadingRiding extends BaseClass {

	int sum(int a, int b) {
		return a + b;
	}

	float sum(float c, float d) {
		return c + d;
	}

	String sum(String e, String f) {
		System.out.println("Child Class method executed");
		return e + f;
	}

	public static void main(String[] args) {

		BaseClass obj1 = new BaseClass();
		Assignment4OverLoadingRiding obj2 = new Assignment4OverLoadingRiding();

		// Parent class object creation and normal method execution
		String parentStringSum = obj1.sum("Kishore", "Kumar");
		System.out.println("Parent Class stringsum:" + parentStringSum);
		System.out.println("*******************************************");

		// Child class object creation and overloaded method execution
		int intSum = obj2.sum(2, 3);
		float floatSum = obj2.sum(1.5f, 2.5f);
		String stringSum = obj2.sum("Gopal", "Agrawalla");
		System.out.println("Chid Class intsum:" + intSum);
		System.out.println("Child Class floatsum:" + floatSum);
		System.out.println("Child Class stringsum:" + stringSum);
		System.out.println("*******************************************");

		// overriding method (base class object calling child class method)
		// obj2=obj1; //Error: parent class can't be assigned to child class
		obj1 = obj2; // child class can be assigned to parent class.
		System.out.println("Parent OR Child Class stringsum:" + obj1.sum("Shyam", "Sunder"));

	}

}
