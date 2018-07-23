package com.projectexecution;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.genecriclibraries.DriverScript;
import com.genecriclibraries.WebDriverCommonUtilities;

public class IntiateBrowser {
	
	
  @Test
  public void f() {
  }
  
  
  @BeforeSuite
  public void launchBrowser(){
	  String browserName = WebDriverCommonUtilities.getTestData("Data",8, 0);
	  String url =WebDriverCommonUtilities.getTestData("Data",8, 1);
	  DriverScript.launchBrowser(browserName, url);
  }
  
  @AfterSuite
  public void closeBrowser(){
	  WebDriverCommonUtilities.closeBrowser();
  }
  
}
