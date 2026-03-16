package testngprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAllAnnotations
{
	@Test
	public void testcase1() 
	{
		System.out.println("Test Case 1");
	}
	@BeforeSuite
	public void bs() 
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void bt() 
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void bc() 
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void bm() 
	{
		System.out.println("Before Method");
	}
	@AfterSuite
	public void as() 
	{
		System.out.println("After Suite");
	}
	@AfterTest
	public void at() 
	{
		System.out.println("After Test");
	}
	@AfterClass
	public void ac() 
	{
		System.out.println("After Class");
	}
	@AfterMethod
	public void am() 
	{
		System.out.println("After Method");
	}
	

}
