package testPackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void test()
	{
		System.out.println("Test");
		Reporter.log("Reporter", true);
		Assert.assertTrue(true);
	}

}
