package my_test;

/*
 Create a class student with private variables and methods.
 Try to access its private members from another class.
 */

public class Assingment3EncapPvt {

	private String name;
	private int age;
	private float salary;  

	private void displayData(String a, int b, float c) {
		System.out.println("Name:" + a + " " + "Age:" + b + " " + "Salary:" +" " + c);
	}
	public static void main(String[] args) {

		Assingment3EncapPvt CP = new Assingment3EncapPvt();
		CP.displayData("Ram", 20, 30000);
	}
}


/*
// In one java file one and only one public class file can be present.
 
class ClassPrivate {    //with public access specifier showing error why?
  	private String name;
	private int age;
	private float salary;  

	private void displayData(String a, int b, float c) {
		System.out.println("Name:" + a + " " + "Age:" + b + " " + "Salary:" +" " + c);
	}
}
 
 public class Assingment3EncapPvt {
 public static void main(String[] args) {
 
 	ClassPrivate CP = new ClassPrivate();
 	CP.displayData("Ram", 20, 20000); // showing correct error message: method is not visible
 	}
 }
*/