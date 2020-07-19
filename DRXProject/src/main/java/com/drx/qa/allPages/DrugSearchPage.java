package com.drx.qa.allPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drx.qa.BaseClass.BaseClass;

public class DrugSearchPage extends BaseClass{
	
	@FindBy(xpath="(//div[@id='scrollableTBodyDrugSearchDrugList']/table/tbody/tr[2]/td/a)")
	WebElement drugselect;
	@FindBy(xpath="(//div[@id='scrollableTBodyDrugSearchDrugList']/table/tbody/tr[2]/td)[2]")
	WebElement detailsLink;
	 
	
	public DrugSearchPage()
	{
		PageFactory.initElements(d1, this);
	}
	
	public NewRXPage SelectDrugfromList() throws InterruptedException
	{
		drugselect.click();
		Thread.sleep(2000);
		return new NewRXPage();
	}
	
	
	

}
