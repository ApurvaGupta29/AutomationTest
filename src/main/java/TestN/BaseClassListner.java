package TestN;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassListner extends ListnersLogic {

	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void QuitBrowser() {
		driver.quit();
	}
}
