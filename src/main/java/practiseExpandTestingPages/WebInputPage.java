package practiseExpandTestingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v119.emulation.model.DisplayFeature;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebInputPage {
	
	WebDriver driver;
	
@FindBy(xpath = "//*[text()='Web inputs']")
WebElement webInputButton;
@FindBy(xpath = "//*[text()='Display Inputs']")
WebElement displayInputButton;
@FindBy(xpath = "//*[text()='Clear Inputs']")
WebElement clearInputButton;
@FindBy(xpath = "//*[@id='input-number']")
WebElement inputNumber;
@FindBy(xpath = "//*[@id='input-text']")
WebElement inputText;
@FindBy(xpath = "//*[@id='input-password']")
WebElement inputPassword;
@FindBy(xpath = "//*[@id='input-date']")
WebElement inputDate;
@FindBy(xpath = "//*[text()='Home']")
WebElement home;

public WebInputPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void clickOnWebInput() {
	webInputButton.click();
}
public void inputDetails() {
	inputNumber.sendKeys("123456");
	inputText.sendKeys("This is testing");
	inputPassword.sendKeys("passwordfortesting");
	inputDate.sendKeys("12122012");
}
public void clickOnDisplayInput() {
	displayInputButton.click();
}
public void clickOnClearInput() {
	clearInputButton.click();
}
public void NaviagteToHome() {
	home.click();
}




}
