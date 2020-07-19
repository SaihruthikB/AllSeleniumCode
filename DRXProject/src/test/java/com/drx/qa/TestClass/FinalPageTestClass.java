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
import com.drx.qa.allPages.SendToPhramacyFinalPage;

public class FinalPageTestClass extends BaseClass{
	static LoginPage lp;
	static PatientDetailsPage pdp;
	static PatientSearchPage ps;
	static NewRXPage nrx;
	static PhramcyPage pp;
	static DrugSearchPage dsp;
	static SendToPhramacyFinalPage fp;
	
	
	public FinalPageTestClass()
	{
		super();
	}
	
	@BeforeMethod()
	public void SetUPmethod() throws InterruptedException
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
		fp = new SendToPhramacyFinalPage();
		
	}
	@Test
	public void sendToPhramacyFinalPage() throws InterruptedException
	{
		fp.clickOnPhramacybutton();
		fp.successpopup();
		fp.closelink();
		
	}
	
	

}
