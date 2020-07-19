package com.Ritwik.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ritwik.qa.baseclass.TestBaseClass;
import com.Ritwik.qa.pages.Homepage;

public class HomepageTest extends TestBaseClass {
	
	Homepage home;

	public HomepageTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void Setup() throws IOException
	{
		Innitalaization();
		 home = new Homepage();		
	}
	
	@Test
	public void TitleValidation()
	{
		String Title=home.Gettitle();
		Assert.assertEquals(Title, "Ritwik Software Technologies Pvt. Ltd");
	}
	
	@Test
	public void validateimage1()
	{
		boolean b2=home.validateimage();
	Assert.assertTrue(b2);
	}
	
	
	@AfterMethod	
	public void Terminate()
	{
		driver.quit();
	}

}
