package com.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _17FileHandling_ReadDataFromExcellSheet {
	
	public static String getTestData(String sheetName, int rowNo, int cellNo){		
		String val = null;
		try{
			FileInputStream fis = new FileInputStream("src/TestData/Batch51_TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row rw = sh.getRow(rowNo);
			val = rw.getCell(cellNo).getStringCellValue();
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
		return val;
	} //end of getTestData method.
	
	public static void main(String[] args) {
		//Keep the URL as:https://www.naukri.com/
		//read the test data from excel sheet
		String browserName = getTestData("Sheet1", 1, 0);
		String url = getTestData("Sheet1", 1, 1);
		//Print the test data
		System.out.println("Browser Name:" + browserName);
		System.out.println("URL is:" + url);
		_24MultipleBrowser.lunchBrowser(browserName, url);
	} //end of main method.
} //end of class
