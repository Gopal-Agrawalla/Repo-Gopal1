package my_test;

/*
By default instance variables and methods are of type default. 
An instance variable can be accessed by a class instance i.e. object of that class.
 */

public class InstanceVariable {

	int a, b;  //instance variable
	
	void display(){  //instance method
		System.out.println("Display Method Called.");
	}
	
	public static void main(String[] args) {
		InstanceVariable obj1 = new InstanceVariable();
		obj1.a=10;
		obj1.b=20;
		obj1.display();
		System.out.println("Value of A:" + obj1.a);
		System.out.println("Value of B:" + obj1.b);
	}

}
