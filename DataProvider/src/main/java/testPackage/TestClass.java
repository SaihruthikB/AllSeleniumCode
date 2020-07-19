package testPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataProviderExample.DataProvider.utilclass;

public class TestClass {
	
	static WebDriver driver;

	@BeforeMethod
	public void SetupMethod() {
		
		driver = new ChromeDriver();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		

	}
	@DataProvider
	public static Object[][] dataprovider()
	{
		Object data[][]=utilclass.getTestData("LoginSheet");
		return data;
	}
	

	@Test(dataProvider = "dataprovider")
	public static void TestData(String username, String password) {
		driver.findElement(By.xpath("")).sendKeys(username);
		driver.findElement(By.xpath("")).sendKeys(password);

	}

	public void TearDown() {
		driver.quit();

	}

}
