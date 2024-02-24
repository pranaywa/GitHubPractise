package testNGprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseGoogle {
	WebDriver driver;
	
@Parameters("chrome")	
@BeforeClass
public void launch(String chrome) {
	if(chrome.equals("google")) {
		driver = new ChromeDriver();
	}
	else {
		driver = new EdgeDriver();
	}
	driver.get("https://www.google.com");
}
@AfterClass
public void tearDown() {
	//driver.quit();
}
}
