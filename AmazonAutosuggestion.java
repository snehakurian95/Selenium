package module4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonAutosuggestion
{
	public static void main(String[] args) 
	{
		EdgeDriver  driver=  new  EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
	    WebElement search=  driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("diaper");
		
		List<WebElement> list= driver.findElements(By.xpath("//div[@class= 'two-pane-results-container']/div/div"));
		list.get(5).click();
		
		
		
	}

}
