package module4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonSearchMovingControl 
{
	public static void main(String[] args) throws InterruptedException {
        EdgeDriver        driver=new EdgeDriver();
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.manage().window().maximize();
        WebElement e1=        driver.findElement(By.xpath("(//input)[5]"));
        e1.sendKeys("shoe"+Keys.ENTER);
        

        List<WebElement> list=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));        

        for(int i=0;i<5;i++)
        {
        list.get(i).click();
        
        }
        Set<String> s2=        driver.getWindowHandles();
        
        
        
        List<String> l1=new ArrayList<String>(s2);
        

                Iterator<String> i2=        l1.iterator();
                        String parentid=                i2.next();
                        String childid1=                i2.next();
                        String childid2=                i2.next();
                        String childid3=                i2.next();
                        String childid4=                i2.next();
                        String childid5=                i2.next();

        driver.switchTo().window(childid2);
        Thread.sleep(2000);
        
        //WebElement e4=        driver.findElement(By.id("add-to-cart-button"));
        //e4.click();

}

}
