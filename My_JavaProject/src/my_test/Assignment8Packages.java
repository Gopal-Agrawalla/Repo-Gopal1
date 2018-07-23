package my_test;

import my_pkg.StudentPackage;

public class Assignment8Packages {

	public static void main(String[] args) {

		// my_pkg.StudentPackage obj = new my_pkg.StudentPackage(); //without
		// import this is the way instantiate an object.
		StudentPackage student1 = new StudentPackage();
		student1.display();
		student1.join();
		student1.tutionFees();
	}
}
