package my_test;

public class ForLoop {

	public static void main(String[] args) {

		int i;
		// Normal/traditional for loop
		for (i = 0; i <= 10; i++) {
			System.out.println("Gopal : " + i);
		}
		// The enhanced for loop to work only with arrays and collection.
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (char items : vowels) {
			System.out.println(items);
		}
	}

}