package practiseExpandTestingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragNDrop {

	WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Drag and Drop']")
	WebElement dragNDropbutton;
	@FindBy(xpath = "//*[@id='column-a']")
	WebElement Aelement;
	@FindBy(xpath = "//*[@id='column-b']")
	WebElement Belement;
	@FindBy(xpath = "//*[text()='Home']")
	WebElement home;
	
	public DragNDrop(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOndragNDrop() {
		dragNDropbutton.click();
	}
	public void dragAndDropAction() {
		Actions act = new Actions(driver);
		act.dragAndDrop(Aelement, Belement).perform();
	}
	public void navigateToHomePage() {
		home.click();
	}
	
	
}
