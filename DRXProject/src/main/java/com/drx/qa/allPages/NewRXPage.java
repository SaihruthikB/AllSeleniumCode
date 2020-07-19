package com.drx.qa.allPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.drx.qa.BaseClass.BaseClass;

public class NewRXPage extends BaseClass {
	
	@FindBy(xpath="//input[@id='txt1']")
	WebElement drugsearchtextbox;
	@FindBy(xpath="//select[@id='sigdelivery']")
	WebElement deliveryDropDown;
	@FindBy(xpath="//select[@id='sigdose']")
	WebElement doseDropDown;
	@FindBy(xpath="//select[@id='sigdoseunits']")
	WebElement unitDropDown;
	@FindBy(xpath="//select[@id='sigfreq']")
	WebElement Sigfeq;
	@FindBy(xpath="(//span[@class='fbtns']/span/a)[1]")
	WebElement TimeButton;
	@FindBy(xpath="//input[@id='quantity']")
	WebElement quanlity;
	@FindBy(xpath="//input[@name='refills']")
	WebElement refills;
	@FindBy(xpath="(//div[@class='col-sm-12']/span/a)[2]")
	WebElement confirmPrescription;
	@FindBy(xpath="(//div[@id='targetDiv']/select/option)[1]")
	WebElement DrugSelect;
	@FindBy(xpath="(//div[@id='scrollableTBodyDrugSearchDrugList']/table/tbody/tr[2]/td/a)")
	WebElement drugselect;


	
	public NewRXPage()
	{
		PageFactory.initElements(d1, this);
	
	}
	
	//Actions
	
	public void DrugSearchText() throws InterruptedException
	{
		drugsearchtextbox.sendKeys("lipi");
		Thread.sleep(2000);
		
	}
	
	public void DrugSelect() throws InterruptedException
	{
	     Actions a1 = new Actions(d1);
	     a1.moveToElement(DrugSelect).doubleClick().build().perform();
	     Thread.sleep(2000);
	   //  return new DrugSearchPage();
	}
	
	public NewRXPage SelectDrugfromList() throws InterruptedException
	{
		drugselect.click();
		Thread.sleep(2000);
		return new NewRXPage();
	}
	
	
	public void deliveryDD()
	{
		Select s1 = new Select(deliveryDropDown);
		s1.selectByIndex(1);
	}
	public void DoseDD()
	{
		Select s2 = new Select(doseDropDown);
		s2.selectByIndex(2);
	}
	public void unitDD()
	{
		Select s2 = new Select(unitDropDown);
		s2.selectByIndex(2);
	}
	public void FreqDD()
	{
		Select s2 = new Select(Sigfeq);
		s2.selectByIndex(2);
	}
	
	public void enterQandR(String quanity, String refills1)
	{
		quanlity.sendKeys(quanity);
		refills.sendKeys(refills1);
	}
	
	public PhramcyPage clickonSendToPhramcy()
	{
		confirmPrescription.click();
		return new PhramcyPage();
	}
	
}
