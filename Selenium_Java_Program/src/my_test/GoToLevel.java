package my_test;

/*
 Unlike C/C++, Java does not have goto statement, but java supports label.
 The only place where a label is useful in Java is right before nested loop statements.
 We can specify label name with break to break out a specific outer loop.
 Similarly, label name can be specified with continue.
 */

/*
//file name: Main.java
public class Main {
public static void main(String[] args) {    
outer: //label for outer loop
for (int i = 0; i < 10; i++) { 
 for (int j = 0; j < 10; j++) {
   if (j == 1)
     break outer;
   System.out.println(" value of j = " + j);
 }
} //end of outer loop
} // end of main()
} //end of class Main
*/

//public class GoToLevel {
//	public static void main(String a[])	{
//		
//	int n=4;
//
//	if(n%2==0)
//	{
//		goto even;
//	}
//	else
//	{
//		goto odd;
//	}
//	
//	odd:
//		System.out.println("The number is odd");
//	
//	even: 
//		System.out.println("The number is even");
//	}
//}