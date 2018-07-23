package my_test;

/*
Difference Between Constructor and Method.
Constructor-no return type(not void even), class name=constructor name
Constructor will get called as soon as the object created, where as method can be called after object creation.
JVM will create default constructor if programmer have not created one.
Constructor can be private, public and protected, you can also overload them.
 */
public class Constructor {

	Constructor() {

		System.out.println("Parameter Less Constructor Method Called.");
	}
	
	Constructor(String name){
		name = "Agrawalla";
		System.out.println("Parameterized Constructor Method Called:" + name);
	}
	

	public static void main(String[] args) {

		//Constructor obj = new Constructor();
		Constructor obj = new Constructor("Gopal");
	}

}
