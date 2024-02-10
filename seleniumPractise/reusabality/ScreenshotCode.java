package reusabality;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotCode {
public void takeSs(WebDriver driver,String name) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    String systemPath = System.getProperty("user.dir")+"//ScreenshotCaptures//"+name+".jpg";
    File path = new File(systemPath);
    FileHandler.copy(source, path);
}
public static void main(String[]args) throws InterruptedException, IOException{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("tiger");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(1000);
	ScreenshotCode ss = new ScreenshotCode();
	ss.takeSs(driver,"checkingTheGoogle");
	driver.quit();
}
}
