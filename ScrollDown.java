package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.linkText("About Amazon"));
		Point p= e1.getLocation();
		int x= p.getX();
		System.out.println(x);
		int y= p.getY();
		System.out.println(y);
		JavascriptExecutor js= driver; //To scroll down need to upcast driver from JavascritExecutor
		js.executeScript("window.scrollBy(0,"+y+")"); // 100 means 100 pixcels
		
	}

}
