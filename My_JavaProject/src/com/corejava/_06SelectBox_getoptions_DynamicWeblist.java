package com.corejava;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//TestCase 06 -Verify the Functionality of drop down dynamically webList.

public class _06SelectBox_getoptions_DynamicWeblist {

	public static void main(String[] args) {

		try {
			//Step1:  launch a Empty browser.
			System.setProperty("webdriver.firefox.marionette", "src\\Driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();

			//Step2:  maximize the browser.
			driver.manage().window().maximize();

			//Step3:  pass the URL("https://www.facebook.com/").
			driver.get("https://www.facebook.com/");
			Thread.sleep(4000);

			//Step4:  get the title of the page and print in the console screen.
			System.out.println("Page Title:" + driver.getTitle().trim());

			//get all the drop down values of month.
			Select months = new Select(driver.findElement(By.id("month")));
			List <WebElement> webElementList = months.getOptions();
			System.out.println("Month Drop Down List Size:" + webElementList.size());

			// Provide a month and verify the availability in the drop down.
			 String expectedMonth = "Mon"; // Invalid Month
			//String expectedMonth = "Dec";  // Valid Month
			boolean flag = false;
			for (WebElement tempwebElement : webElementList) {
				String actuaMonth = tempwebElement.getText().trim();
				if(expectedMonth.equals(actuaMonth)){
					months.selectByVisibleText(actuaMonth);
					flag=true;
					break;
				}
			}
			//The below if statement should be kept outside of the for each  loop.
			//Below print statement will execute for invalid month.
			if(!flag){
				System.out.println("Your Expected Month:" + expectedMonth + ":Is Not Available In The Dropdown List");
			}

			//Close the driver.
			driver.close();
			System.out.println("Opened Driver Closed...");
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}