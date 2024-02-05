package waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
// Implicit wait is type of dynamic wait and we also called it global waits
// Implicit wait is used when the webelement is update after some time or available in dom after page load.
// If we apply implicit wati in the automation script then it will applicable on all scirpt which we define below it.
// that we called it as the global wait because of on all script below it.	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
	Thread.sleep(1000);
	List<WebElement> sugg = driver.findElements(By.xpath("//*[@class='wM6W7d']"));
	for(WebElement suggestion:sugg) {
		String suggText=suggestion.getText();
		System.out.println(suggText);
		if(suggText.equals("selenium webdriver")) {
			suggestion.click();
			break;
		}
	}
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.xpath("//*[text()='Downloads']")).click();
	
}
}
