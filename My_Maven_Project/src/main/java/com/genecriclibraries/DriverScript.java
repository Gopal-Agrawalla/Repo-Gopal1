package com.genecriclibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverScript {


	public static WebDriver  driver;

	public static void launchBrowser(String browserName,String url){
		if (browserName.equalsIgnoreCase("FF")) {

			System.setProperty("webdriver.firefox.marionette", 
					"src/main/resources/libs/geckodriver.exe");
			driver  = new FirefoxDriver();
			System.out.println("FF browser launched");
		}else if (browserName.equalsIgnoreCase("CHROME")) {

			System.setProperty("webdriver.chrome.driver", 
					"src/main/resources/libs/chromedriver.exe");
			driver  = new ChromeDriver();
			System.out.println("CHROME browser launched");

		}else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", 
					"src/main/resources/libs/IEDriverServer.exe");
			driver  = new InternetExplorerDriver();
			System.out.println("IE browser launched");
		}else {
			System.setProperty("webdriver.firefox.marionette", 
					"src/main/resources/libs/geckodriver.exe");
			driver  = new FirefoxDriver();
			System.out.println("Default FF browser launched");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
