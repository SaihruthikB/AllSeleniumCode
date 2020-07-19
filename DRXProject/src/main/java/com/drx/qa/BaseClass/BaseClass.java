package com.drx.qa.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.drx.qa.Utilities.CommonUtilitiesClass;

public class BaseClass {

	public static WebDriver d1;
	public static Properties pro;

	public BaseClass() {
		pro = new Properties();
		try {
			FileInputStream fis = new FileInputStream("/Users/admin/Documents/workspace/DRXProjec"
					+ "t/src/main/java/com/drx/qa/Propertiesfile/config.properties");
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	//@Test
	public static void browserSetUp() {
		String browsername = pro.getProperty("browsername");

		if (browsername.equals("chrome")) {
			d1 = new ChromeDriver();
		} else {
			d1 = new FirefoxDriver();
		}

		d1.get(pro.getProperty("url"));
		d1.manage().timeouts().implicitlyWait(CommonUtilitiesClass.implicitwait, TimeUnit.SECONDS);
	}

}
