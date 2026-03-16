package testngprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class LaunchingBrowser 
{
	@Test()
	public void launching() throws IOException 
	{
		ChromeDriver driver= new ChromeDriver();
		
		ChromeDriver ts= driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\alanv\\eclipse-workspace\\AutomationTest\\src\\testngprograms");
	    FileHandler.copy(source, destination); 
	}
	
}
