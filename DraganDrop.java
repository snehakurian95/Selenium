package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraganDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement drag= driver.findElement(By.id("drag9"));
		
		WebElement drop= driver.findElement(By.id("div2"));
		
		Actions a1= new Actions(driver);
		a1.dragAndDrop(drop, drag).perform();
		
	}

}
