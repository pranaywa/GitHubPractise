package alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsPopup {
public static void main(String[]args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
	searchField.sendKeys("alerts popup practice");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.xpath("(//*[@jsname='UWckNb']/child::h3)[1]")).click();
	driver.findElement(By.xpath("//*[@name='alert']")).click();
	driver.switchTo().alert().accept();
}
}
