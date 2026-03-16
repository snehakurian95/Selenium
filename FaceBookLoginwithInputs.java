package testngprograms;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBookLoginwithInputs 
{
	@Test(dataProvider= "logininputs")
	public void setOfInputs(String username, String password) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement un= driver.findElement(By.id("email"));
		un.sendKeys(username);
		WebElement pwd= driver.findElement(By.id("pass"));
		pwd.sendKeys("password");
		WebElement login= driver.findElement(By.name("login"));
		login.click();
	}
		
		@DataProvider
		public  Object logininputs() throws EncryptedDocumentException, IOException 
		{
			FileInputStream f1=  new FileInputStream("C:\\Users\\alanv\\eclipse-workspace\\AutomationTest\\ExcelSheet\\sneha.xlsx");
			Workbook wb= WorkbookFactory.create(f1);
			String un1= wb.getSheet("login").getRow(10).getCell(1).getStringCellValue();
			String pwd1= wb.getSheet("login").getRow(10).getCell(1).getStringCellValue();
			
			String un2= wb.getSheet("login").getRow(10).getCell(1).getStringCellValue();
			String pwd2= wb.getSheet("login").getRow(10).getCell(1).getStringCellValue();
			
			String un3= wb.getSheet("login").getRow(10).getCell(1).getStringCellValue();
			String pwd3= wb.getSheet("login").getRow(10).getCell(1).getStringCellValue();
			
			String un4= wb.getSheet("login").getRow(10).getCell(1).getStringCellValue();
			String pwd4= wb.getSheet("login").getRow(10).getCell(1).getStringCellValue();
			
			String un5= wb.getSheet("login").getRow(10).getCell(1).getStringCellValue();
			String pwd5= wb.getSheet("login").getRow(10).getCell(1).getStringCellValue();
			
			Object [][]d1= new Object[5][2];
			d1[0][0]=un1;
		    d1[0][1]=pwd1;
		    
		    d1[1][0]=un2;
		    d1[1][1]=pwd2;

			d1[2][0]=un3;
			d1[2][1]=pwd3;
			
			d1[3][0]=un4;
			d1[3][1]=pwd4;

			d1[4][0]=un5;
		    d1[4][1]=pwd5;
				
			return d1;		
		}
}
