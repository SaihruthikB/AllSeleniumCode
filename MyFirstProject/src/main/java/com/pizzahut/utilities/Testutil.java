package com.pizzahut.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pizzahut.baseclass.Baseclass;

public class Testutil extends Baseclass {

	public static long pageLoadTimeOut = 20;
	public static int implicitwait = 20;

	public static String TESTDATA_SHEET_PATH = "/Users/admin/Documents/workspace/DataProvider/src"
			+ "/main/java/excelSheet/Pilotfish_Integration layer V0.1.ods";

	static Workbook book;
	static Sheet sheet;
	
	//// for calender

	public void Year() {
		driver.findElement(By.xpath("//input[@name='date_of_visit']")).click();
		String Expected = "2017";
		int ExpectedYear = Integer.parseInt(Expected);
		String actualYear = driver.findElement(By.xpath("//span[text()='2020']")).getText();
		int ActualYear = Integer.parseInt(actualYear);
		while (true) {
			if (ExpectedYear == ActualYear) {
				break;
			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				ActualYear = Integer
						.parseInt(driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText());
			}
		}

	}

	public void Month() {
		String ExpectedMonth = "April";
		String Actual = driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
		while (true) {
			if (ExpectedMonth.equals(Actual)) {
				break;
			} else {
				driver.findElement(By.xpath("(//span[contains(@class,'triangle')])[1]")).click();
				Actual = driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
			}
		}
	}
	
	//// for screenshot taking 

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
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

}
