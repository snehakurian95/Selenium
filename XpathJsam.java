package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathJsam 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("file:///C:/Users/alanv/OneDrive/Desktop/Automation%20&%20Mannual%20Testing/learningHTML1.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement ew1= driver.findElement(By.xpath("(/html/body/input)[1]"));
		ew1.sendKeys("Gianna");
	    WebElement ew2= driver.findElement(By.xpath("(/html/body/input)[2]"));
		ew2.sendKeys("daughter");
		WebElement ew3= driver.findElement(By.xpath("(/html/body/input)[3]"));
		ew3.sendKeys("goodgirl");
		
		
		WebElement ew4= driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		ew4.click();
		
		//WebElement ew5= driver.findElement(By.xpath("/html/body/a"));
		//ew5.click();
		
		WebElement ew6= driver.findElement(By.xpath("//a"));
		ew6.click();
		
		//WebElement ew7= driver.findElement(By.xpath("(//input)[5]"));
		//ew7.sendKeys("shoes");
		
	}
}
