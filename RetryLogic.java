package testngprograms;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
	int initialCount= 0;
	int retryCount= 4; //these many times want to re run the failed test

	@Override
	public boolean retry(ITestResult result) 
	{
		if(initialCount<retryCount)
		{
			initialCount++; //initialCount=0, initialCount=1
			return true; // re run the failed test case
		}
		
		return false;// dont try at all
		//return true- It will retry but infinite times
		
	}
	

}
