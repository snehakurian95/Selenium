package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonLoginAndLogout 
{
	@Test
	public void login() throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813113%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289479%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D913899388548151064%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062039%26hvtargid%3Dkwd-304880464215%26hydadcr%3D14450_2316420%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement e1=  driver.findElement(By.xpath("//input[@name='email']"));
		e1.sendKeys("snehakurian95@gmail.com");
		WebElement e2=  driver.findElement(By.xpath("//input[@type='submit']"));
		e2.click();
		WebElement e3=  driver.findElement(By.xpath("//input[@name='password']"));
		e3.sendKeys("Myamazon!123");
		WebElement e4=  driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		e4.click();
		
		WebElement e5= driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(e5).perform();
	
		WebElement signout= driver.findElement(By.xpath("//span[text()='Sign Out']"));
		signout.click();
		
		WebElement text= driver.findElement(By.xpath("//div[@id='claim-collection-container']/h1"));
		//String actualbehaviour=  text.getText();  //this way also we can do it
		
		Assert.assertEquals(text.getText(), "Sign in or create account");
	
	}

}
