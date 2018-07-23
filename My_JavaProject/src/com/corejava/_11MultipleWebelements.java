package com.corejava;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _11MultipleWebelements {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette", "src/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techmahindra.com/sites/blogs/SitePages/BlogCategoryLsiting.aspx");
		driver.manage().timeouts().
		implicitlyWait(60, TimeUnit.SECONDS);

		//Get all the blog category link names and print in console screen
		//Create a Weblink list and store all the object then get text inside a loop.
		List <WebElement> webElementList = driver.findElements(By.xpath("//div[@class='servicelistitems']/ul/li/a"));
		System.out.println("List Size::" + webElementList.size());

		//Print in console in the format: 1.webElement:: Text 
		int i=1;
		for (WebElement webElement : webElementList) {
			String elementText = webElement.getText().trim();
			System.out.println(i +".Link Name ::" + elementText);
			i++;
		}
	}

}
