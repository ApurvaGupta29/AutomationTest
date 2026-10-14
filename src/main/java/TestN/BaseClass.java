package TestN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass 
{ 
//	ChromeDriver driver;
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void LaunchBrowser(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome"))
			
		{
		driver = new ChromeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void QuitBrowser()
	{
		driver.quit();
	}
}
