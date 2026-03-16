package testngprograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.Assert;

public class InvocationTestCase
{
	/*
	@Test(invocationCount=10, priority=1)
	public void login() 
	{
		Assert.assertTrue(true);
	}
	@Test
	public void logout() 
	{
		Assert.assertTrue(true);
	}
	*/
	@Test(timeOut=1000)
	public void registration() 
	{
		Assert.assertTrue(true);
		ChromeDriver driver= new ChromeDriver();
	}
	

}
