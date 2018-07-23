package com.com.TestNG_Class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

/**
 * 
 * @author Sony
 * In Normal Case the sequence of method execution will be b()-->f()-->t() (Alphabetical order)
 * This can be changed by providing priority for each method. 
 *
 */

public class _03TestNGPriorities {
  @Test
  public void f() {
	  System.out.println("Inside function f()");
  }
  
  @Test
  public void t() {
	  System.out.println("Inside function t()");
  }
  
  @Test
  public void b() {
	  System.out.println("Inside function b()");
  }
}