package com.drx.qa.TestClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.drx.qa.BaseClass.BaseClass;
import com.drx.qa.allPages.LoginPage;
import com.drx.qa.allPages.NewRXPage;
import com.drx.qa.allPages.PatientDetailsPage;
import com.drx.qa.allPages.PatientSearchPage;

public class NewRxTestClass extends BaseClass{
	
	static LoginPage lp;
	static PatientDetailsPage pdp;
	static PatientSearchPage ps;
	static NewRXPage nrx;
	
	
	public NewRxTestClass()
	{
		super();
	}
	
	@BeforeMethod
	public void setUpMethod() throws InterruptedException
	{
		browserSetUp();
		lp = new LoginPage();
		lp.enterUserdetails(pro.getProperty("usename"), pro.getProperty("password"));
		lp.submitButton();
		ps = new PatientSearchPage();
		ps.Searchuser(pro.getProperty("lastname"));
		ps.searchbutton();
		pdp = new PatientDetailsPage();	
		pdp.Clickonuser();
		nrx = new NewRXPage();
		
	}
	
	@Test
	public void searchDrug() throws InterruptedException
	{
		nrx.DrugSearchText();
	}
	@Test
	public void selectDrug() throws InterruptedException
	{
		nrx.DrugSelect();
	}
	@Test
	public void DelievryDDP()
	{
		nrx.deliveryDD();
	}
	public void Dose()
	{
		nrx.DoseDD();
	}
	public void unit()
	{
		nrx.unitDD();
	}
	public void fre()
	{
		nrx.FreqDD();
	}
	public void enterQandRefills()
	{
		nrx.enterQandR("10", "10");
	}
	
	public void SendToPhramcy()
	{
		nrx.clickonSendToPhramcy();
	}
	

}
