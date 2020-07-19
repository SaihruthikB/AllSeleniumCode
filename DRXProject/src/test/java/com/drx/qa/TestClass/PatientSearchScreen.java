package com.drx.qa.TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.drx.qa.BaseClass.BaseClass;
import com.drx.qa.allPages.LoginPage;
import com.drx.qa.allPages.PatientSearchPage;

public class PatientSearchScreen extends BaseClass{
	
	static PatientSearchPage ps;
	static PatientSearchScreen pss;
	static LoginTestClass lt;
	static LoginPage lp;
	
	public PatientSearchScreen()
	{
		super();
	}
	
	@BeforeMethod
	public void setmethod() throws InterruptedException
	{
		browserSetUp();
		
		lp = new LoginPage();
		lp.enterUserdetails(pro.getProperty("usename"), pro.getProperty("password"));
		lp.submitButton();
		ps = new PatientSearchPage();
		
	}
	
	@Test
	public void searchuser()
	{
		ps.Searchuser(pro.getProperty("lastname"));
	}
	
	@Test
	public void searchbutton() 
	
	{
		ps.searchbutton();
	}
	
	@AfterMethod
	public void tearDown()
	{
		d1.quit();
	}

}
