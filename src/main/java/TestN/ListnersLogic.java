package TestN;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersLogic implements ITestListener

{
public static ChromeDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		ITestListener.super.onTestSuccess(result);
		   TakesScreenshot ts = driver;
		     File source=   ts.getScreenshotAs(OutputType.FILE);
		     
		     File Destination=new File("/Users/rk/Documents/Apurva_Project/ecommerce-automation/test-output/screenshot/Pass/"+result.getName()+".png");

		        try {
					FileHandler.copy(source, Destination);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		ITestListener.super.onTestFailure(result);
		TakesScreenshot ts = driver;
	     File source=   ts.getScreenshotAs(OutputType.FILE);
	     
	     File Destination=new File("/Users/rk/Documents/Apurva_Project/ecommerce-automation/test-output/screenshot/Fail/"+result.getName()+".png");

	        try {
				FileHandler.copy(source, Destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
