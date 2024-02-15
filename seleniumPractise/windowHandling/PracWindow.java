package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);

		WebElement learnMore = driver.findElement(By.xpath("//*[text()='Learn more']"));
		learnMore.click();
		learnMore.click();
		learnMore.click();

		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		Set<String> winIds = driver.getWindowHandles();
		String arrwin[] = new String [winIds.size()];

		int i=0;
		for(String ids:winIds){
		arrwin[i]=ids;
		i++;
		}

		for(String id:arrwin){
		System.out.println(id);
		}
        Thread.sleep(1000);
		driver.switchTo().window(arrwin[1]);
		driver.findElement(By.xpath("(//*[@dir='ltr'])[2]")).sendKeys("This is the seconds window");
		Thread.sleep(1000);
		driver.switchTo().window(arrwin[2]);
		driver.findElement(By.xpath("(//*[@dir='ltr'])[2]")).sendKeys("This is the third window");
		Thread.sleep(1000);
		driver.switchTo().window(arrwin[3]);
		driver.findElement(By.xpath("(//*[@dir='ltr'])[2]")).sendKeys("This is the fouth window");
        Thread.sleep(1000);
        driver.switchTo().window(parentId);
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("This is the parent window");
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(2000);
        driver.quit();

	}
}
