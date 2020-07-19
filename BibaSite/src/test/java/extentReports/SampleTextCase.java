package extentReports;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleTextCase {
	
 public ExtentHtmlReporter Reporter;
 public ExtentReports Extent;
 public ExtentTest Test;
 
 @BeforeTest
 public void setup()
 {
	 Reporter = new ExtentHtmlReporter(".//reports//extent.html");
	 Reporter.config().setEncoding("uft-8");
	 Reporter.config().setDocumentTitle("Hruthik Extent Reports");
	 Reporter.config().setReportName("Hruthik Extent Reports---1");
	 Reporter.config().setTheme(Theme.STANDARD);
	 
	 
	 Extent = new ExtentReports();
	 Extent.attachReporter(Reporter);
	 Extent.setSystemInfo("Automation Tester", "hruthik");
	 Extent.setSystemInfo("Organisation", "Ritwik");
	 Extent.setSystemInfo("Mobile number", "9666463576");
	 
 }
 
 @org.testng.annotations.Test
 public void LoginTest()
 {
	 Test = Extent.createTest("Login Test");
	 System.out.println("login succesfully");
 }
 
 @org.testng.annotations.Test
 public void Registration()
 {
	 Test = Extent.createTest("Registration Testcase");
	 System.out.println("Registration succesfully completed");
 }
 @org.testng.annotations.Test
 public void Skiped()
 {
	 Test = Extent.createTest("Skipped Testcase");
	 System.out.println("Skipped  succesfully completed");
 }
 
 @AfterMethod
	public void tearDown(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			
		String MethodName	= result.getMethod().getMethodName();
		
		String LogText = "<b>" + "TestCases" + MethodName.toUpperCase()+ " Failedd" + "</b>";
		
		Markup m = MarkupHelper.createLabel(LogText, ExtentColor.RED);
		Test.fail(m);
			
		}else if (result.getStatus() == ITestResult.SKIP) {
			
			
			String MethodName	= result.getMethod().getMethodName();
			
			String LogText = "<b>" + "TestCases" + MethodName.toUpperCase()+ " Skip" + "</b>";
			
			Markup m = MarkupHelper.createLabel(LogText, ExtentColor.RED);
			Test.skip(m);
				
			
		}else if (result.getStatus() == ITestResult.SUCCESS) {
			
String MethodName	= result.getMethod().getMethodName();
			
			String LogText = "<b>" + "TestCases" + MethodName.toUpperCase()+ " Passed" + "</b>";
			
			Markup m = MarkupHelper.createLabel(LogText, ExtentColor.RED);
			Test.pass(m);
		}
		
 }
 @AfterTest
	public void endReport() {

		Extent.flush();
	}
}
