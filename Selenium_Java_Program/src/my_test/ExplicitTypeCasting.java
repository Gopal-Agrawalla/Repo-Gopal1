package my_test;

/*
Narrowing or Explicit Conversion
If we want to assign a value of larger data type to a smaller data type we perform explicit type casting or narrowing.
This is useful for incompatible data types where automatic conversion cannot be done.
Here, target-type specifies the desired type to convert the specified value to.

Double--> Float--> Long--> Int--> Short--> Byte
 */

public class ExplicitTypeCasting {

	public static void main(String[] args) {

		System.out.println("The result is:" + (5 / 2)); // 2
		System.out.println("The result is:" + (float) 5 / 2); // int to float
		System.out.println("The result is:" + (char) 65);
	}
}