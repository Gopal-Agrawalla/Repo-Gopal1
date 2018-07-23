package my_pkg;

public class StudentPackage {

	public void display() { // public keyword is required to access in another package.
		
		System.out.println("I am inside package PackageExample");
	}

	public void join() {

		System.out.println("One Student joined.");
	}

	public void tutionFees() {

		System.out.println("Tution fees per student is: 5K");
	}

}