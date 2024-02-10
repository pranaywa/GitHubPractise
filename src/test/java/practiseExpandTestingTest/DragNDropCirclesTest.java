package practiseExpandTestingTest;

import org.testng.annotations.Test;

import extendListeners.TestNGListeners;

public class DragNDropCirclesTest extends TestNGListeners
{

	@Test(priority = 1)
	public void clickOnDragNDrop() {
		dc.clickOnDragNDrop();
	}
	@Test(priority = 2)
	public void dragCircleInTraget() throws InterruptedException {
		dc.putCircleInTraget();
		Thread.sleep(2000);
	}
	@Test(priority = 3)
	public void navigateToHome() {
		dc.navigateToHome();
	}
	
}
