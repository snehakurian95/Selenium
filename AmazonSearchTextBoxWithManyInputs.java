package testngprograms;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonSearchTextBoxWithManyInputs 
{
	@Test(dataProvider="searchDetails")
	public void withvalidInput(String input) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("(//input)[5]"));
		e1.sendKeys(input+Keys.ENTER);
		
	}
	@DataProvider
	public Object searchDetails() 
	{
		
		Object [][] d1= new Object[10][1];
		d1[0][0]="mobile";
		d1[1][0]="laptop";
		d1[2][0]="jeans";
		d1[3][0]="mouse";
		d1[4][0]="keyword";
		d1[5][0]="TV";
		d1[6][0]="AC";
		d1[7][0]="Freezer";
		d1[8][0]="Charger";
		d1[9][0]="Fan";
		return d1; 
				
		
	}

}
