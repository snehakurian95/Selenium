package testngprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class JSMJavaSriptDisabled 
{
	EdgeDriver driver;
	@Test
	public void withvalidInput() throws InterruptedException 
	{
	    driver= new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
	
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value='shoes';", e1);

		driver.executeScript("arguments[0].value='shoes';", e1);
		Thread.sleep(3000);
	}
		
}
