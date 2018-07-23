package my_test;

import java.util.Scanner;

public class Assignment7Scanner {

	void availableTrain() {

		System.out.println("Train No" + "\t" + "Train Name" + "\t" + "Arrival Time" + "\t" + "Departure Time");
		System.out.println("12345" + "\t\t" + "Vishakha Exp" + "\t" + "08:30 AM" + "\t" + "08:32 AM");
		System.out.println("23456" + "\t\t" + "Falaknuma Exp" + "\t" + "10:20 AM" + "\t" + "10:25 AM");
		System.out.println("34567" + "\t\t" + "Gadavari Exp" + "\t" + "13:10 PM" + "\t" + "13:20 PM");
		System.out.println("45678" + "\t\t" + "Garib Rath Exp" + "\t" + "20:30 PM" + "\t" + "21:00 PM");
	}

	int calculateFare(int seatCount, int fare) {

		int totalFare = seatCount * fare;
		return totalFare;
	}

	public static void main(String[] args) {

		Assignment7Scanner obj = new Assignment7Scanner();
		Scanner sc = new Scanner(System.in);
		int totalFare = 0;

		System.out.println("Enter User Name:");
		String userName = sc.next();
		System.out.println("Enter Password:");
		String passwd = sc.next();
		System.out.println("Enter Source:");
		String source = sc.next();
		System.out.println("Enter Destination:");
		String destination = sc.next();
		System.out.println("Enter The Date:");
		String date = sc.next(); // date input considered as string.

		System.out.println("Name:" + userName);
		System.out.println("Source:" + source);
		System.out.println("Destination:" + destination);
		System.out.println("Date:" + date);
		obj.availableTrain();
		System.out.println("Select the train from the above list:");
		String selectTrain = sc.next();
		System.out.println("Enter the number of seat required:");
		int fare = 600;
		int seatCount = sc.nextInt();
		totalFare = obj.calculateFare(seatCount, fare);
		System.out.println("Total Fare:" + totalFare);
		System.out.println("Want to confirm your seat: (Y/N) ");
		// boolean flag = sc.nextBoolean();
		String flag = sc.next();
		System.out.println("Flag Value is:" + flag);
		
		if(flag == "Y")	{// Why else part is getting executed for both flag value Y/N?
			System.out.println("Book the ticket.");
		}
		else {
			System.out.println("You did not confirm to book your ticket");
		}
		
		System.out.println("You have completed your transaction...");
		sc.close();
	}
}
