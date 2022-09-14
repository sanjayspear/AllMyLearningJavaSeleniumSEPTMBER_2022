package base;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends BasePage {

	public static ExtentReports extentReport;
	public static String extentReportPrefix;
	public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
	public ExtentManager() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static ExtentReports getReport() {
		if(extentReport == null) {
			setupExtentReport("Live Project 1");
		}
		return extentReport;
	}
	
	public static ExtentReports setupExtentReport(String testName) {
		extentReport = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/report/" +
		extentReportsPrefix_Name(testName) + ".html");
		extentReport.attachReporter(spark);
		
		extentReport.setSystemInfo("Tester", "Sanjay Y M");
		spark.config().setReportName("Regression Test");
		spark.config().setDocumentTitle("Test Results");
		spark.config().setTheme(Theme.DARK);
		
		return extentReport;
		
	}
	
	public static String extentReportsPrefix_Name (String testName) {
		String date = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		extentReportPrefix = testName + "_" + date;
		return extentReportPrefix;
	}
	
	public static void flushReport() {
		extentReport.flush();
	}
	
	public synchronized static ExtentTest getTest() {
		return extentTest.get();
	}
	
	public synchronized static ExtentTest createTest(String name, String description) {
		ExtentTest test = extentReport.createTest(name, description);
		extentTest.set(test);
		return getTest();
	}
	
	public synchronized static void log(String message) {
		getTest().info(message);
	}
	
	public synchronized static void pass(String message) {
		getTest().pass(message);
	}
	
	public synchronized static void fail(String message) {
		getTest().fail(message);
	}
	
	public synchronized static void attachImage() {
		getTest().addScreenCaptureFromPath(getScreenshotDestinationPath());
	}

}



 