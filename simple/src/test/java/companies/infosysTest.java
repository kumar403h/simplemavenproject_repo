package companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class infosysTest {
	@Test(groups = "smoke")
	public void launchinfosys() {
		WebDriver d = new ChromeDriver();
		d.get("https://www.infosys.com/");
		Reporter.log("infosys is launched");
	}
}
