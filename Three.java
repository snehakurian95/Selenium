package testngprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Three extends BaseClass
{
	@Test(retryAnalyzer=RetryLogic.class)
		
	public void loginSearchingAddingToCart () 
	{
		
		WebElement e1= driver.findElement(By.partialLinkText("wood"));
		e1.click();
	}

}
