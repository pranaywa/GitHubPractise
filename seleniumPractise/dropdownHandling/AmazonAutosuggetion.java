package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutosuggetion {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("protein");
	Thread.sleep(1000);
	List<WebElement> sugg = driver.findElements(By.xpath("//*[@class='s-heavy']"));
	for(WebElement sug:sugg) {
		String text = sug.getText();
		System.out.println(text);
		if(text.equals("oats")) {
			sug.click();
			break;
		}
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement element = driver.findElement(By.xpath("//*[text()='Availability']"));
	js.executeScript("arguments[0].scrollIntoView();",element);
	WebElement checkBox = driver.findElement(By.xpath("//*[text()='Include Out of Stock']"));
	js.executeScript("arguments[0].click();",checkBox);
	Thread.sleep(5000);
	//driver.quit();
}
}
