package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownInSelenium 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e=  driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select s1= new Select(e);
		s1.selectByIndex(9);
		//s1.selectByValue("search-alias=lawngarden");
		//s1.selectByVisibleText("Garden & Outdoors");
		
	}

}
