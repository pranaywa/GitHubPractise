package pracSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Tiger");
	Thread.sleep(1000);
	List<WebElement> suggestions = driver.findElements(By.xpath("//*[@class='wM6W7d']"));
	System.out.println(suggestions);
	for(WebElement sugg:suggestions) {
		String suggText = sugg.getText();
		System.out.println(suggText);
		if(suggText.equals("Tiger")) {
			sugg.click();
			break;
		}
		}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(1519,5727);");
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(1519,7062);");
	WebElement element = driver.findElement(By.xpath("//*[text()='Tiger Definition & Meaning']"));
	js.executeScript("arguments[0].click();",element);
	
	
	
	}
}

