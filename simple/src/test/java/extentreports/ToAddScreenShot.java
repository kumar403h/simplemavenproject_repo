package extentreports;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToAddScreenShot {
@Test
public void screenshot() {
	WebDriver d = new ChromeDriver();
	d.get("https://demowebshop.tricentis.com/");
	TakesScreenshot ts = (TakesScreenshot) d;
	String screen = ts.getScreenshotAs(OutputType.BASE64);
	String time = LocalDateTime.now().toString().replace(":", "-");
	ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/ectentscreenshot_."+time+"html");
	ExtentReports rep = new ExtentReports();
	rep.attachReporter(spark);
	ExtentTest test = rep.createTest("screenshot");
	test.log(Status.INFO, "screenshot taken");
	test.addScreenCaptureFromBase64String(screen,"error img");
	rep.flush();

}
}
