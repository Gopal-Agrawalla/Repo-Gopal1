package com.corejava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class _23OpenaIEBrowser {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.ie.driver", "src/Drivers/IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();

			//Step2  and maximize the browser
			driver.manage().window().maximize();
			//stpe3  pass the flipkart URL
			final String url = "https://www.flipkart.com/";
			driver.get(url);
			//stpe4  verify the Flipkart pagetitle, 
			//"Expected titile is:"Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com "
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String expectedTitle = "";
			String actualTitle = driver.getTitle().trim();
			if(expectedTitle.equals(actualTitle)){
				System.out.println("Expected andd actual titles are same...");
			}	
			else{
				System.out.println("Expected andd actual titles are not same...");
			}	
			//stpe5  print the flipkart page title in the console screen(system.out.println) 
			System.out.println("Actual title :: "+ actualTitle);

			//step6  close the popup(if popup is enabled)
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			/*WebElement  crossMark  = driver.findElement(By.className("_2AkmmA _29YdH8"));
			crossMark.click();*/
			Thread.sleep(2000);

			//step7  pass the iphone value in the filpkart serach box
			driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("Iphone");

			//step8  then click on flipkart search button
			driver.findElement(By.className("vh79eN")).click();
			System.out.println("Iphone Page title :: "+driver.getTitle().trim());

			//step9  close the firefox browser
			Thread.sleep(4000);
			driver.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
