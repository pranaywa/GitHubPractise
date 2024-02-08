package practiseExpandTestingPages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
//public  String username;
//public  String password;
//public  String successLogin;

@FindBy(xpath = "//*[text()='Login Form']")
WebElement login;
@FindBy(xpath = "//*[text()='practice']")
WebElement practiseText;
@FindBy(xpath = "//*[text()='SuperSecretPassword!']")
WebElement passwordText;
@FindBy(xpath = "//*[@id='username']")
WebElement usernameField;
@FindBy(xpath = "//*[@id='password']")
WebElement passwordField;
@FindBy(xpath = "//*[text()='Login']")
WebElement loginButton;
@FindBy(xpath = "//*[text()='You logged into a secure area!']")
WebElement loginSecureText;
@FindBy(xpath = "//*[text()='Home']")
WebElement home;

public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}

public void clickOnLoginOnHomePage() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",login);
}
public String userNText() {
	String username = practiseText.getText();
	return username;
}
public String passText() {
	String password = passwordText.getText();
	return password;
}
public void enterLoginDetails() {
	usernameField.sendKeys(practiseText.getText());
	passwordField.sendKeys(passwordText.getText());
	
}
public void loginOnFormPage() {
	loginButton.click();
}
public String loginSecureM() {
	 String successM = loginSecureText.getText();
	 return successM;
}
public void navigateToHome() {
	home.click();
}



}
