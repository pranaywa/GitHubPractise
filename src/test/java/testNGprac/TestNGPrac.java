package testNGprac;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGPrac {

	@Test(priority = 1)
	public void launch() {
		System.out.println("launching the browser");
	}
	@Test(priority = 2)
	public void nagivateToApplication() {
		System.out.println("Website opened");
	}
	@Test(priority = 3,dataProvider = "ExcelData",dataProviderClass = testNGprac.DataProviderTestNG.class)
	public void usernamePassword(String s1,String s2) {
		System.out.println(s1+" "+s2);
	}
	@Test(priority = 5)
	public void login() {
		System.out.println("clicked on the login button");
	}
	@Test(priority = 6)
	public void tearDown() {
		System.out.println("Closing the browser");
	}
	
}
