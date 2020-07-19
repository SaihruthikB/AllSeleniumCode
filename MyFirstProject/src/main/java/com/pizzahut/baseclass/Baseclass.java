package com.pizzahut.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.pizzahut.utilities.Testutil;
import com.pizzahut.utilities.WebEventListener;

public class Baseclass {

	public static WebDriver driver;
	public static Properties pro;
	public static EventFiringWebDriver event;
	public static WebEventListener eventListener;

	public Baseclass() {
		try {
			pro = new Properties();
			FileInputStream fis = new FileInputStream("/Users/admin/Documents/workspace/MyFirs"
					+ "tProject/src/main/java/com/pizzahut/config/config.properties");

			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// @Test
	public static void SetupMethod() {
		String Browsername = pro.getProperty("browser");
		if (Browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		
		
		event=new EventFiringWebDriver(driver);
		eventListener=new WebEventListener();
		event.register(eventListener);
		driver = event;

		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.pageLoadTimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.implicitwait, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));

	}

}
