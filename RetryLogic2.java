package testngprograms;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic2 implements IRetryAnalyzer
{
	int initialCount=0;
	int retryCount=4;

	@Override
	public boolean retry(ITestResult result) 
	{
		if(initialCount<retryCount)
		{
			initialCount++;
			return true;
		}
		return false;
		
	}

}
