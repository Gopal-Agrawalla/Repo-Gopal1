package my_test;

// Wrapping of data and sub parts into single unit. Example is class.
//when more than one class present in one file, the file name should be the class name where main method is written.

public class EncapsulationExample {
	private int a = 2, b = 3;

	private void display() {
		System.out.println("Hello from EncapsulationExample class");
	}
}

class owncap {
	public static void main(String[] args) {
		EncapsulationExample oe = new EncapsulationExample();
		// oe.a=10; //a is the private member of EncapsulationExample class, can't be access directly.
		// oe.b=20;
		// oe.display(); //display is the private member of EncapsulationExample
	}

}
