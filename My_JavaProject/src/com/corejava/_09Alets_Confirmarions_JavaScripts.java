package com.corejava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _09Alets_Confirmarions_JavaScripts {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.firefox.marionette", "src/Drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.irctctourism.com/cgi-bin/rr.dll/irctc/services/rrhome.do#");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			//click on login button
			driver.findElement(By.id("btn1")).click();
			//get the alert box text
			Alert alt = driver.switchTo().alert();
			String alertBoxText = alt.getText();
			System.out.println("AlertBox Text :: "+alertBoxText);
			Thread.sleep(3000);
			alt.accept();  //To accept the alert.
			//alt.dismiss(); //To discard the alert.
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
