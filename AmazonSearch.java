package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class AmazonSearch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1=   driver.findElement(By.xpath("//input[@role='searchbox']"));
		e1.sendKeys("Jacket");
		Thread.sleep(2000);
		e1.sendKeys(Keys.ENTER);
	}
}
