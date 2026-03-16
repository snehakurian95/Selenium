package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class GrotechDropdowns 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		 WebElement e1= driver.findElement(By.xpath("//select[@name='Skills']"));
		 
		 Select s1= new Select(e1);
		 s1.selectByIndex(1);
		 
		 WebElement e2= driver.findElement(By.xpath("//select[@name='technicalskills']"));
		 Select s2= new Select(e2);
		 s2.selectByValue("Advanced Java");
		 
		 WebElement e3= driver.findElement(By.xpath("//select[@id='nontechnicalskills']"));
		 Select s3= new Select(e3);
		 s3.selectByVisibleText("History");
		 
		 WebElement e4= driver.findElement(By.xpath("//select[@id='Country']"));
		 Select s4= new Select(e4);
		 s4.selectByIndex(5);
	}

}
