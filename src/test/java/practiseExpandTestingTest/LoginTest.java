package practiseExpandTestingTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import extendListeners.TestNGListeners;

public class LoginTest extends TestNGListeners
{

	@Test(priority = 1)
	public void clickOnLoginOnHomePage() throws InterruptedException {
		login.clickOnLoginOnHomePage();
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void validateUsernameAndPasswordFromPage() {
		assertEquals(login.userNText(),"practice");
		assertEquals(login.passText(), "SuperSecretPassword!");
		}
	@Test(priority = 3)
	public void enterLoginDetails() throws InterruptedException {
		login.enterLoginDetails();
		Thread.sleep(2000);
	}
	@Test(priority = 4)
	public void clickOnLogin() throws InterruptedException {
		login.loginOnFormPage();
		Thread.sleep(2000);
	}
	@Test(priority = 5)
	public void validateSecuteLoginMesssage() {
		assertEquals(login.loginSecureM(),"You logged into a secure area!");
	}
	@Test(priority = 6)
	public void navToHome() {
		login.navigateToHome();
	}
}
