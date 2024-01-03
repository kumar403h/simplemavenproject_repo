package Demopractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenParameter {
@Test
public void receiveData() {
	Reporter.log("Parameter receving data",true);
	String URL = System.getProperty("url");
	Reporter.log(URL,true);
	WebDriver d = new ChromeDriver();
	d.get(URL);
	String name = System.getProperty("name");
	d.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(name);
	
}
}
