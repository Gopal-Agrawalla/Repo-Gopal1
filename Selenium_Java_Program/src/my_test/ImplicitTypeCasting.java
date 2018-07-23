package my_test;

/*
  If the data types are compatible, then Java will perform the conversion automatically,
  known as Automatic Type Conversion and if not then they need to be casted or converted explicitly.
  Widening or Automatic Type Conversion takes place when two data types are automatically converted.
  This happens when:
  1. The two data types are compatible.
  2. When we assign value of a smaller data type to a bigger data type.
  
  Note: In java, the numeric data types are compatible with each other,
  but no automatic conversion is supported from numeric type to char or boolean.
  Also, char and boolean are not compatible with each other.
  
  Byte--> Short--> Int--> Long--> Float--> Double  
 */
public class ImplicitTypeCasting {

	public static void main(String[] args) {
		long a=2; //assigning an int value to a long variable.
		System.out.println(a); //2
}
}