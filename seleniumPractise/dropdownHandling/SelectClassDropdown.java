package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.linkText("Create new account")).click();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("testname");
	driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("testlastname");
	driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("test@gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//*[text()='New password']/following-sibling::input")).sendKeys("password123");
	WebElement day = driver.findElement(By.cssSelector("select#day"));
	Select days = new Select(day);
	days.selectByIndex(28);
	WebElement month = driver.findElement(By.cssSelector("select#month"));
	Select months = new Select(month);
	months.selectByValue("7");
	WebElement year = driver.findElement(By.cssSelector("select#year"));
	Select years = new Select(year);
	years.selectByVisibleText("1998");
	driver.findElement(By.xpath("(//*[@class='_8esa'])[2]")).click();
	driver.findElement(By.cssSelector("button[name=websubmit]")).click();
	
}
}
