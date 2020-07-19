package com.Ritwik.qa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBaseClass {
	
	public static WebDriver driver;
	public static Properties pro;
	
	public  TestBaseClass() throws IOException
	{
		Properties pro = new Properties();
		InputStream fis = new FileInputStream("/Users/admin/Documents/workspace/"
				+ "RitwikSolutionsCompany2/src/main/java/com/Ritwik/qa/Properties/goblevariables.properties");
		pro.load(fis);
	
		
	}
	
	@Test
	
	public static void Innitalaization()
	{
		String browsername =pro.getProperty("browsername1");
		
		if(browsername.equals("Chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/workspace/RitwikSolutionsCompany2/chromedriver");	
			driver = new ChromeDriver(); 
		}else
		{
			System.setProperty("webdriver.gecko.driver", "/Users/admin/Desktop/geckodriver");	
			driver = new FirefoxDriver(); 
		} 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
	}
	
	

}
