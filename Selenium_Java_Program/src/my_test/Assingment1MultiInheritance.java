package my_test;

/*
 Sample Program Of Multilevel Inheritance
 */

class Parent {
	String name;
	int age;
	//System.out.println("I am from Parent Class");  //showing error, this can be executed inside a method.
}

class Child extends Parent {
	String fathersName;
	
}

class GrandChild extends Child {
	String grandFathersName;
}

class Assingment1MultiInheritance extends GrandChild{

	public static void main(String[] args) {
		Assingment1MultiInheritance obj = new Assingment1MultiInheritance();
		obj.name = "Vijay";
		obj.age = 20;
		obj.fathersName = "Praveen";
		obj.grandFathersName = "Vamsi";
		System.out.println("My Name:" + obj.name);
		System.out.println("My Age:" + obj.age);
		System.out.println("Father's Name:" + obj.fathersName);
		System.out.println("Grand Father's Name:" + obj.grandFathersName);
		System.out.println("");

	}
}
