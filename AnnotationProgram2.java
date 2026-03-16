package testngprograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationProgram2
{
	@BeforeMethod
	public void browserLaunch() 
	{
		System.out.println("Browser Launch");
	}
	@AfterMethod
	public void browserQuit() 
	{
		System.out.println("Browser Quit");
	}
	@Test
	public void login() 
	{
		System.out.println("Login to Amazon");
	}
	@Test
	public void loginAndSearching() 
	{
		System.out.println("Login and Searching");
	}
	@Test
	public void registration() 
	{
		System.out.println("registration");
	}
	

}
