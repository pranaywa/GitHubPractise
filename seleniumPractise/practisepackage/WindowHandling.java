package practisepackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.linkText("Create new account")).click();
	String parentId = driver.getWindowHandle();
	System.out.println(parentId);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebElement learnMore = driver.findElement(By.xpath("//*[text()='Learn more']"));
	learnMore.click();
	learnMore.click();
	learnMore.click();
	Set<String> winIds = driver.getWindowHandles();
	int totalIds = winIds.size();
	String arrwin[] = new String[totalIds];
	int i=0;
	for(String ids:winIds) {
		arrwin[i] =ids;
		i++;
	}
	for(String id:arrwin) {
		System.out.println(id);
	}
	driver.switchTo().window(arrwin[1]);
	driver.findElement(By.xpath("//*[@class='xh8yej3']/descendant::input")).sendKeys("FirstWindow");
	String titleOfPage = driver.getTitle();
	System.out.println(titleOfPage);
	driver.switchTo().window(parentId);
	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Parent window");
	
	
	
	
	
	
	
}
}
