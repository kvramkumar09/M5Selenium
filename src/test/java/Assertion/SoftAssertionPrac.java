package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPrac {
	
	@Test
	public void stricklevelcomparision() {
		String expectedValue="BANGALORE";
		String actualValue="bangalore";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualValue, expectedValue);
		s.assertAll();
		System.out.println("hello");
		
	}

	@Test
	public void containslevelSoftAssertion() {
		String expectedValue="GOA";
		String actualValue="Madgaon";
		SoftAssert s = new SoftAssert();
		s.assertTrue(actualValue.contains(expectedValue));
		s.assertAll();	
	}
}
