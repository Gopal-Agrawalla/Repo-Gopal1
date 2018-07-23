package com.corejava;

/**
 * 
 * @author Sony
 *
 * String is a class in Java (different from primitive data types) so starts with capital S (String)
 * Frequently used methods are listed below.
 * 
 */

public class Java10StringProgram {

	public static void main(String[] args) {

		String sample = " Your Name ";
		String sample2 = "Agrawalla";
		System.out.println(sample.concat(":Gopal")); // This will print: Your Name:Gopal
		System.out.println("Verify the part of the string:" + sample.contains("Your")); //This will print: true
		System.out.println("Name after trim:" + sample.trim()); //Remove starting and ending space.
		// it compares char by char from starting of the String.
		System.out.println("Verify the string variable with the given string:" + sample2.equals("Agrawalla")); //Returns true
		System.out.println("Verify the string variable with the given string:" + sample2.equals("agrawalla")); //Returns false
		System.out.println("Return True:" + sample2.equalsIgnoreCase("agrawalla")); //Returns true
		System.out.println("Lenth of the string Agrawalla is:" + sample.length());
		System.out.println("To make all char to lower case:" + sample.toLowerCase());
		System.out.println("To make all char to upper case:" + sample.toUpperCase());
		System.out.println("Replace 1st occurance of the char:" + sample.replace("Y", "its "));
		System.out.println("Replace all occurance of the char:" + "agrawalla".replaceAll("a", "A"));
		
		String strArray[] = sample.split(" "); //split with delimiter and keep it into a string array.
		for (String strvar : strArray) {  //For each loop to print the String array.
			System.out.println(strvar);
		}
		//String strArray2[] = "28/12/2013".split("/");
		//String strArray2[] = "28/12/2013".split("/", 0); //Same as above 
		String strArray2[] = "28/12/2013".split("/", 2);
		//String strArray2[] = "28/12/2013".split("/", -5);
		for (String strvar2 : strArray2) {
			System.out.println(strvar2);
		}
	}
}