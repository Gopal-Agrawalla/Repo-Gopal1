package com.corejava;

public class Java11ConditionalStatement {

	public static void main(String[] args) {

		// If statement
		if ("GOPAL".equals("Gopal")) {
			System.out.println("Both the string are same");
		}

		// If else statement
		if ("GOPAL".equals("Gopal")) {
			System.out.println("Both the strings are same");
		}

		else {
			System.out.println("Both the strings are not same");
		}

		// If else ladder
		if ("GOPAL".equals("Gopal")) {
			System.out.println("Both the strings are same");
		}

		else if ("GOPAL".equals("Gopal".toUpperCase())) {
			System.out.println("Both the strings are same");
		}

		else if ("GOPAL".equals("Gopal".toLowerCase())) {
			System.out.println("Both the strings are same");
		}

		else {
			System.out.println("Both the strings are not same");
		}

		// Nested if else
		int a = 10, b = 20;
		if (a != b) {
			if (a > b) {
				System.out.println("Value of a is greater than b");
			} else {
				System.out.println("Value of a is smaller than b"); 
			}
		}

		//do while: execute once even if the conditions false.
		int i=0;
		do{
			System.out.println("Value of i is:"+ i);
			i++;
		} while(i<=10);

		System.out.println("Value of i in outer loop:" + i); // Value of I is showing 1, it should be 0. 

		//while: it will execute the block if the condition is true.
		i=10;
		while(i>=10){ // this loop will print only once i as 10
			System.out.println("Value of i is:"+ i);
			i-=1;
		}

/**
* Once a case is matched and after that no break statement then all case
* will be get executed till it finds next break statement.		
*
**/
		switch ("Chrome") {

		default:    //Default can be kept anywhere, not like always at last.
			System.out.println("FF Browser");
			break;
			
		case "IE":
			System.out.println("IE Browser");
			break;  

		case "FF":
			System.out.println("FF Browser");
			break;

		case "Chrome":
			System.out.println("Chrome Browser");
			break;
		}
	}
}
