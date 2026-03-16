package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PartialLinkText
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("file:///C:/Users/alanv/OneDrive/Desktop/Automation%20&%20Mannual%20Testing/learningHTML1.html");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.partialLinkText("us"));
		e1.click();
	
	}

}
