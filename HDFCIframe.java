package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCIframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		WebElement e1= driver.findElement(By.name("login_page"));
		driver.switchTo().frame(e1);
		
		WebElement e2= driver.findElement(By.name("fldLoginUserId"));
		e2.sendKeys("5624313");
		
		
	}

}
