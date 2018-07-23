package com.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/* Test Case 04: Verify the "Email" Text Box value,
and print in the console screen which user is given Email id. */

public class _04WorkingWithBackEndAttribute {

	public static void main(String[] args) {

		//Step1:  launch a Empty browser.
		System.setProperty("webdriver.firefox.marionette", "src\\Drivers\\gickodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//Step2:  maximize the browser.
		driver.manage().window().maximize();

		//Step3:  pass the URL("https://accounts.google.com/").
		driver.get("https://accounts.google.com/");

		//Step4:  get the title of the page and print in the console screen.
		System.out.println("Page Title:" + driver.getTitle().trim());
		
		//Step5:  Enter the Email id in the Gmail> "Enter Your Email" Field.
		WebElement emailField = driver.findElement(By.id("identifierId"));
		emailField.sendKeys("gopallal.mca@gmail.com");
		
		//Alternatively
		//driver.findElement(By.id("identifierId")).sendKeys("gopallal.mca@gmail.com");
		//Before entering the mail ID into the field the attribute value is null or "".
		//After entering the mail ID the value attribute will show your mail ID.
		
		//Step6:  and print  the Email id value in the console  screen (getattribute).
		String mailID = driver.findElement(By.id("identifierId")).getAttribute("data-initial-value").trim();
		System.out.println("Entered Mail ID:" + mailID);

		//Step7: close the browser.
		driver.close();
		System.out.println("Opened Driver Closed...");
	}

}
