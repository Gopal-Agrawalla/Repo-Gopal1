package com.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _20FileDownloadUsingAutoIt {

	public static void main(String[] args) {
		WebDriver driver =null;
		try {
			String url = "https://www.apache.org/dyn/closer.lua/poi/release/bin/poi-bin-3.17-20170915.zip";
			WebDriver_GenericMethods.launchBrowser("ff", url);
			driver = WebDriver_GenericMethods.driver;
			//Click on a link (Link to below: We suggest the following mirror site for your download)
			driver.findElement(By.xpath("//div[@class='container'][2]/p[2]/a/strong")).click();
			Thread.sleep(3000);
			//trigger .exe file (Select the save radio button then click OK)
			//Check the details of the autoIT script.
			Runtime.getRuntime().exec("src\\AutoIT Files\\_20FileDownloadAutoIT.exe"); 
			//After execution, doing some operation in eclipse window, need to check.
			System.out.println("Windows Program successfully executed...");
			driver.close();
			System.out.println("Opened driver closed...");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		finally {
//			System.out.println("You are inside finally Block");
//			driver.close();
//		}
	}
}