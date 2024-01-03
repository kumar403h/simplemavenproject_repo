package extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReportsSteps {
@Test
public void reports() {
	String time = LocalDateTime.now().toString().replace(":", "-");
	//step 1: create an instance for ExtentSaprkReparter
	ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/extentReports_"+time+".html");
	//step 2:create an instance for ExtentReports
	ExtentReports report = new ExtentReports();
	//step 3:attach ExtentSparkReporter to ExtentReports
	report.attachReporter(spark);
	//step 4: create an instance for Extent test
	ExtentTest test = report.createTest("reports");
	//step 5:call log methods to write message in Extent reports
	test.log(Status.PASS, "added log message in reports");
	test.log(Status.PASS, "Login successful");
	//call flush method(write all log messages in to destination)
	report.flush();
}

}
