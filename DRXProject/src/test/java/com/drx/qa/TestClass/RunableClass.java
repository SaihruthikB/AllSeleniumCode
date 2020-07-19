package com.drx.qa.TestClass;

import org.testng.TestNG;

public class RunableClass {
	
	static TestNG testng;

	public static void main(String[] args) {
		
		testng = new TestNG();
		testng.setTestClasses(new Class[] {FinalPageTestClass.class});
		testng.run();
		 

	}

}
