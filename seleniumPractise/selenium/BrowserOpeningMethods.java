package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpeningMethods {
	 static WebDriver driver;
public void browsers(String browser) {
	String chrome = "chrome";
	String firefox = "firefox";
	String edge = "edge";
	if(browser.equals(chrome)) {
		driver = new ChromeDriver();
	}
	else if (browser.equals(firefox)) {
		driver = new FirefoxDriver();
	}
	else if (browser.equals(edge)) {
		driver = new EdgeDriver();
	}
}
public static void main(String[]args) {
	BrowserOpeningMethods m = new BrowserOpeningMethods();
       m.browsers("firefox");
       if(driver.getWindowHandles().size()>0) {
    	   System.out.println("Browser is opened");
       }
       else {
    	   System.out.println("Browser is not open");
       }
}
}
