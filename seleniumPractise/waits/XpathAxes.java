package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
    driver.findElement(By.linkText("Create new account")).click();
    Thread.sleep(3000);
    WebElement firstName = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
    firstName.sendKeys("testing");
}
}
