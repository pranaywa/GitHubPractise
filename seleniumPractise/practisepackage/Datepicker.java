package practisepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/datepicker/");
	WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	driver.switchTo().frame(iframe);
	driver.findElement(By.cssSelector("input#datepicker")).click();
	while(true) {
		WebElement title = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
		String currentTitle = title.getText();
		System.out.println(currentTitle);
		String setTitle = "April 2023";
		if(currentTitle.equals(setTitle)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//*[text()='Prev']")).click();
		}
	}
	driver.findElement(By.xpath("//*[@data-date='12']")).click();
}
}
