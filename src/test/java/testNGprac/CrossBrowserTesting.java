package testNGprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
WebDriver driver;

@Parameters("browser")
@Test(priority =1)
public void launchBrowser(String browser) {
	if(browser.equals("chrome")) {
		driver = new ChromeDriver();
		System.out.println("chrome is executing");
		
	}
	else {
		driver = new EdgeDriver();
		System.out.println("edge is execution");
	}
}
@Test(priority=2)
public void url() {
	driver.get("https://www.google.com");
	System.out.println("google is opened");
}
@Test(priority=3)
public void tearDown() {
	driver.quit();
	System.out.println("closing the browser");
}


}
