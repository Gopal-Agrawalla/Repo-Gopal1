package my_test;

public class WhileDoWhile {

	public static void main(String[] args) {

		int i = 1, j = 0;

		while (i <= 10) {
			System.out.println("Value of i is:" + i);
			i += 1;
		}

		do {
			System.out.println("Value of j is:" + j);
			j += 5;
		} while (j <= 50);
	}

}
