package testNGScreenShots;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.drx.qa.BaseClass.BaseClass;
import com.drx.qa.Utilities.CommonUtilitiesClass;

public class ScreenshotsforFailed extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		CommonUtilitiesClass.TakeScreenShot(result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
	
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
