package my_test;

/*
The continue keyword can be used in any of the loop control structures.
It causes the loop to immediately jump to the next iteration of the loop.
In a for loop, the continue keyword causes control to immediately jump to the update statement.
In a while loop or do/while loop, control immediately jumps to the Boolean expression.
As soon as the cursor encounter the continue keyword,it will skip all the statements after continue.
 */

// Output: 10 20 30 50
public class ContinueSTMT {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int i : numbers) {
			if (i == 40) {
				continue;
			}
			System.out.println(i);
		}
	}

}
