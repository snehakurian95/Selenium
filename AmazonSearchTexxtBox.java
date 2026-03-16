package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTexxtBox
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=12732777589478571323&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062039&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement we1= driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		we1.sendKeys("Dress");
		    
	}

}
