package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class AmazonAutoGenerate
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes");
		Thread.sleep(3000);
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		list.get(5).click();
	
	}

}
