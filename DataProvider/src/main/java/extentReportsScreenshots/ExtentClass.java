package extentReportsScreenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;//
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentClass {

	public static WebDriver d1;
	public static ExtentReports extent;
	public static ExtentTest loggers;
	@BeforeTest
	public static void SetExtent() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/" + "ExtentReports.html", true);

		extent.addSystemInfo("Host name", "MacBook Pro");
		extent.addSystemInfo("TesterName", "Sai HruthikBolly");
		extent.addSystemInfo("Environment", "6.1 QA environment");

	}

	@AfterTest
	public static void endReport() {
		extent.flush();
		extent.close();
	}

	public static String getScreenShot(WebDriver d1, String ScreenShot) throws IOException {

		String dateName = new SimpleDateFormat("YYY-MM-dd-hh:mm:ss.").format(new Date());
		/*
		 * File srcFile = ((TakesScreenshot)
		 * d1).getScreenshotAs(OutputType.FILE); try {
		 * FileUtils.copyFile(srcFile, new File("user.dir" + "/FailedTestCases/"
		 * + ScreenShot + dateName + ".png")); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		TakesScreenshot ts = (TakesScreenshot) d1;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + ScreenShot + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;

	}

	@BeforeMethod
	public static void innisilization() {
		d1 = new ChromeDriver();
		d1.get("https://www.biba.in/");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void verifyTitle() {

		loggers = extent.startTest("ExtentClass");

		String s1 = d1.getTitle();
		Assert.assertEquals(s1, "Ethnic Wear - Online Indian Ethnic Wear for Womens & Girls - Biba");
	}

	@Test
	public void logoTest() {
		loggers = extent.startTest("ExtentClass");
		Boolean b1 = d1.findElement(By.xpath("//img[@class='logo']")).isDisplayed();
		Assert.assertTrue(b1);
	}

	@AfterMethod
	public void TearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			loggers.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());// to
																					// add
																					// name
																					// in
																					// the
																					// extent
																					// reports
			loggers.log(LogStatus.FAIL, "Test Failed Error message is " + result.getThrowable());
			// loggers.log(LogStatus.FAIL, "");

			String sName = ExtentClass.getScreenShot(d1, result.getName());
			loggers.log(LogStatus.FAIL, loggers.addScreenCapture(sName)); // to
																			// add
																			// screenshot
																			// to
																			// the
																			// extent
																			// reports

		} else if (result.getStatus() == ITestResult.SKIP) {
			loggers.log(LogStatus.SKIP, "Test Case Skiped is " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			loggers.log(LogStatus.PASS, "Test Case Passed is " + result.getName());
		}

		extent.endTest(loggers);
		d1.quit();

	}

}
