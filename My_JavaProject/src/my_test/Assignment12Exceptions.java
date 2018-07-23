package my_test;

/**
 * @author Sony
 *
 *         EXCEPTION is a situation that deviates the program from normal flow
 *         of execution. The program will be terminated abnormally. There should
 *         be at least one catch block for a try block. Finally block is
 *         optional and if it is present, this block will be get executed
 *         always. Exceptions are of two types: Error and
 *         Exception:Checked(compile time error/exception) & unchecked(run time
 *         exception). Run time exceptions can be handled by the programmer. If
 *         we don't know the specific type of exception(Arithmetic, Index Out Of
 *         Bound) then use Exception class. If system found any exceptions, next
 *         line onwards will not be get executed.
 */

public class Assignment12Exceptions {

	public static void main(String[] args) {

		try {

			int array[] = { 1, 2, 3, 4, 5 };
			System.out.println("Accessing the value of out of bound array:" + array[10]);
			int var1=10, var2=0, var3=0;
			var3=var1/var2;
		} catch (ArrayIndexOutOfBoundsException expObj) {
			System.out.println("You Under ArrayIndexOutOfBoundsException Catch Block...");
			expObj.printStackTrace();
		} catch (NumberFormatException expObj) {
			System.out.println("You Under NumberFormatException Catch Block...");
			expObj.printStackTrace();
		} catch (ArithmeticException expObj) {
			System.out.println("You Under ArithmeticException Catch Block...");
			expObj.printStackTrace();
		} finally {
			System.out.println("You are under Finally...");
		}
	}
}