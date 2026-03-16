package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		WebElement e1= driver.findElement(By.id("file"));
		e1.sendKeys("C:\\Users\\alanv\\OneDrive\\Desktop\\Automation & Mannual Testing\\Pdfs");
		
	}

}
