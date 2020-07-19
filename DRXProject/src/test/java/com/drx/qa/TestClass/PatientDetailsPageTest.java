package com.drx.qa.TestClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.drx.qa.BaseClass.BaseClass;
import com.drx.qa.allPages.LoginPage;
import com.drx.qa.allPages.PatientDetailsPage;
import com.drx.qa.allPages.PatientSearchPage;

public class PatientDetailsPageTest extends BaseClass{
	static PatientSearchPage ps;
	//static PatientSearchScreen pss;
	static LoginTestClass lt;
	static LoginPage lp;
	static PatientDetailsPage pdp;
	public PatientDetailsPageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setup()
	{
		browserSetUp();
		lp = new LoginPage();
		lp.enterUserdetails(pro.getProperty("usename"), pro.getProperty("password"));
		lp.submitButton();
		ps = new PatientSearchPage();
		ps.Searchuser(pro.getProperty("lastname"));
		ps.searchbutton();
		pdp = new PatientDetailsPage();	
		
	}
	
	@Test
	
	public void selectPatient()
	{
		pdp.Clickonuser();
	}
	
	
	

}
