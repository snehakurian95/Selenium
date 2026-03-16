package testngprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class AmazonSearchJavaSript 
{
	EdgeDriver driver;
	@Test
	public void withvalidInput() throws InterruptedException 
	{
	    driver= new EdgeDriver();
		driver.get("file:///C:/Users/alanv/OneDrive/Desktop/Automation%20&%20Mannual%20Testing/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.name("lname"));
	
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value='shoes';", e1);

		driver.executeScript("arguments[0].removeAttribute('disabled')", e1);
		Thread.sleep(6000);
		e1.sendKeys("Kurian");
		
	}
		
}
