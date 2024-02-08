package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindowHandling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().refresh();

	driver.get("https://www.facebook.com");
	driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(1000);
	WebElement learnMore = driver.findElement(By.xpath("//*[text()='Learn more']"));
	learnMore.click();

	String parentId = driver.getWindowHandle();
	System.out.println(parentId);

	Set<String> winIds = driver.getWindowHandles();

	for(String ids:winIds){

	if(!(parentId.equals(ids))){
	  driver.switchTo().window(ids);
	}
	}

	driver.findElement(By.xpath("//*[@role='combobox']")).sendKeys("this is testing");
	

driver.switchTo().window(parentId);
driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("switch to parent window");

	}
}

