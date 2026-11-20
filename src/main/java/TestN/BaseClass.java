package TestN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
//	ChromeDriver driver;
	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void LaunchBrowser(String nameofbrowser) {
		if (nameofbrowser.equals("chrome"))

		{
			ChromeOptions options = new ChromeOptions();
			// On GitHub Actions (CI=true) run headless with a fixed window size
			if ("true".equalsIgnoreCase(System.getenv("CI"))) {
				options.addArguments("--headless=new", "--window-size=1920,1080", "--no-sandbox",
						"--disable-dev-shm-usage", "--disable-blink-features=AutomationControlled");
			}
			driver = new ChromeDriver(options);
		}
		if (nameofbrowser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if (nameofbrowser.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void QuitBrowser() {
		driver.quit();
	}
}
