package module4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonAddtoCartSoftAssertion

{
	@Test
	public void login() throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813113%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289479%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D913899388548151064%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062039%26hvtargid%3Dkwd-304880464215%26hydadcr%3D14450_2316420%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		SoftAssert s1= new SoftAssert();
		driver.manage().window().maximize();
		
		WebElement email=  driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("snehakurian95@gmail.com");
		WebElement e2=  driver.findElement(By.xpath("//input[@type='submit']"));
		e2.click();
		WebElement e3=  driver.findElement(By.xpath("//input[@name='password']"));
		e3.sendKeys("Myamazon!123");
		WebElement e4=  driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		e4.click();
		
		WebElement search=  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Ladies watches");
		
		Thread.sleep(3000);
		
		List<WebElement>  list=  driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		list.get(3).click();
		
		WebElement e6  =  driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61KuWxrAC1L._AC_UL320_.jpg']"));
		e6.click();
		
		Set<String> window= driver.getWindowHandles();
		List<String> b= new ArrayList<>(window);
		Iterator<String> a= b.iterator();
		String p= a.next();
		System.out.println(p);
	    String c= a.next();
	    System.out.println(c);
	    driver.switchTo().window(c);
	    System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		WebElement addToCart =  driver.findElement(By.id("add-to-cart-button"));
		addToCart.click();
		Thread.sleep(2000);
		WebElement  Actual1=  driver.findElement(By.xpath("//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/h1"));
		WebElement  Actual2=  driver.findElement(By.name("proceedToRetailCheckout"));
		s1.assertEquals(Actual1.getText(), "Added to cart");
		s1.assertEquals(Actual2.isDisplayed(), true);
		s1.assertAll();
	}

}
