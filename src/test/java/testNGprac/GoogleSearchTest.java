package testNGprac;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseGoogle  
{

	@Test(priority = 1)
	public void searchText() {
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("TestNG");
	}
	@Test(priority = 2)
	public void autoSuggestion() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//*[@class='wM6W7d']"));
		for(WebElement sugg:suggestion) {
			String webText = sugg.getText();
	    System.out.println(webText);
	    if(webText.equals("testng maven dependency")) {
	    	sugg.click();
	    	break;
	    }
		}
	}
	@Test(priority = 3)
	public void validatePageTitle() {
		String pageTitle = driver.getTitle();
		String title = "testng maven dependency - Google Search";
		assertEquals(title,pageTitle);
	}
}
