package com.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class _18FileHandling_WriteDataFromexcelSheet {
	
	public static void setTestData(String sheetName, int rowNo, int cellNo, String val){
		
		try {
			String sheetPath = "src/TestData/Batch51_TestData.xlsx";
			FileInputStream fis = new FileInputStream(sheetPath); //Should be inside try catch block
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row rw = sh.getRow(rowNo);
			Cell cel = rw.createCell(cellNo);
			cel.setCellValue(val);
			FileOutputStream fos = new FileOutputStream(sheetPath);
			wb.write(fos);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		//Input Sheet Path: E:\Selenium Files\1EclipseWorkPath\My_JavaProject\src\TestData\Batch51_TestData.xlsx
		//Sheet Name: Batch51_TestData.xlsx
		//Keep browser name as: "FF"/"IE"/"CHROME" in the input sheet.
		//Keep the URL as:https://www.vidalhealth.com/
		//
		String browserName = _17FileHandling_ReadDataFromExcellSheet.getTestData("sheet1", 1, 0); //1st row and 0th column
		String url = _17FileHandling_ReadDataFromExcellSheet.getTestData("sheet1", 1, 1); //1st row and 1st column
		_24MultipleBrowser.lunchBrowser(browserName, url);
		WebDriver driver = _24MultipleBrowser.driver;
		
		//Actions
		Actions act = new Actions(driver);
		//To mouse over on login button. 
		act.moveToElement(driver.findElement(By.className("login"))).perform();
		//Get the user name from the sheet
		String userName = _17FileHandling_ReadDataFromExcellSheet.getTestData("sheet1", 0, 2); //1st row and 3rd column
		//enter userName in GUI
		driver.findElement(By.id("usernameforshow")).sendKeys(userName);
		//enter Password
		String passWord = _17FileHandling_ReadDataFromExcellSheet.getTestData("sheet1", 0, 3); //1st row and 4th column
		driver.findElement(By.id("passwordforshow")).sendKeys(passWord);
		//Print the entered pass word in console
		String enteredPassword = driver.findElement(By.id("passwordforshow")).getAttribute("value");
		System.out.println("Entered Password" + enteredPassword);
		//click on go button
		driver.findElement(By.id("edit-submit")).click();
		String errorMSG = driver.findElement(By.xpath("//div[contains(text(),'P')]")).getText().trim();
		//Alternatively
		//String errorMSG = driver.findElement(By.className("login-error")).getText().trim();
		System.out.println("Error Message:" + errorMSG);
		//Write the error message to the input sheet
		setTestData("sheet1", 1, 4, errorMSG);
		driver.close();
		System.out.println("Opened Driver Closed...");
	} //end of main method.
} //end of class