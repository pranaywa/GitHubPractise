package javaPractiseQuestion;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prac {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(null);
		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver)
				                      .pollingEvery(Duration.ofSeconds(1))
				                      .withTimeout(Duration.ofSeconds(60))
				                      .ignoring(NoSuchElementException.class);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
	}
}
