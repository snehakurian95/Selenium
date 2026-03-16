package module4;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlipKartAutoGenerate 
{
		public static void main(String[] args) throws InterruptedException 
		{
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			WebElement e1= driver.findElement(By.name("q"));
			e1.sendKeys("Shoes");
			Thread.sleep(3000);
			List<WebElement> list = driver.findElements(By.xpath("//form/ul/li"));
			list.get(list.size()-4).click();
		}
}
