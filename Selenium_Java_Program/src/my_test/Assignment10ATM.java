package my_test;

import java.util.Scanner;

/*
 Make the accountBalance variable global/static so that the value should not re-set after each operations.
 
 */

public class Assignment10ATM {
	
	//static int accountBalance = 10000; //kept as class variable with static keyword still the value is resetting.
	void accountDetails(int balance) {

		System.out.println("Your Account Balance Amount Is:" + balance);
	}

	int accountDeposite(int initialBalance, int depositeAmount) {
		int finalAmount = 0;

		finalAmount = initialBalance + depositeAmount;
		return finalAmount;
	}

	int accountWithdraw(int initialBalance, int withdrawAmount) {
		int finalAmount = 0;

		finalAmount = initialBalance - withdrawAmount;
		return finalAmount;
	}

	public static void main(String[] args) {

		Assignment10ATM obj = new Assignment10ATM();
		// static int accountBalance = 10000; // Make this variable to static to see the value after all operations but showing error 
		int accountBalance = 10000;
		int inputVal;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter 1 for Balance Check || 2 for deposite || 3 for Withdrow || 4 to exit");
			inputVal = sc.nextInt();

			switch (inputVal) {

			case 1:
				obj.accountDetails(accountBalance);
				break;

			case 2:
				System.out.println("Enter Deposite Amount");
				int depositeAmount = sc.nextInt();
				System.out.println(
						"Final Account Balance Ammount Is:" + obj.accountDeposite(accountBalance, depositeAmount));
				break;

			case 3:
				System.out.println("Enter withdraw Amount");
				int withdrawAmount = sc.nextInt();
				System.out.println(
						"Final Account Balance Ammount Is:" + obj.accountWithdraw(accountBalance, withdrawAmount));
				break;

			case 4:
				System.out.println("You have selected to exit from the current program");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong input entered, please provide correct input");
				continue; //
			} // Switch Case ends here.

		} while (inputVal != 4); // do while ends here.
	} // main method ends here.
} // Class Assignment10ATM ends here.