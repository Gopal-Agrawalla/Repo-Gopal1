package com.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* Test Case 02: Verify the FaceBook Footer Links (Games,Sign Up,Terms) 
By using xpath,linktext and partiallinktext locators in FaceBook home Page. */

public class _02WorkingWithWebLinks {

	public static void main(String[] args) {

		try {
			//Step1:  launch a Empty browser.
			System.setProperty("webdriver.firefox.marionette", "src\\Drivers\\gickodriver.exe");
			//System.setProperty("webdriver.firefox.marionette", "src\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();

			//Step2:  maximize the browser.
			driver.manage().window().maximize();

			//Step3:  pass the URL("https://www.facebook.com/").
			driver.get("https://www.facebook.com/");

			//Step 4 :  verify the PageTitle
			String expectedPageTitle="Facebook – log in or sign up";
			String actualPageTitle = driver.getTitle().trim();
			
			if(expectedPageTitle.equals(actualPageTitle)){
				
				System.out.println("Both Excepted and Actual Page Title are Same.");
			}
			else {
				System.err.println("Both Excepted and Actual Page Title are Not Same.");
			}

			//Step5:  get the title of the page and print in the console screen.
			System.out.println("Actual Page Title:" + actualPageTitle);
		
			//Step6: Now Perform an operation on Facebook links by using xpath,linktext,partiallinktext locators.
			//Click on SingUp Link by using linktext Locator
			driver.findElement(By.linkText("Sign Up")).click();
			Thread.sleep(4000);
			System.out.println("Sign Up Title:" + driver.getTitle().trim());
			
			//Click on Terms by using Xpath
			//driver.findElement(By.xpath("//a[@title='Review our terms and policies.']")).click();
			driver.findElement(By.xpath("//a[@accesskey='9']")).click();
			Thread.sleep(4000);
			System.out.println("Terms Title:"+ driver.getTitle().trim());
			
			//Click on Games by using partial linktext  
			driver.findElement(By.partialLinkText("Gam")).click();
			Thread.sleep(4000);
			System.out.println("Games Title:"+ driver.getTitle().trim());
			
			//Step7:  close the browser.
			driver.close();
			System.out.println("Closed the opened browser...");
			
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e); //Same as above line, check once.
		}
	}
}