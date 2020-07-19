package customListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener{

	public void onFinish(ITestContext arg0) {
		
		
	}

	public void onStart(ITestContext arg0) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	public void onTestFailure(ITestResult arg0) {
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		
		Reporter.log("<a href=\"//Users//admin//Downloads\">Screenshot Link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href = \"//Users//admin//Downloads\"> <img height= 200 src=\"//Users//admin//Downloads\"></a>");
		
		System.out.println("On Failed Test-cases" + arg0.getName());
		
		
	}

	public void onTestSkipped(ITestResult arg0) 
	
	{
		System.out.println("Skiped due to missed functionlity" + arg0.getName());
	}

	public void onTestStart(ITestResult arg0) {
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
	}

}
