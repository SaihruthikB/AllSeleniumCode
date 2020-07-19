package com.drx.qa.allPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drx.qa.BaseClass.BaseClass;

public class PatientDetailsPage extends BaseClass {
	
	@FindBy(xpath ="(//div[@id='scrollableTBodyThreeFourth']/table/tbody/tr/td/a)[1]")
	
	WebElement searchdeatils;
	
	public PatientDetailsPage()
	{
		PageFactory.initElements(d1, this);
	}
	
	public NewRXPage Clickonuser()
	{
		searchdeatils.click();
		return new NewRXPage();
	}

}
