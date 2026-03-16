package testngprograms;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class ListenersLogic implements ITestListener
{
	public static ChromeDriver driver;
	@Override
	public void onTestSuccess(ITestResult result)
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		//When the test case is success need to write it from line 11
		Reporter.log("Test is Pass");
		TakesScreenshot ts= driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\alanv\\eclipse-workspace\\AutomationTest\\Screenshot\\Pass\\One.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		//When the test case is a failure need to write it from line 22
		Reporter.log("Test is Fail");
		TakesScreenshot ts= driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\alanv\\eclipse-workspace\\AutomationTest\\Screenshot\\Fail\\Two.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
