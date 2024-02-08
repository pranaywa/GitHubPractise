package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandling {
	public static void main(String[]args) throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);

		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		WebElement learnMore = driver.findElement(By.xpath("//*[text()='Learn more']"));
		boolean isPresent=learnMore.isDisplayed();
		System.out.println(isPresent);
		learnMore.click();
		learnMore.click();
		learnMore.click();

		Set<String> winIds = driver.getWindowHandles();

		String [] arrwin = new String[winIds.size()];
		int i = 0;
		for(String ids:winIds){
		arrwin[i] = ids;
		i++;
		}

		for(String arrids:arrwin){
		System.out.println(arrids);
		}

		driver.switchTo().window(arrwin[1]);
		driver.findElement(By.xpath("(//*[@dir='ltr'])[2]")).sendKeys("this is the first window");
		Thread.sleep(2000);
		driver.switchTo().window(arrwin[2]);
		driver.findElement(By.xpath("(//*[@dir='ltr'])[2]")).sendKeys("this is the second window");
		Thread.sleep(2000);
		driver.switchTo().window(arrwin[3]);
		driver.findElement(By.xpath("(//*[@dir='ltr'])[2]")).sendKeys("this is the thrid window");
		Thread.sleep(2000);
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("the testing is completed");
        driver.close();
        Thread.sleep(2000);
        driver.quit();
		}
}
