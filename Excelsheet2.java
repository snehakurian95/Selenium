package module4;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excelsheet2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=  new FileInputStream("C:\\Users\\alanv\\eclipse-workspace\\AutomationTest\\ExcelSheet\\sneha.xlsx");
		Workbook wb= WorkbookFactory.create(f1);
		
		String result= NumberToTextConverter.toText(wb.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
	    /*Sheet sheet= wb.getSheet("login");
		Row row=  sheet.getRow(2);
		Cell cell =row.getCell(0);
		String un1= cell.getStringCellValue();
		System.out.println(un1);
		*/
		System.out.println(result);
	
	}

}
