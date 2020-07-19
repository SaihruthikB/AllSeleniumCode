package retryAnalizer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReryLogic implements IRetryAnalyzer{
	
	int count = 0;
	int MaximumCount = 3;

	public boolean retry(ITestResult result) {
		if(count<MaximumCount)
		{
			count++;
			return true;
		}
		return false;
	}
	
	

}
