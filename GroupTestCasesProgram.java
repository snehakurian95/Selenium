package testngprograms;

import org.testng.annotations.Test;

public class GroupTestCasesProgram
{
	@Test(groups= {"smoke","system"})
	public void login() 
	{
		
	}
	@Test(groups= {"regression"})
	public void logout() 
	{
		
	}
	@Test(groups= {"smoke"})
	public void registration() 
	{
		
	}
	@Test(groups= {"smoke","system"})
	public void addToCart() 
	{
		
	}
	@Test(groups= {"regression"})
	public void whishlist() 
	{
		
	}
	@Test(groups= {"system"})
	public void payment() 
	{
		
	}

}
