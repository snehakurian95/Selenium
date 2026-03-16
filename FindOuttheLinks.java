package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindOuttheLinks
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		List<WebElement> link=  driver.findElements(By.tagName("a"));
		int count= link.size();
		System.out.println(count);
		
		
		
		
		
	}

}
