package practiseExpandTestingTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import practiseExpandTestingPages.DragNDrop;
import practiseExpandTestingPages.DragNDropCircle;
import practiseExpandTestingPages.WebInputPage;

public class BaseTest {
public static WebDriver driver;
public WebInputPage p;
public DragNDrop d;
public DragNDropCircle dc;

@BeforeSuite
public void initBrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practice.expandtesting.com/");
}

@BeforeClass
public void objects() {
	p = new WebInputPage(driver);
	d = new DragNDrop(driver);
	dc = new DragNDropCircle(driver);
	
}

@AfterSuite
public void tearDown() {
	driver.quit();
}


}
