package com.pizzahut.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.baseclass.Baseclass;
import com.pizzahut.pages.Feedback;
import com.pizzahut.pages.Selection;
import com.pizzahut.utilities.Testutil;

public class FeedbackTestclass extends Baseclass {
	static Selection page;
	static Feedback feedback;
	static Testutil util;

	public FeedbackTestclass() {
		super();
	}

	@BeforeMethod
	public void setingup() {
		SetupMethod();
		page = new Selection();
		page.GreatExperenc();
		page.DropDown();
		page.DropDown2();
		feedback = page.Nextbutton();
		feedback = new Feedback();
		util = new Testutil();
	}

	@Test
	public void verifydropdown1() throws InterruptedException {
		feedback.firstListdropdown();
		Thread.sleep(2000);
	}

	@Test
	public void verifydropdown2() {
		feedback.SecondListdropdown();
	}

	@Test
	public void getTestData() throws InterruptedException {
		feedback.testData("my name is hruthik", "hruthik", "sai.hruthik12@gmail.com", "96664635767");
		//Thread.sleep(2000);
	}
	
	@Test
	public void dataPicker1()
	{
		feedback.DataPicker();
		util.Year();
		//Thread.sleep(2000);
		util.Month();
	
		
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
