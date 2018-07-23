package com.corejava;

public class Java12LoopingSTMT {

	public static void main(String[] args) {

		//For loop
		System.out.println("****************For loop Example*****************");
		for (int i = 0; i < 10; i++) {

			System.out.println("Value of i is:"+i);
		}

		//For each loop (useful for an array and if want to display completely without any condition)
		System.out.println("**************For each Example********************");
		String [] names = {"Bharat", "Hindustan", "India", "Kalinga"};
		for (String var : names) {

			System.out.println("Name:"+var);	
		}

		//while and do while are already done in conditional-statement file.
	}
}