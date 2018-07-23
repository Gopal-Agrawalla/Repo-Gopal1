package com.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _14Actions_KeyBoardOpertaions {

	public static void main(String[] args) throws InterruptedException{

		String url = "https://www.vidalhealth.com/";
		_24MultipleBrowser.lunchBrowser("FF", url);
		
		WebDriver driver = _24MultipleBrowser.driver;
		//Login WebElement Xpath
		WebElement wb =driver.findElement(By.xpath("//div[@class='login']"));
		//Take the Actions Class for ContextClik is nothing But Right Click
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		//Username EditBox id
		driver.findElement(By.id("usernameforshow")).sendKeys("Gopalselenium");
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL,Keys.BACK_SPACE).perform();
		driver.close();
		      
	}

}
