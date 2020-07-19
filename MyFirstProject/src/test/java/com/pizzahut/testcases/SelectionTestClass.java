package com.pizzahut.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pizzahut.baseclass.Baseclass;
import com.pizzahut.pages.Feedback;
import com.pizzahut.pages.Selection;

public class SelectionTestClass extends Baseclass {

	static Selection page;
	static Feedback feedback;

	public SelectionTestClass() {
		super();
	}

	@BeforeMethod()
	public void setup() {
		SetupMethod();
		page = new Selection();
	}

	@Test(priority=1)
	public void selectTitlePage() {
		String title = page.validateLoginPageTitle();
		AssertJUnit.assertEquals(title, "Pizza Hut-Menu");
	}

	@Test(priority=2)
	public void DropDown2() {
		page.GreatExperenc();
	}

	@Test(priority=3)
	public void DropDown3() {
		page.DropDown();
		
	}
	
	@Test(priority=4)
	public void DropDown4() {
		page.DropDown2();
	}
		
		@Test(priority=5)
		public void submit() {
			feedback =page.Nextbutton();
		
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
