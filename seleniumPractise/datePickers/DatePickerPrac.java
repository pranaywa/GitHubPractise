package datePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerPrac {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//*[@name='q']")).sendKeys("jquery datepicker");
	 Thread.sleep(1000);
	 List<WebElement> sugg = driver.findElements(By.xpath("//*[@class='wM6W7d']"));
	 for(WebElement suggestion:sugg) {
		 String text = suggestion.getText();
		 System.out.println(text);
		 if(text.equals("jquery datepicker")) {
			 suggestion.click();
			 break;
		 }
	 }
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 driver.findElement(By.xpath("(//*[text()='Datepicker'])[1]")).click();
	 WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	 driver.switchTo().frame(iframe);
	 driver.findElement(By.xpath("//*[@id='datepicker']")).click();
	 while(true) {
		 WebElement currentTitle = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
		 String cT = currentTitle.getText();
		 System.out.println(cT);
		 String sT = "July 2024 ";
		 if(cT.equals(sT)) {
			 break;
		}
		 else {
			 driver.findElement(By.xpath("//*[text()='Next']")).click();
			 }
	 }
	 driver.findElement(By.xpath("//*[@data-date='7']")).click();
	 
	 
}
}
