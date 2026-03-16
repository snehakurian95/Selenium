package testngprograms;

import org.testng.annotations.Test;

public class AnnotationProgram 
{
	@Test
	public void testcase1() 
	{
		System.out.println("Test case 1");
	}
	@Test
	public void testcase2() 
	{
		System.out.println("Test case 2");
	}
	@Test
	public void beforeSuite() 
	{
		System.out.println("Before Suite");
	}
	@Test
	public void beforeTest() 
	{
		System.out.println("Before Test");
	}
	@Test
	public void beforeClass() 
	{
		System.out.println("Before Class");
	}
	

}
