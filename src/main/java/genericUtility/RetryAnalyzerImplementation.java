package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {
	
	int count=1;
	int maxcount=4;
	
	
    //1<=4 -> true (retry), 2<=4 -> true (retry) ...... 4<=4-> true (retry), 5<=4-> false (no retry)
	@Override
	public boolean retry(ITestResult result) {
		while(count<=maxcount) {
			count++;
			return true;
		}
		return false;
	}

}
