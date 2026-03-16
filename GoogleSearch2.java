package module4;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//WebDriverWait  explicit=  new WebDriverWait(driver, Duration.ofSeconds(10));
		//explicit.until(ExpectedConditions.titleContains("Google"));
		FluentWait<ChromeDriver> wait= new FluentWait<ChromeDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMinutes(400)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.titleIs("josh"));
		WebElement search=   driver.findElement(By.xpath("//textarea"));
		search.sendKeys("Bottle");
		
	}

	
	

}
