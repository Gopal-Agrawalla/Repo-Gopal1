package com.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class _07Multiple_SelectBox {

	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.firefox.marionette", "src\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();

			//Get the URL "http://toolsqa.com/automation-practice-form/"
			driver.get("http://toolsqa.com/automation-practice-form/");
			Thread.sleep(4000);
			//Goto the Selenium Commands drop down section.
			//take a select class for the select box and pass webelemnt into the select class
			Select seleniumCommands = new Select(driver.findElement(By.id("selenium_commands")));
			
			//checking weather select box MULTIPLE are NOT.
			System.out.println(seleniumCommands.isMultiple()); //true/false  as per multiple tag availability in back end html.
			
			//select multiple items from the select box list
			seleniumCommands.selectByIndex(3);
			seleniumCommands.selectByVisibleText("Navigation Commands");
			seleniumCommands.selectByVisibleText("Browser Commands");
			
			//To Use the below method, value tag should be present in the back end html.
			//Here in this case value tag is not present so can't be used.
			//seleniumCommands.selectByValue(""); 
			Thread.sleep(4000);
			seleniumCommands.deselectByIndex(2);
			seleniumCommands.deselectByVisibleText("Wait Commands");
			
			//De-select all
			seleniumCommands.deselectAll();
			
			driver.close();
			System.out.println("Closed the opened browser...");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
