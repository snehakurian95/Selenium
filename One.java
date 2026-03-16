package testngprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class One extends BaseClass
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void loginToAmazon() throws InterruptedException 
	{
		WebElement e1= driver.findElement(By.xpath("(//input)[5]"));
		e1.sendKeys("shoes");
		Thread.sleep(3000);
		
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		e2.get(5).click();
		
		
		
		
	}

}
