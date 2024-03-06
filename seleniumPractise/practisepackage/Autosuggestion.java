package practisepackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion {
public static void main(String[]args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
	Thread.sleep(1000);
	List<WebElement> suggestions = driver.findElements(By.xpath("//*[@class='wM6W7d']"));
	for(WebElement sugg:suggestions) {
	String text = sugg.getText();
	System.out.println(text);
	if(text.equals("selenium webdriver")) {
		sugg.click();
		break;
	}
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(1519,4108)");
    Thread.sleep(1000);
    js.executeScript("window.scrollBy(1519,5676)");
    Thread.sleep(1000);
    js.executeScript("window.scrollBy(1519,5676)");
    WebElement linkRuby=driver.findElement(By.xpath("//*[text()='RubyGems']"));
    linkRuby.click();	
}
}
