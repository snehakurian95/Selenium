package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement continue1= driver.findElement(By.xpath("//a[@aria-label='Continue to Login']"));
		continue1.click();
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("sneha");
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("sneha123");
		WebElement login= driver.findElement(By.id("Button2"));
		login.click();
	
	}

}
