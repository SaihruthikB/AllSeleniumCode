package com.pizzahut.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pizzahut.baseclass.Baseclass;

public class Selection extends Baseclass {

	// pagefactory
	@FindBy(xpath = "//input[@value='1']")
	WebElement GoodExperec;

	@FindBy(xpath = "//select[@name='city_id']")
	WebElement radiobutton;

	@FindBy(xpath = "//select[@id='storeId']")
	WebElement radionbutton1;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement nextbutton;

	// ****************************************************

	// innitazling the objects
	// to inni the objects we nned to creat the constructor

	public Selection()

	{
		PageFactory.initElements(driver, this);
	}

	// ****************************************************88

	// Actions

	public String validateLoginPageTitle() {
		return driver.getTitle();

	}

	public void GreatExperenc() {
		GoodExperec.click();
	}

	public void DropDown() {
		Select s1 = new Select(radiobutton);
		s1.selectByIndex(1);
	}

	public void DropDown2() {
		Select s2 = new Select(radionbutton1);
		s2.selectByIndex(1);
	}

	public Feedback Nextbutton() {
		nextbutton.click();
		return new Feedback();
	}

}
