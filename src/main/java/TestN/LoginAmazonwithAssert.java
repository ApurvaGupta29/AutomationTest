package TestN;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginAmazonwithAssert extends BaseClass

{
	@Test
	public void logintoAmazon() {

		// Credentials come from environment variables, never from the source code
		String user = System.getenv("AMAZON_USER");
		String pass = System.getenv("AMAZON_PASS");
		if (user == null || pass == null) {
			throw new SkipException("AMAZON_USER / AMAZON_PASS not set - skipping login test");
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement e1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList")));
		new Actions(driver).moveToElement(e1).perform();

		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys(user);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")))
				.sendKeys(pass);
		driver.findElement(By.id("signInSubmit")).click();

		wait.until(ExpectedConditions.titleContains("Amazon"));
		Assert.assertTrue(driver.getTitle().contains("Amazon.in"), "Unexpected title: " + driver.getTitle());
	}

}
