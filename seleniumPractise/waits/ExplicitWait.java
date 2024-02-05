package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
//Explicit is a type of dynmanic waits and used when we to wait until the expected condition got satisfied.
//Explicit wait is applied on webelement to satisfys the specific type of conditions.
//For implement the explicit wait we have use WebDriverWait object and on the bases of reference variable we 
//we call until method in that we the class that ExpectedConditions and the method of that class.
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.navigate().refresh();
	driver.navigate().refresh();
	driver.navigate().refresh();
	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(60));
	WebElement dailyNeeds = driver.findElement(By.xpath("//*[@alt='Daily essentials']"));
	w.until(ExpectedConditions.visibilityOf(dailyNeeds));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",dailyNeeds);
	
}
}
