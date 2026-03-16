package module4;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrwser 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);	
	String parentid=	driver.getWindowHandle();
	System.out.println(parentid);
	
	Set<String> childid =   driver.getWindowHandles();
	System.out.println(childid);
	Thread.sleep(3000);
	
	driver.close();
	
	}
}
