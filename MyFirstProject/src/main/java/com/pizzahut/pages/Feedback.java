package com.pizzahut.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pizzahut.baseclass.Baseclass;

public class Feedback extends Baseclass{
	
	//PageFactory

	@FindBy(xpath="//select[@id='sub_category_1']")
	WebElement listdropdown1;
	
	@FindBy(xpath="//select[@id='sub_category_1']")
	WebElement listdropdown2;
	
	@FindBy(xpath="//textarea[@name='tell_us_more']")
	WebElement Tellusabout;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@name='email_address']")
	WebElement emailaddress;
	
	@FindBy(xpath="//input[@name='mobile_no']")
	WebElement mobileNumber;
	
	@FindBy(xpath="//input[@name='date_of_visit']")
	WebElement datapicker;
	
	
	//init method for innitialsation
	
	public Feedback()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void firstListdropdown()
	{
		Select s1 = new Select(listdropdown1);
		s1.selectByIndex(1);
	}
	
	public void SecondListdropdown()
	{
		Select s2 = new Select(listdropdown2);
		s2.selectByIndex(1);
	}
	
	public void testData(String telus, String name1, String emailid, String mobilenumber)
	{
		Tellusabout.sendKeys(telus);
		name.sendKeys(name1);
		emailaddress.sendKeys(emailid);
		mobileNumber.sendKeys(mobilenumber);
		
	}
	
	public void DataPicker()
	{
		datapicker.click();
	}
	
	
}
