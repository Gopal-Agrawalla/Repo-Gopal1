package com.corejava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriver_GenericMethods {

	public static WebDriver  driver = null;

	public static void launchBrowser(String browserName,String url){

		if (browserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.firefox.marionette",
					"src/Drivers/geckodriver.exe");
			driver  = new FirefoxDriver();
			System.out.println("Firefox browser launched");
		}else if (browserName.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver",
					"src/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome browser launched");

		}else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"src/Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("Chrome browser launched");
		}else {
			System.setProperty("webdriver.firefox.marionette",
					"src/Drivers/geckodriver.exe");
			driver  = new FirefoxDriver();
			System.out.println("Default Firefox browser launched");
		}

		//maximize the browser
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	/*public static WebDriver getDriver(){
				return driver;
			}*/
}