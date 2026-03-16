package module4;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.grotechminds.com/");
		Thread.sleep(1000);
		driver.manage().window().minimize();
		List<WebElement> list=  driver.findElements(By.tagName("a"));
		int count = list.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++) 
		{
			WebElement e= list.get(i);
			String url= e.getAttribute("href");
			System.out.println(url);
			verifyTheLinks(url);
		}
	}
	static void verifyTheLinks(String url) throws IOException 
	{
		try 
		{
		URL i1= new URL(url);
		HttpURLConnection c1= (HttpURLConnection) i1.openConnection();
		if(c1.getResponseCode()==200) 
		{
			System.out.println("Valid Link and the response message is:" +c1.getResponseMessage());
		}
		else 
		{
			System.out.println("Not a Valid Link and the response message is:" +c1.getResponseMessage()+"" +c1.getResponseCode());
		}
		}
		catch(MalformedURLException m1) 
		{
			System.out.println("Handled Exception 1");
		}
		catch(ClassCastException m2) 
		{
			System.out.println("Handled Exception 2");
		}
	}

}
