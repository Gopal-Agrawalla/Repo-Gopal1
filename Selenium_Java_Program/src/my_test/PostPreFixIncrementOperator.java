package my_test;

public class PostPreFixIncrementOperator {

	public static void main(String[] args) {
		
		int a, b, x=10, y=20;
		a=x*y;
		b=x*y++;
		System.out.println("Post Fix: The value of a and b are: " + a + "  " + b);
				 
		x=10; y=20;
		a=x*y;
		b=x*++y;    //here the increment will happened first then multiplication.
		System.out.println("Pre Fix: The value of a and b are: " + a + "  " + b);
	}

}
