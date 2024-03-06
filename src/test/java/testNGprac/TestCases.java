package testNGprac;

import org.testng.annotations.Test;

public class TestCases {

	@Test(priority = 1)
	public void test1() {
		System.out.println("TestCase 1");
	}
	@Test(priority = 2)
	public void test2() {
		System.out.println("TestCase 2");
	}
	@Test(priority = 3)
	public void test3() {
		System.out.println("TestCase 3");
	}
	@Test(priority = 4)
	public void test4() {
		System.out.println("TestCase 4");
	}
	@Test(priority = 5)
	public void test5() {
		System.out.println("TestCase 5");
	}
	
}
