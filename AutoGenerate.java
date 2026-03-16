package module4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoGenerate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.id("APjFqb"));
		e1.sendKeys("India");
		Thread.sleep(2000);
		
		List<WebElement> el1=  driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		el1.get(el1.size()-1).click();
		
	}

}
