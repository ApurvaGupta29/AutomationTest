package TestN;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLogin {

	@Test
	public void SearchList(String input) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(input + Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][1];
		data[0][0] = "laptop";
		data[1][0] = "phone";
		data[2][0] = "headphones";
		return data;
	}

}
