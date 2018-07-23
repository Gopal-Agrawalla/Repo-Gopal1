package my_test;

/*
A static method can be called without an object created.
Non static method can be accessed by using object of the class.
 */
public class FunctionWithParameter {
	
	static int calsum(int x, int y)// 2,3
	{
		int w;
		w = x + y;
		return w;
	}

	public static void main(String[] args) {
		int a = 2, b = 3, sum;
		sum = calsum(a, b); // 5  
		System.out.println("The result is:" + sum);
	}

}