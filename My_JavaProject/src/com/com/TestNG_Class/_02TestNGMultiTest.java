package com.com.TestNG_Class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

/**
 * 
 * @author Sony
 * The sequence of method execution will be b()-->f()-->t() (Alphabetical order) 
 *
 */

public class _02TestNGMultiTest {
  @Test
  public void f() {
  }
  
  @Test
  public void t() {
  }
  
  @Test
  public void b() {
  }
}