
package com.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _13Actions_ContextClick {

	public static void main(String[] args) {

		try {
			String url = "https://www.vidalhealth.com/";
			_24MultipleBrowser.lunchBrowser("FF", url);
			WebDriver driver = _24MultipleBrowser.driver;
			
			//Mouse Over
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.className("login"))).perform();
			
			//enter invalid userName
			WebElement userName = driver.findElement(By.id("usernameforshow"));
			userName.sendKeys("Test@123");
			
			//Copy the entered user name by using shift + home key
			act.sendKeys(userName, Keys.SHIFT, Keys.HOME).perform();;
			act.contextClick(userName).perform(); //contextClick is nothing but right click.
			act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
			Thread.sleep(3000);
			act.contextClick(driver.findElement(By.id("passwordforshow"))).perform();
			
			//Paste value in password field
			WebElement passWord = driver.findElement(By.id("passwordforshow"));
			act.sendKeys(passWord, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
			
			//Get the user name what you have entered by using get attribute.
			String userEnteredName = userName.getAttribute("value").trim();
			
			//Get the pass word name what you have entered by using get attribute.
			String UserEnteredPassWord = passWord.getAttribute("value").trim();
			
			//Compare the value of user name and pass word
			if(userEnteredName.equals(UserEnteredPassWord)){
				System.out.println("Both the values are same...");
			}
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
