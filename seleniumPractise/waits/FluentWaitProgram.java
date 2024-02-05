package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitProgram {
//FluentWait is a advance type of explicit wait because in this also we have to provide the expected conditions 
//But including that additionally we customize the polling time and also we can ignore the exceptions.
//For implement the fluent wait in the automation we have use the object of FluentWaits interface.
//and on the bases of the reference variable we call the until method and also provide the expected conditions
//like the explicit wait.
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		driver.navigate().refresh();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				                        .pollingEvery(Duration.ofSeconds(1))
				                        .withTimeout(Duration.ofSeconds(60))
				                        .ignoring(NoSuchElementException.class);
		WebElement smartphones = driver.findElement(By.xpath("//*[@alt='op']"));
		wait.until(ExpectedConditions.visibilityOf(smartphones));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",smartphones);
		
		
		
	}
}
