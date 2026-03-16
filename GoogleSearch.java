package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement web= driver.findElement(By.xpath("//textarea"));
		boolean b1= web.isDisplayed();
		System.out.println(b1);
		boolean b2= web.isEnabled();
		System.out.println(b2);
		if(web.isDisplayed()&& web.isEnabled())
		{
		web.sendKeys("Sarva Maya");
		}
	}

}
