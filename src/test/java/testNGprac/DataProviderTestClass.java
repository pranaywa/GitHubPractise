package testNGprac;

import org.testng.annotations.Test;

public class DataProviderTestClass {

	@Test(dataProvider = "DPClass",dataProviderClass = testNGprac.DataProviderClasss.class)
	public void testCase(Object ob1, Object ob2) {
		System.out.print(ob1+" "+ob2);
	}
}
