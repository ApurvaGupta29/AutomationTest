package TestN;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonLogin extends BaseClass

{
	@Test

	public void logintoAmazon() throws InterruptedException {

		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.linkText("Sign in"));

		e2.click();
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.name("email"));
		login.sendKeys("9891718014");
		WebElement Continue = driver.findElement(By.xpath("//input[@type='submit']"));
		Continue.click();
		Thread.sleep(3000);
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys("Demo@123456789");
		WebElement Signin = driver.findElement(By.id("signInSubmit"));
		Signin.click();

	}

}
