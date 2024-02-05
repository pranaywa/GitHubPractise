package extendListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentsReportGeneration {
	public static ExtentReports extent;
public static ExtentReports repoGen() { 
	String path = System.getProperty("user.dir")+"//ReportsFolder//PractiseExpandWebsite.html";
	ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
	reporter.config().setTheme(Theme.DARK);
	reporter.config().setReportName("Practise Expand Website Extent Report");
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Project Name","Practise Expand");
	extent.setSystemInfo("Environment", "SIT");
	extent.setSystemInfo("QA Analyst","Pranay Wane");
	return extent;
}
}
