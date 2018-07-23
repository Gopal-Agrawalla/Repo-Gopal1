package com.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/* Test Case 05: Verify the "Day" "Month" "Year" Select Box Functionality */

/*Note: Select class only works for elements with <select> tags in the backend html code of the web page.
		When a web element is not a SELECT then UnexpectedTagNameException will be shown.
		Select is a class which is provided by Selenium to perform
		multiple operations on DropDown object and Multiple Select object.
		This class can be found under the Selenium’s Support.UI.Select package.
		Select is required a element type object for its constructor.
		After a object creation, you can access all the methods resides in side the SELECT class.
		If the value is given in the Select tag then only you can use the selectByValue method.
		If html developer gives the tag name select you may have to go for the select class. 
 */

public class _05SelectBox_value_visbiletext_index {

	public static void main(String[] args) {
		
		try {
			//Step1:  launch a Empty browser.
			System.setProperty("webdriver.firefox.marionette",
					"src/libs/geckodriver.exe");
			WebDriver  driver = new FirefoxDriver();

			//Step2:  maximize the browser.
			driver.manage().window().maximize();
			
			//Step3:  pass the URL("https://www.facebook.com/").
			driver.get("https://www.facebook.com/");
			
			//Step4:  get the title of the page and print in the console screen.
			System.out.println("Page Title :: " + driver.getTitle().trim());
			
			//WebElement element = driver.findElement(By.id("day")); //identify the element group.
			//Select days = new Select(element);  // Object creation to access all Select class methods.
			//Alternatively
			Select days = new Select(driver.findElement(By.id("day")));
			
			//Step5: print the drop down default selected value in console screen
			String defaultDay = days.getFirstSelectedOption().getText();		
			System.out.println("Default value of day drop down is:" + defaultDay);
			
			//day - Select by index
			days.selectByIndex(10);
			
			//print the drop down selected value in console screen or Select one, capture the value and print it in console.
			//The below line of code should show the 11th item value (10) as 0th index is filled by "Day" 
			System.out.println("Selected option from drop down is:" + days.getFirstSelectedOption().getText());
			
			//Check for month drop down
			Select months = new Select(driver.findElement(By.id("month")));
			String defaultMonth = months.getFirstSelectedOption().getText();
			System.out.println("Default value of month drop down is:" + defaultMonth);
			months.selectByVisibleText("Nov");
			//print the drop down selected value in console screen
			String userSelectedMonth = months.getFirstSelectedOption().getText();  // Nov
			System.out.println("To Print the user selected month:" + userSelectedMonth);
			
			//Check for year drop down
			Select years = new Select(driver.findElement(By.id("year")));
			String defaultYear = years.getFirstSelectedOption().getText();
			System.out.println("Default Year:" + defaultYear);
			years.selectByValue("2017");
			String userSelectedYear = years.getFirstSelectedOption().getText();
			System.out.println("User Selected Year:" + userSelectedYear);

			//step7  close the firefox browser
			driver.close(); 
			System.out.println("Opened Driver Closed...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}