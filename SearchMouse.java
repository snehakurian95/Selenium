package testngprograms;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class SearchMouse
{
	@Test()
	public void searchmouse() throws InterruptedException, IOException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		 WebElement e1= driver.findElement(By.id("APjFqb"));
		 e1.sendKeys("mouse");
		 Thread.sleep(2000);
		 
		 List<WebElement> e2=driver.findElements(By.xpath("(//div[@class='wM6W7d'])[3]/span"));
		 e2.get(2).click();
		 
		 ChromeDriver ts= driver;
			File source= ts.getScreenshotAs(OutputType.FILE);
			File destination= new File("C:\\Users\\alanv\\eclipse-workspace\\AutomationTest\\src\\testngprograms\\SearchMouse.java");
		    FileHandler.copy(source, destination); 

	}
}
