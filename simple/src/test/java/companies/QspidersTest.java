package companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class QspidersTest {
@Test
public void launchQspiders() {
	WebDriver d = new ChromeDriver();
	d.get("https://qspiders.com/");
	Reporter.log("Qspoiders is launched");
}
}
