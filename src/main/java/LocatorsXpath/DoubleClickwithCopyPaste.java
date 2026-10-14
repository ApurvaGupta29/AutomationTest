package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickwithCopyPaste {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e1 = driver.findElement(By.id("firstName"));
		e1.sendKeys("Mukesh");

		Actions a1 = new Actions(driver);
		a1.doubleClick(e1).perform();

		e1.sendKeys(Keys.COMMAND + "c");

		WebElement e2 = driver.findElement(By.id("lastName"));
		e2.sendKeys(Keys.COMMAND + "v");

	}
}
