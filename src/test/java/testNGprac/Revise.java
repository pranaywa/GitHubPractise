package testNGprac;

import org.testng.annotations.Test;

public class Revise {

	@Test(priority = 1, groups = "functional")
	public void testcase1() {
		System.out.println("this is the testcase");
	}
	@Test(priority = 2, groups = "functional", dependsOnMethods = "testcase1")
	public void testcase2() {
		System.out.println("this is the testcase");
	}
	
	@Test(priority = 3,groups ="functional",dependsOnMethods = "testcase2")
	public void testcase3() {
		System.out.println("this is the testcase");
	}
	@Test(priority = 1)
	public void testcase4() {
		System.out.println("this is a testcase4");
	}
	
 	
	
	
}
