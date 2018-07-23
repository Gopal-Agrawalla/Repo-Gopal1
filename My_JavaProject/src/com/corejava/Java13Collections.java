package com.corejava;

import java.util.ArrayList;
import java.util.Iterator;

public class Java13Collections {

	public static void main(String[] args) {
		
		//Example of Array List.
		ArrayList<String> name = new ArrayList<>();
		//To add an element to the array list
		name.add("Gopal");
		name.add("Agrawalla");
		System.out.println(name.get(0));
		System.out.println(name.get(1));
		
		//To remove an element from the array list
		name.remove(0);
		
		//For each loop will not work for collection so need to use iterator.
		System.out.println(name.get(0));
		//System.out.println(name.get(1));
		
		//Iterator<String> itr = Iterator<String>(name);
	}
}
