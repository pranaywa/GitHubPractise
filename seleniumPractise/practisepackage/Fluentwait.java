package practisepackage;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwait {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.navigate().refresh();
	FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver)
			                     .pollingEvery(Duration.ofSeconds(60))
			                     .withTimeout(Duration.ofSeconds(60))
			                     .ignoring(NoSuchElementException.class);
	WebElement bedSheet = driver.findElement(By.xpath("//*[@alt='Daily essentials']"));
	f.until(ExpectedConditions.visibilityOf(bedSheet));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",bedSheet);
}
}
