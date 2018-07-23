package com.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class _10iFrameHandling {

	public static void main(String[] args) {

		try {
			final String url = "https://www.snapdeal.com/";
			
			//calling this method from generic class
			WebDriver_GenericMethods.launchBrowser("chrome", url);
			WebDriver driver = WebDriver_GenericMethods.driver;

			//mouse over on Sing In button
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//span[text()='Sign In']"))).perform();
			
			//Click on Login button
			driver.findElement(By.xpath("//span/a[text()='login']")).click();
			Thread.sleep(3000);
			//After click on login button, login frame will displayed.
			//Switch to frame
			driver.switchTo().frame("loginIframe");
			Thread.sleep(3000);
			//enter mobile number
			driver.findElement(By.id("userName")).sendKeys("8099882170");
			//close popup
			driver.findElement(By.xpath(".//*[@id='close-pop']/i")).click();
			//switch back to main window
			driver.switchTo().defaultContent();
			//perform an opertaion on topwindow element
			String textValue = driver.findElement(By.xpath("//div[text()='Top Categories']")).getText();
			System.out.println("Text Value Is:" + textValue);
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
