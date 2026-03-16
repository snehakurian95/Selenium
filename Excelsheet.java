package module4;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Excelsheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=  new FileInputStream("C:\\Users\\alanv\\eclipse-workspace\\AutomationTest\\ExcelSheet\\sneha.xlsx");
		Workbook wb= WorkbookFactory.create(f1);
	    Sheet sheet= wb.getSheet("login");
		Row row=  sheet.getRow(1);
		Cell cell =row.getCell(0);
		String un1= cell.getStringCellValue();
		System.out.println(un1);
		
		String pwd1= wb.getSheet("login").getRow(10).getCell(1).getStringCellValue();  //shortcut way 
		System.out.println(pwd1);
		
		
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813113%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289479%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D913899388548151064%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062039%26hvtargid%3Dkwd-304880464215%26hydadcr%3D14450_2316420%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.manage().window().maximize();
			WebElement e1=  driver.findElement(By.xpath("//input[@name='email']"));
			e1.sendKeys(un1);
			WebElement e2=  driver.findElement(By.xpath("//input[@type='submit']"));
			e2.click();
			WebElement e3=  driver.findElement(By.xpath("//input[@name='password']"));
			e3.sendKeys(pwd1);
			WebElement e4=  driver.findElement(By.xpath("//input[@id='signInSubmit']"));
			e4.click();
			
			//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		

		
	}

}
