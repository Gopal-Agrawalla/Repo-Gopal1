package com.genecriclibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverCommonUtilities {

	public static void closeBrowser(){
		DriverScript.driver.close();
	}


	public static void teminateBrowser(){
		DriverScript.driver.quit();
	}


	public static void elementHighlighter(By locator){
		JavascriptExecutor js = (JavascriptExecutor)(DriverScript.driver);
		js.executeScript("arguments[0].style.border='3px solid BLUE';" 
				,DriverScript.driver.findElement(locator));
	}


	/**
	 * This method ise used to clear the input field values and enter the values in input filed
	 * @author Bhanu Teja Reddy
	 * @param locator
	 * @param value
	 */
	public static void clearEnter(By locator,String value){
		elementHighlighter(locator);
		DriverScript.driver.findElement(locator).clear();
		DriverScript.driver.findElement(locator).sendKeys(value);
	}

	public static void performClick(By locator){
		elementHighlighter(locator);
		DriverScript.driver.findElement(locator).click();
		normalWait(3000);
	}


	public static Actions performActions(){
		Actions  act = new Actions(DriverScript.driver);
		return act;
	}


	public static Select performSelect(By locator){
		Select  sel = new Select(DriverScript.driver.findElement(locator));
		return sel;
	}

	public  static void captureScreenshots(){
		try {
			Random  ran = new Random();;
			int val = ran.nextInt(5456556);
			EventFiringWebDriver   efd = new EventFiringWebDriver(DriverScript.driver);
			File srcIMG = efd.getScreenshotAs(OutputType.FILE);
			File dstIMG = new File("src/main/resources/Screenshots/Batch51IMG_"+val+".png");
			FileUtils.copyFile(srcIMG, dstIMG);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	/**
	 * This method is used to get the test data based on
	 * user inputs and returns a string variable
	 * @author Bhanu Teja Reddy
	 * @param passSheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 */
	public static  String getTestData(String passSheetName,int rowNo,int cellNo){

		String val = null;
		try {
			FileInputStream   fis = new FileInputStream("src/main/resources/TestData/TestData.xlsx");
			Workbook   wb = WorkbookFactory.create(fis);
			Sheet   sh =  wb.getSheet(passSheetName);
			Row    rw = sh.getRow(rowNo);
			val =rw.getCell(cellNo).getStringCellValue();		

		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public static void setTestData(String passSheeName ,int rowNo,int cellNo,String value){
		try {
			String excelSheetPath = "src/main/resources/TestData/TestData.xlsx";
			FileInputStream  fis = new FileInputStream(excelSheetPath);
			Workbook   wb = WorkbookFactory.create(fis);
			Sheet   sh = wb.getSheet(passSheeName);
			Row  rw = sh.getRow(rowNo);
			Cell  cel  = rw.createCell(cellNo);
			cel.setCellValue(value);
			FileOutputStream fos = new FileOutputStream(excelSheetPath);
			wb.write(fos);
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	public  static void switchToLatestWindow(String expTitle){
		//get the windows id's
		Set<String> set = DriverScript.driver.getWindowHandles();
		System.out.println("windows size is :: "+set.size());
		for (String winId : set) {
			//switch to that window
			DriverScript.driver.switchTo().window(winId);
			String actualTitle = DriverScript.driver.getTitle().trim();
			if (expTitle.equals(actualTitle)) {
				System.out.println("Successfully navigated to :: "+actualTitle);
				break;
			}
		}
	}

	public  static void closeLatestWindow(String expTitle){
		//get the windows id's
		Set<String> set = DriverScript.driver.getWindowHandles();
		System.out.println("windows size is :: "+set.size());
		for (String winId : set) {
			//switch to that window
			DriverScript.driver.switchTo().window(winId);
			String actualTitle = DriverScript.driver.getTitle().trim();
			if (expTitle.equals(actualTitle)) {
				System.out.println("Successfully close :: "+actualTitle);
				DriverScript.driver.close();
				break;
			}
		}
	}

	public static String getPageText(By locator){
		elementHighlighter(locator);
		String val =DriverScript.driver.findElement(locator).getText().trim();
		return val ;
	}

	public static String getTextBoxValue(By locator,String attributeName){
		elementHighlighter(locator);
		String val =DriverScript.driver.findElement(locator).getAttribute(attributeName).trim();
		return val ;
	} 


	public static void normalWait(int time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void waitForElement(By locator){
		WebDriverWait wait = new WebDriverWait(DriverScript.driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}







}
