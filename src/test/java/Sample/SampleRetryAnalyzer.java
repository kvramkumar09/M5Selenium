package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleRetryAnalyzer {
	
	@Test(retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
		public void retryPractice() {
			System.out.println("Test started");
			Assert.fail();
			System.out.println("Test Ended");
		}
	}


