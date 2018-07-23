package com.corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _19FileAttchmentsUsingAutoIt {

	public static void main(String[] args) {
		try {
			//For Testing the below html file created, we are opening it by using launchBrowser Method.
			//Open the file in browser and then copy the path
			String url = "file:///E:/Selenium%20Files/1EclipseWorkPath/My_JavaProject/src/AutoIT%20Files/fileupload.html";
			WebDriver_GenericMethods.launchBrowser("ff", "file:///E:/Selenium%20Files/1EclipseWorkPath/My_JavaProject/src/AutoIT%20Files/fileupload.html");
			Thread.sleep(3000);
			//click on browse button
			//identify the id by inspecting browse button
			//driver.findElement(By.id("fileToUpload")).click(); //why this stmt is throwing exception?
			WebDriver_GenericMethods.driver.findElement(By.id("fileToUpload")).click();
			System.out.println("Gopal");
			//write code for the window by going to the SciTE editor file name: _19FileUploadAutoIT(AutoIt v3 script)
			// Right click on the above file and compile it to create a exe file as java understand exe file.
			//trigger au3.exe file
			Runtime.getRuntime().exec("src/AutoIT Files/_19FileUploadAutoIT.exe");
			WebDriver_GenericMethods.driver.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch block executed");
		}
//		   finally
//	        {
//	            System.out.println("finally block executed");
//	            WebDriver_GenericMethods.driver.close();
//	        }
	}
}