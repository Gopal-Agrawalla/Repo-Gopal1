package my_test;

public class Assignment11StaticBlockAndCMD {

	int multiplyThree(int a, int b, int c) {

		return a * b * c;
	}
	
// Static blocks are get executed before main method and as per top down sequence. 
	static {
		System.out.println("Please enter 3 integer numbers:");
	}

	public static void main(String[] args) {

		Assignment11StaticBlockAndCMD obj = new Assignment11StaticBlockAndCMD();
		int result, var1, var2, var3;
		var1 = Integer.parseInt(args[0]);
		var2 = Integer.parseInt(args[1]);
		var3 = Integer.parseInt(args[2]);
		System.out.println("The number you entered are:" + var1 + " " + var2 + " " + var3);
		result = obj.multiplyThree(var1, var2, var3);
		System.out.println("Multiply of 3 numbers provided by you is:" + result);
	}
}