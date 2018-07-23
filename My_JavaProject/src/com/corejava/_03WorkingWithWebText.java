package com.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Test Case 03-- verify the "WELLNESS REDEFINED" Text in the vidalhealth  home Page.//

public class _03WorkingWithWebText {

	public static void main(String[] args) {
			
		try {
			//Step1:  launch a Empty browser.
			System.setProperty("webdriver.firefox.marionette", "src\\Drivers\\gickodriver.exe");
			WebDriver driver = new FirefoxDriver();

			//Step2:  maximize the browser.
			driver.manage().window().maximize();
			
			//Step3:  pass the URL("https://www.vidalhealth.com/").
			driver.get("https://www.vidalhealth.com/");
			
			//Step4:  get the title of the page and print in the console screen.
			System.out.println("Title Page:" + driver.getTitle().trim());
			
			//Navigate back and forward
			//driver.navigate().back();
			//driver.navigate().forward();
			//Step5:  verify the text "Wellness Redefined" in the vidalhealth homepage,and the print the Actual text  in the home page.
			//String expectedText = "WELLNESS REDEFINED";
			String expectedText = "Wellness Redefined".toUpperCase(); //String copied from backend html file.
			String actualText = driver.findElement(By.tagName("h2")).getText().trim();
			System.out.println(actualText);
			//Step6:  close the browser.
			driver.close();
			System.out.println("Closed the opened browser...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}