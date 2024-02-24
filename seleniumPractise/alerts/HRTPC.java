package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRTPC {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hrtchp.com/hrtc_info/");
	WebElement bookTicketOnling = driver.findElement(By.xpath("//*[@class='menu-right']/descendant::a[6]"));
	bookTicketOnling.click();
	driver.findElement(By.xpath("//*[@name='toPlaceName']")).click();
	driver.switchTo().alert().accept();
}
}
