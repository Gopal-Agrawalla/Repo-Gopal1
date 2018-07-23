package com.corejava;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _15AuttoSuggestEditBox {

	public static void main(String[] args) {

		try {
			final String url = "https://www.naukri.com/";
			_24MultipleBrowser.lunchBrowser("FF", url);
			WebDriver driver = _24MultipleBrowser.driver;

			//click on serach box
			driver.findElement(By.className("searchJob")).click();

			//enter key skills (After click on the search box, below will be the xPath)
			driver.findElement(By.xpath("//input[@name='qp' and @maxlength='250']")).sendKeys("sel");
			String expKeySkill = "Selenium Webdriver";
			//Xpath of suggestion drop down.
			List <WebElement> lst = driver.findElements(By.xpath("//*[@id='sugDrp_skill']/ul/li/div"));
			System.out.println("Size of the drop down is:" + lst.size());
			Actions act = new Actions(driver);

			for (WebElement val : lst) {
				String actualKeySkill = val.getText().trim();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				Thread.sleep(2000);
				if(expKeySkill.equals(actualKeySkill)){
					act.sendKeys(Keys.ENTER).perform();
					break;
				}
			}
			//get the selected value from the drop down after hit the enter key (XPath of search box)
			String enteredValue = driver.findElement(By.xpath("//input[@name='qp' and @maxlength='250']")).getAttribute("value");
			System.out.println("Entered Value is:" + enteredValue);
			String[] val = enteredValue.split(",");
			String actualVal = val[0];
			if (expKeySkill.equals(actualVal)){
				System.out.println("Both Skills are Same...");
			} else {
				System.out.println("Both Skills are not Same...");
			}
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}