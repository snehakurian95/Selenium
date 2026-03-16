package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonSearchSoftAssert 
{
	@Test
    public void loginWithvalid() throws InterruptedException
    {
        ChromeDriver driver=new  ChromeDriver  ();
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        Thread.sleep(2000);
        SoftAssert s1=new SoftAssert();
        driver.navigate().refresh();
        driver.manage().window().maximize(); 
        
        WebElement num=driver.findElement(By.xpath("//input[@name='email']"));
        num.sendKeys("snehakurian95@gmail.com");
        driver.findElement(By.xpath("//span[@id='continue']")).click();
        Thread.sleep(2000);
        WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("Myamazon!123");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
       
        String actual=driver.getTitle();
        String expected="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

       s1.assertEquals(actual, expected,"Sorry test case is failed, can you try again?");
       Thread.sleep(2000);
       WebElement account =driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
       Actions s=new Actions(driver);
       s.moveToElement(account).perform();
       Thread.sleep(2000);
       WebElement signout=  driver.findElement(By.xpath("//a[@id='nav-item-signout']"));
       signout.click();
       Thread.sleep(2000);
       
       WebElement text=  driver.findElement(By.xpath("//div[@id='claim-collection-container']/h1"));
       s1.assertEquals(text.getText(), "Sign in or create account","Sorry-Test Case is failed");
       s1.assertAll();
    }
}



