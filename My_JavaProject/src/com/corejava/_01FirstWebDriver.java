package com.corejava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//IE browser is not working, looks like version miss match issue.
//verify the search box & SearchButton  functionality in flipkart web site

public class _01FirstWebDriver {

	public static void main(String[] args) {

		final String url = "https://www.flipkart.com/"; 
		try {
			//step1  open a fire fox browser
			System.setProperty("webdriver.firefox.marionette", "src\\Drivers\\geckodriver.exe");
			//System.setProperty("webdriver.chrome.driver", "src\\Drivers\\chromedriver.exe");
			//System.setProperty("webdriver.ie.driver", "src\\Drivers\\IEDriverServer.exe");
			System.out.println("After Set Property");
			WebDriver driver = new FirefoxDriver();
			//WebDriver driver = new ChromeDriver();
			//WebDriver driver = new InternetExplorerDriver();
			System.out.println("Driver instance Created");
			
			//Step2  and maximize the browser
			driver.manage().window().maximize();
			
			//stpe3  pass the flipkart URL
			Thread.sleep(6000);
			driver.get(url);
			//Alternatively the same thing can be done like this
			//driver.navigate().to(url);

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
			System.out.println("Actual Page Title:"+pageTitleActual);

			//step6  close the popup(if popup is enabled)
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			//Alternatively the same thing can be done like this
			//If a class name is having spaces in between then don't go for By.className.
			//driver.findElement(By.className("_2AkmmA _29YdH8")).click();  
			//another way
			//WebElement crossMark = driver.findElement(By.className("_2AkmmA _29YdH8"));
			//crossMark.click();
			
			//step7  pass the iphone value in the filpkart serach box
			driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone");
			
			//step8  then click on flipkart search button
			driver.findElement(By.xpath("//button[@type='submit']")).click();

			//step9  close the firefox browser
			Thread.sleep(4000);
			driver.close();   //Close the browser window that the driver has focus of
			//driver.quit();  //Closes all browser windows and safely ends the session
			System.out.println("Closed the opened browser...");
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Exception is:" + e);
		}
	}
}