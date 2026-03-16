package module4;

import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshoLogin
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?zx=1766544682766&no_sw_cr=1");
		
		Thread.sleep(3000);
		
		//driver.close();
		driver.quit();
		
	}

}
