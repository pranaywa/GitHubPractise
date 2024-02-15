package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	public static void main(String[]args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Tiger");
		Thread.sleep(1000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//*[@class='wM6W7d']"));
		for(WebElement sugg:suggestions){
		String suggText = sugg.getText();
		System.out.println(suggText);
		if(suggText.equals("Tiger")) {
			sugg.click();
			break;
		}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,6309);");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,7658);");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,9310);");
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[text()='Bengal Tiger'])[2]")));

		}


}
