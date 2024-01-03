package companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TcsTest {
	@Test(groups = "system")
	public void launchinfosys() {
		WebDriver d = new ChromeDriver();
		d.get("https://www.tcs.com/");
		Reporter.log("Tcs is launched");
	}
}
