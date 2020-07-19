package com.drx.qa.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.drx.qa.BaseClass.BaseClass;

public class CommonUtilitiesClass extends BaseClass {

	public static int implicitwait = 20;
	public static long pageLoadTimeOut = 20;
	public static String TESTDATA_SHEET_PATH = "";

	static Workbook book;
	static Sheet sheet;

	//// for screenshot taking

	public static void TakeScreenShot(String MethodName) {

		File screenshot = ((TakesScreenshot) d1).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("user.dir"+"/Test Field_/"+MethodName+"_"+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	///// for Excel data providing

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	
	
	public void windowSwitch()
	{
		Set<String> handle=d1.getWindowHandles();
		 Iterator<String>it=handle.iterator();
		 String parentwindow=it.next();
		 System.out.println("ParentWindow Id ="+parentwindow);
		 String ChildWindow=it.next(); 
		 System.out.println("ParentWindow Id ="+ChildWindow);
		 d1.switchTo().window(ChildWindow);
	}

}
