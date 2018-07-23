package my_test;

/*
 Static methods and variables can be accessed 3 ways mentioned below.
 */
public class StaticMethodAndVariable {

	static int a = 10;

	static void display() {
		System.out.println("Static Method Called");
	}
	
	void normalMethod(){
		System.out.println("Normal Method Called");	
	}

	public static void main(String[] args) {

		 // First Way
		 StaticMethodAndVariable obj1 = new StaticMethodAndVariable();
		 obj1.a=20;
		 obj1.display();
		 System.out.println("Value of static variable A is:" + obj1.a);
		 obj1.normalMethod();

		// //Second Way
		// a=20;
		// display();
		// System.out.println("Value of static variable A is:" + a);

		// // Third Way
		// StaticMethodAndVariable.a = 20;
		// StaticMethodAndVariable.display();
		// System.out.println("Value of static variable A is:" + StaticMethodAndVariable.a);

		
	}

}
