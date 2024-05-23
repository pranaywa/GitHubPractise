package testNGprac;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExplans {
@Parameters("chrome")
@Test
public void test1(String browser) {
if(browser.equals("google")) {
	System.out.println("google opened");
}
else {
	System.out.println("firefox opened");
}
}
}
