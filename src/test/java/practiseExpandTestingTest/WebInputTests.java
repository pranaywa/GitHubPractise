package practiseExpandTestingTest;

import org.testng.annotations.Test;

import extendListeners.TestNGListeners;

public class WebInputTests extends TestNGListeners 
{
	@Test(priority = 1)
	public void clickOnWebInputButton() { 	
		p.clickOnWebInput();
	}
	@Test(priority = 2)
	public void inputTheDetails() {
		p.inputDetails();
	}
	@Test(priority = 3)
	public void showTheInputDetails() throws InterruptedException {
		p.clickOnDisplayInput();
		Thread.sleep(3000);
		p.clickOnClearInput();
	}
	@Test(priority = 4)
	public void navigateTohomePage() {
		p.NaviagteToHome();
	}

}
