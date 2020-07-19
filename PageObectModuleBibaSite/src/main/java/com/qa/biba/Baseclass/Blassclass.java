package com.qa.biba.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Blassclass {
	
	public static Properties pro;
	public static  WebDriver d1;
	
	public Blassclass()
	{
		
		try {
			pro = new Properties();
			FileInputStream fis = new FileInputStream("/Users/admin/Documents/workspace/PageObectMo"
					+ "duleBibaSite/src/main/java/config/config.properties");
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void Innitalization()
	{
		String browsername= pro.getProperty("browser");
		if(browsername.equals("chrome"))
		{
		  d1= new ChromeDriver();
		}
		else{
			d1= new FirefoxDriver();
		}
		
		d1.manage().deleteAllCookies();
		d1.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		d1.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		d1.get(pro.getProperty("url"));
	}

}
