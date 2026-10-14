package TestN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FailedtestCase

{
	@Test(retryAnalyzer = RetryLogic.class)
	public void method1() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("twotjkjkjabsearchtextbox"));
		e1.sendKeys("Shoes");

	}
}
