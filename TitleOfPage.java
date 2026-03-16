package module4;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfPage
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String s1= driver.getTitle();
		System.out.println(s1);
		Thread.sleep(3000);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	}

}
