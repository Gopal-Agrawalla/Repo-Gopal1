package com.corejava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class _24MultipleBrowser {

	public static WebDriver driver = null;

	public static void lunchBrowser(String browserName, String url) {
		//String browserNameUperCase = browserName.toUpperCase(); //always upper case whatever user provided.
		if (browserName == "FF"){
			System.setProperty("webdriver.firefox.marionette", "src/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browserName == "IE"){
			System.setProperty("webdriver.ie.driver", "src/Drivers/IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
		}else if(browserName == "CHROME") {
			System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.firefox.marionette", "src/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} //end of else if

		//Maximize the browser
		driver.manage().window().maximize();

		//Pass the url
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	} //end of lunchBrowser method.

	public static void main(String[] args) {

		final String url = "https://www.seleniumhq.org/download/";
		//lunchBrowser("IE", url);
		//lunchBrowser("CHROME", url);
		lunchBrowser("FF", url);
		
		//Close the browser
		driver.close();
		System.out.println("Opened Browser Closed...");
	}
}