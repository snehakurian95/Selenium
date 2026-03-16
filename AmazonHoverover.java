package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverover 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement e1= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions a1= new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement e2= driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		e2.click();
		
	}

}
