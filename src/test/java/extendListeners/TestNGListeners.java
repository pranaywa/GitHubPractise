package extendListeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import practiseExpandTestingTest.BaseTest;
import utility.ScreenShotMethod;

public class TestNGListeners extends BaseTest implements ITestListener
{  
   public static ExtentTest test;
    ExtentReports extent = ExtentsReportGeneration.repoGen();
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase Started"+result.getName());
		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase Passed"+result.getName());
		test.log(Status.PASS,"TestCase Passed "+result.getName());
		try {
			String pathOfFolder =ScreenShotMethod.takeShot(driver, result.getName());
			test.addScreenCaptureFromPath(pathOfFolder);
		} catch (IOException e) {
			System.out.println("NullPointerException");
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCase Failed"+result.getName());
		test.log(Status.FAIL,"TestCase Passed "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase Skipped"+result.getName());
		test.log(Status.SKIP,"TestCase Passed "+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
