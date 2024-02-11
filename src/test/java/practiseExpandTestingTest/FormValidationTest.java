package practiseExpandTestingTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import extendListeners.TestNGListeners;

public class FormValidationTest extends TestNGListeners
{
 
	@Test(priority = 1)
	public void clickOnFormButtonOnHomePage() {
		f.clickOnForm();
	}
	@Test(priority = 2)
	public void fillTheValidationForm() {
		f.formValidationDetails();
	}
	@Test(priority = 3)
	public void clickOnRegisterButton() {
		f.clickOnRegister();
	}
	@Test(priority = 4)
	public void validatingTheThankYouMessage() {
		String actualText = f.validationMesage();
		assertEquals(actualText,"Thank you for validating your ticket");
	}
	@Test(priority = 5)
	public void navigateToHomePage() {
		f.navigateToHomePage();
	}
}
