package practiseExpandTestingTest;

import org.testng.annotations.Test;

import extendListeners.TestNGListeners;

public class DragNDropTest extends TestNGListeners 
{
@Test(priority = 1)
public void clickOnHomeButton() throws InterruptedException {
	d.clickOndragNDrop();
	Thread.sleep(2000);
}
@Test(priority = 2)
public void performDragAndDropAction() throws InterruptedException {
	d.dragAndDropAction();
	Thread.sleep(3000);
}
@Test(priority = 3)
public void navigateToHome() throws InterruptedException {
	d.navigateToHomePage();
	Thread.sleep(1000);
}

}
