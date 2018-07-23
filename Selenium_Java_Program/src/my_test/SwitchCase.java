package my_test;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );
		SwitchCase sc = new SwitchCase();
		String funName= "fun1";
		 
// expression of switch case will be: Char, String, Byte		
		switch (funName)
		{

		case "fun1" :
			sc.fun1();
			break;
		
		case "fun2" :
			sc.fun2();
			break;
			
		default : 
			System.out.println( "Incorrect Input");
		}
		}
		void fun1(){
			
			System.out.println( "Inside Function One" );
		}
		void fun2(){
			
			System.out.println( "Inside Function Two" );
	}
}


/*
class sw
{
public static void main(String aa[])
{

int a=2,b=3,c;
char ch='*';

System.out.println("Arithmetic operations");

switch(ch)//*
{
 case '+':
        c=a+b;
        System.out.println("The result is "+c);
        break;
case '-':
        c=a-b;
        System.out.println("The result is "+c);
        break;
case '*':
        c=a*b;
        System.out.println("The result is "+c);
        break;
case '/':
        c=a/b;
        System.out.println("The result is "+c);
        break;
}
}
}
*/