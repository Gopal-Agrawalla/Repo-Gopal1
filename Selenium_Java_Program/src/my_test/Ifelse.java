package my_test;

public class Ifelse {

	public static void main(String[] args) {

		// as per the value of name and a, corresponding output will be shown in
		// console.
		String name = "Papa";
		boolean a = false;

		if (a)
			System.out.println("The value of a is:" + a);

		else
			System.out.println("The value of a is:" + a);

		if (name == "Gopal") {
			System.out.println("If STMT: Name is:" + name);
		}

		else if (name == "Papa") {
			System.out.println("else if STMT : Name is:" + name);
		}

		else {
			System.out.println("else STMT : Enter a valid name");
		}
	}

}
