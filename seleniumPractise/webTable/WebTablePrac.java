package webTable;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import reusabality.ExcelWirte;

public class WebTablePrac {
	WebDriver driver;
public static void main(String[] args) throws IOException {
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--Headless");
	WebDriver driver = new ChromeDriver(ops);
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("webtable practice in selenium");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.xpath("(//*[text()='Techlistic'])[1]")).click();
	List<WebElement> table = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
	int i=0;
	int j=0;
	for(WebElement tables:table) {
		String text = tables.getText();
		ExcelWirte e = new ExcelWirte();
		
		e.excelW(i,j,text);
		i++;
	}
	
		
	
}
}
