package com.corejava;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * getWindowHandles returns(Set<String>) all windows ID along with main window.
 * getWindowHandle returns(String) main window ID. 
 */

public class _08WindowHandles {

	static WebDriver driver = null;

	public  static void switchToLatestWindow(String expTitle){
		//get the windows id's
		Set<String> set = driver.getWindowHandles();
		System.out.println("windows size is :: "+set.size());
		for (String winId : set) {
			//switch to that window
			driver.switchTo().window(winId);
			String actualTitle = driver.getTitle().trim();
			if (expTitle.equals(actualTitle)) {
				System.out.println("Successfully navigated to :: "+actualTitle);
				break;
			}
		}
	}
	
	public  static void closeLatestWindow(String expTitle){
		//get the windows id's
		Set<String> set = driver.getWindowHandles();
		System.out.println("windows size is :: "+set.size());
		for (String winId : set) {
			//switch to that window
			driver.switchTo().window(winId);
			String actualTitle = driver.getTitle().trim();
			if (expTitle.equals(actualTitle)) {
				System.out.println("Successfully close :: "+actualTitle);
				driver.close();
				break;
			}
		}
	}
	
	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.firefox.marionette", "src\\Drivers\\geckodriver.exe");
		// The below code is invalid, just we have to initialize the driver as already declared.
		//WebDriver driver = new FirefoxDriver();
		driver = new FirefoxDriver();  //Declaration is already present so just initialize.
		driver.manage().window().maximize();	
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //To open the site completely.
		//driver.findElement(By.linkText("TIBCO Software")).click();
		//close popup windows
		//closeLatestWindow("Amazon"); //Commented as this page is no more showing in the site.
		closeLatestWindow("Haier"); 

		//Switch back to main window
		switchToLatestWindow("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
		//Click on TIBCO Software link under Information Tech
		driver.findElement(By.linkText("TIBCO Software")).click();
		//switch to Tibco software window
		switchToLatestWindow("Tibco Jobs – Jobs in Tibco - Career in Tibco – Job Openings in Tibco");
		String about =driver.findElement(By.xpath("//div[text()='About Us']")).getText();
		System.out.println("Tibco Page text :: "+about);
		driver.close();
		
		//switch back again to parent window
		//driver.switchTo().defaultContent(); //To switch back to parent page but here it won't work as we close the driver.
		switchToLatestWindow("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
		//click on registerus button
		driver.findElement(By.xpath("//input[@othersrcp='22536']")).click();
		driver.close();	
	}
}