package my_test;

import java.util.Scanner;

public class Assignment9Array {

	int avrageMark(int a[]) {

		int sumMark = 0;
		//int b[4] = {1, 2, 3, 4}; //why showing error?
		//int ab[]; how this is not showing error?
		//int ab[6]; // showing Error why?
		int arraylen = a.length;

		for (int i = 0; i < arraylen; i++) {
			sumMark += a[i];
		}
		return sumMark / arraylen;
	}

	public static void main(String[] args) {
		// int subMarks[] = { 20, 30, 40, 50, 60 };
		int subMarks[] = { 0, 0, 0, 0, 0 }; // without initialization showing error.
		Assignment9Array obj = new Assignment9Array();
		Scanner sc = new Scanner(System.in);
		// System.out.println("Please enter the number of subject to calculate average:");
		// int subCount = sc.nextInt();
		System.out.println("Enter the marks in 5 subjects:");
		for (int i = 0; i < 5; i++) {
			subMarks[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Average Mark of the Student:" + obj.avrageMark(subMarks));
	}

}