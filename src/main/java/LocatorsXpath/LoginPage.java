package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginPage {
	WebDriver driver;

	By usernameField = By.id("user-name");
	By passwordField = By.id("password");
	By loginButton = By.id("login-button");
	By errorMessage = By.cssSelector("h3[data-test='error']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Fills the form and clicks Login without waiting for any particular result.
	public void attemptLogin(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
	}

	public InventoryPage login(String username, String password) {
		attemptLogin(username, password);

		// wait until the inventory page's title actually appears
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));

		return new InventoryPage(driver);
	}

	public String getErrorMessage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).getText();
	}
}