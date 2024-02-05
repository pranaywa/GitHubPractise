package practiseExpandTestingTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import practiseExpandTestingPages.WebInputPage;

public class BaseTest {
static WebDriver driver;
public WebInputPage p;

@BeforeSuite
public void initBrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practice.expandtesting.com/");
}

@BeforeClass
public void objects() {
	p = new WebInputPage(driver);
	
}

@AfterSuite
public void tearDown() {
	driver.quit();
}


}
