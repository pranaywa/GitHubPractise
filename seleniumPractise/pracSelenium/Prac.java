package pracSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://practice.expandtesting.com/form-validation");
	driver.findElement(By.xpath("//*[@name='pickupdate']")).click();
}
}
