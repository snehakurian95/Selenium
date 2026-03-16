package testngprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void browserLaunch(String nameOfBrowser) 
	{
		if(nameOfBrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameOfBrowser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(nameOfBrowser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		System.out.println("Browser Launch");
	}
	@AfterMethod
	public void browserQuit() 
	{
		driver.quit();
		System.out.println("Browser Qiut");
	}


}
