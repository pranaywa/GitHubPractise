package testNGprac;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgPrac1 {

	@Test(priority = 1)
	@Parameters("engine")
	public void testcase1(String string) {
		System.out.println("this is frist test case "+string);
	}
	@Test(priority = 2)
	public void testcase2() {
		System.out.println("this is second test case ");
	}
	@Test(priority = 3)
	public void testcase3() {
		System.out.println("this is third testcase");
	}
	
}
