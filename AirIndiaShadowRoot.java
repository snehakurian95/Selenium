package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AirIndiaShadowRoot
{
	public static void main(String[] args) 
	{
		EdgeDriver  driver=  new  EdgeDriver();
		driver.get("https://www.airindia.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement e1=  driver.findElement(By.xpath("(//button[text()='Accept All'])[1]"));
		e1.click();
		
		String path="return document.querySelector('#panel-search-flight > ai-booking-widget > div > div > div.ai-booking-widget__trip-controls.ng-star-inserted > div.ai-booking-widget__trip-types.ng-star-inserted > ai-radio-group > div > label:nth-child(2) > div.ai-radio-group__content > span')";
		JavascriptExecutor js=  driver;
		WebElement e2= (WebElement) js.executeScript(path); //To click the component we need to store it in WebElement as click method is present only in WebElement
		e2.click();
	}
}
