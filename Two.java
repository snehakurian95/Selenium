package testngprograms;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Two extends BaseClass
{
	@Test(retryAnalyzer=RetryLogic.class)
	
		public void LoginSearchingProduct() throws InterruptedException 
		{
		WebElement e1= driver.findElement(By.xpath("(//input)[5]"));
		e1.sendKeys("shoes"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		e2.get(9).click();
		Thread.sleep(3000);
		Set<String> s1= driver.getWindowHandles();
		Iterator<String> i2= s1.iterator();
		  String childid= i2.next();
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		
		WebElement e3= driver.findElement(By.id("nav-cart-count"));
		e3.click();
		
		
		
		}

}
