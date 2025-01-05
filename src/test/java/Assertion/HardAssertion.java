package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
		public void strictLevelHardAssertion() {
			String expectedvalue="selenium";
			String actualValue="Selenium";
			Assert.assertEquals(actualValue, expectedvalue);
			System.out.println("End statement is Executed");
	}
	
	@Test
	public void ContainsLevelHardAssertion() {
		String expectedvalue="corn";
		String actualValue="BabyCorn";
		Assert.assertTrue(actualValue.contains(expectedvalue));
		System.out.println("End statement is Executed for method 2");
}

}
