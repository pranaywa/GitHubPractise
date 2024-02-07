package practiseExpandTestingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragNDropCircle {

	WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Drag and Drop Circles']")
	WebElement DragNDropCircleButton;
	@FindBy(xpath = "//*[@id='target']")
	WebElement target;
	@FindBy(xpath = "//*[@class='red']")
	WebElement redCircle;
	@FindBy(xpath = "//*[@class='green']")
	WebElement greenCircle;
	@FindBy(xpath = "//*[@class='blue']")
	WebElement blueCircle;
	@FindBy(xpath = "//*[text()='Home']")
	WebElement home;
	
	public DragNDropCircle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnDragNDrop() {
		DragNDropCircleButton.click();
	}
	public void putCircleInTraget() {
		Actions act = new Actions(driver);
		act.dragAndDrop(redCircle, target).perform();
		act.dragAndDrop(greenCircle, target).perform();
		act.dragAndDrop(blueCircle, target).perform();
		
	}
	public void navigateToHome() {
		home.click();
	}
}
