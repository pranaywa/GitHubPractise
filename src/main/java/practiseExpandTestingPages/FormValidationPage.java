package practiseExpandTestingPages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormValidationPage {

	WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Form Validation']")
	WebElement formValidationHome;
	@FindBy(xpath = "//*[@name='ContactName']")
	WebElement contactName;
	@FindBy(xpath = "//*[@name='contactnumber']")
	WebElement contactNumber;
	@FindBy(xpath = "//*[@name='pickupdate']")
	WebElement	pickUpDate;
	@FindBy(xpath = "//*[@name='payment']")
	WebElement paymentMethod;
	@FindBy(xpath = "//*[text()=' Register ']")
	WebElement register;
	@FindBy(xpath = "//*[contains(text(),'Thank you for validating ')]")
	WebElement validationText;
	@FindBy(xpath = "//*[text()='Home']")
	WebElement homeButton;
	
	public FormValidationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnForm() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",formValidationHome);
		js.executeScript("arguments[0].click();",formValidationHome);
	}
	public void formValidationDetails() {
		contactName.sendKeys("pranay");
		contactNumber.sendKeys("012-3456789");
		pickUpDate.sendKeys("12122023");
		Select sel = new Select(paymentMethod);
		sel.selectByVisibleText("cash on delivery ");
	}
	public void clickOnRegister() {
		register.click();
	}
	public String validationMesage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String message = validationText.getText();
		return message;
	}
	public void navigateToHomePage() {
		homeButton.click();
	}
	
	
	
	
	
	
}
