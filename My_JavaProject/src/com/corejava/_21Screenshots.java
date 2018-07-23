package com.corejava;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class _21Screenshots {

	//static WebDriver driver;

	public static void captureScreenshot(WebDriver driver) {
		try {
			System.out.println("Capture the Screenshot for the Window With Title::" + driver.getTitle());
			Random randumNumber = new Random();
			int val = randumNumber.nextInt(5456556);
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			File srcIMG = efw.getScreenshotAs(OutputType.FILE);
			File dstIMG = new File("src/Screenshots/Batch51IMG_"+val+".png");
			FileUtils.copyFile(srcIMG, dstIMG);
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		final String url = "https://www.flipkart.com/"; 
		try {
			//step1  open a fire fox browser
			System.setProperty("webdriver.firefox.marionette", "src\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();

			//Step2  and maximize the browser
			driver.manage().window().maximize();

			//stpe3  pass the flipkart URL
			driver.get(url);
			//driver.navigate().to(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			captureScreenshot(driver);
			//stpe4  verify the Flipkart page title,
			String pageTitleExpected="Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More";
			String pageTitleActual = driver.getTitle().trim();
			if(pageTitleExpected.equals(pageTitleActual)) {
				System.out.println("Both Expected and Actual titles are same");
			}
			else {
				System.err.println("Both the titles are not same");
			}
			//stpe5  print the flipkart page title in the console screen(system.out.println) 
			System.out.println("Actual Page Title :: "+pageTitleActual);

			//step6  close the popup(if popup is enabled)
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

			//step7  pass the iphone value in the filpkart serach box
			driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone");

			//step8  then click on flipkart search button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(4000);
			//Capture Screenshot
			captureScreenshot(driver);
			//step9  close the firefox browser
			driver.close();   //Close the browser window that the driver has focus of
			//driver.quit();  //Closes all browser windows and safely ends the session
			System.out.println("Closed the opened browser...");
		}catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
