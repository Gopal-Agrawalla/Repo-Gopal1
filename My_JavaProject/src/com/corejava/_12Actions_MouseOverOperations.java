package com.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class _12Actions_MouseOverOperations {

	public static void main(String[] args) {

		String url = "https://www.vidalhealth.com/";
		//Lunch Browser by using the existing method under class _24MultipleBrowser
		_24MultipleBrowser.lunchBrowser("FF", url);
		WebDriver driver = _24MultipleBrowser.driver; //To use the driver from class _24MultipleBrowser class.	

		//Actions
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.className("login"))).perform();
		//enter userName
		driver.findElement(By.id("usernameforshow")).sendKeys("Automation");
		//enter Password
		driver.findElement(By.id("passwordforshow")).sendKeys("Test@123");
		//Get the entered pass word and show in console.
		String passwd = driver.findElement(By.id("passwordforshow")).getAttribute("value");
		System.out.println("Entered Password is ::" + passwd);
		//click on go button
		driver.findElement(By.id("edit-submit")).click();
		//Print the mouse over text in console
		String errorMSG = driver.findElement(By.xpath("//div[contains(text(),'P')]")).getText().trim();
		System.out.println("Error MSG is ::" + errorMSG);
		//Close the driver
		driver.close();
	}
}