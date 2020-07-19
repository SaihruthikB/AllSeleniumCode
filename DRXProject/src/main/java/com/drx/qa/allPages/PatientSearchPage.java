package com.drx.qa.allPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drx.qa.BaseClass.BaseClass;

public class PatientSearchPage extends BaseClass {
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastnamefiled;
	
	@FindBy(xpath="(//span[@id='paddedLinks']/a)[1]")
	WebElement searchButton;
	
	
	public PatientSearchPage()
	{
		PageFactory.initElements(d1, this);
	}
	
	
	public void Searchuser(String lastmane)
	{
		lastnamefiled.sendKeys(lastmane);
	}
	
	public PatientDetailsPage searchbutton()
	{
		searchButton.click();
		return new PatientDetailsPage();
	}
}
