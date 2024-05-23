package pracSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[]args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	List<WebElement> columElements = driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td"));
	int countOfColum = columElements.size();
	System.out.println("count of colum = "+countOfColum);
	List<WebElement> rowElements = driver.findElements(By.xpath("//table[@id='countries']//tr"));
	int countOfRow = rowElements.size();
	System.out.println("count of row = "+countOfRow);
	Thread.sleep(2000);
	WebElement checkBox1 = driver.findElement(By.xpath("//td[text()='Kabul']//preceding-sibling::td//input"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",checkBox1);
	WebElement check2 = driver.findElement(By.xpath("//tbody//tr//td[text()='Copenhagen']//preceding-sibling::td//input"));
	js.executeScript("arguments[0].click();",check2);
}
}
