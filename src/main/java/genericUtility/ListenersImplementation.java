package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	
	Seleniumutility sUtil = new Seleniumutility();
	JavaUtility jUtil = new JavaUtility();
	ExtentReports report;
	ExtentTest test;
	String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-YYYY  hh-mm-ss");
	

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "Test Method Started");
		test=report.createTest(methodName);    //Creating test fields in report with @Test method name
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName +"Test  executed Successfully");
		
		test.log(Status.PASS, methodName+"Test  executed Successfully");   //Logging as FAIL in report
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+ "Test FAILED");
		Throwable errors = result.getThrowable();
		test.fail(errors);
		
		test.log(Status.FAIL, methodName+"Test  Failed");
		String ScreenshotName = methodName+dateTimeStamp;     //Loggin as fail in the report
		try {
			//Capturing the Screenshot
			String path=sUtil.captureScreenshot(BaseClass.sDriver, ScreenshotName);
			//attaching the screenshot tp the report for the @Test which is failing
			test.addScreenCaptureFromPath(path);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "Test Skipped");
		test.log(Status.SKIP,methodName+"Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite Execution Started");
		//COnfirguration of Extent Reports
				ExtentSparkReporter reporter = new ExtentSparkReporter(".\\ExtentReports\\report-"+dateTimeStamp+".html");
				reporter.config().setDocumentTitle("VTiger Reports");
				reporter.config().setReportName("VTiger Execution Reports");
				reporter.config().setTheme(Theme.DARK);
				
				//Generating Report
				report = new ExtentReports();
				report.attachReporter(reporter);
				report.setSystemInfo("OS","Windows");
				report.setSystemInfo("Browser","Chrome");
				report.setSystemInfo("Base URL","https://localhost:8080");
				report.setSystemInfo("TestEngineer","Ram Kumar KV");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite Execution ended");
		report.flush();      //Flush out the report and generate the report in the location
	}

}
