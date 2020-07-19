package com.drx.qa.TestClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.drx.qa.BaseClass.BaseClass;
import com.drx.qa.allPages.DrugSearchPage;
import com.drx.qa.allPages.LoginPage;
import com.drx.qa.allPages.NewRXPage;
import com.drx.qa.allPages.PatientDetailsPage;
import com.drx.qa.allPages.PatientSearchPage;
import com.drx.qa.allPages.PhramcyPage;

public class SendToPhramcyTestClass extends BaseClass{
	
	static LoginPage lp;
	static PatientDetailsPage pdp;
	static PatientSearchPage ps;
	static NewRXPage nrx;
	static PhramcyPage pp;
	static DrugSearchPage dsp;
	
	public SendToPhramcyTestClass()
	{
		super();
		
	}
	
	@BeforeMethod
	public void Setup() throws InterruptedException
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
		nrx.DrugSearchText();
		nrx.DrugSelect();
		//nrx.SelectDrugfromList();
		dsp = new DrugSearchPage();
		dsp.SelectDrugfromList();
		nrx.deliveryDD();
		nrx.DoseDD();
		nrx.unitDD();
		nrx.FreqDD();
		nrx.enterQandR("10", "10");
		nrx.clickonSendToPhramcy();
		
	}
	
	@Test
	public void TitleTest()
	{
		String title=d1.getTitle();
		System.out.println(title);
	}

}
