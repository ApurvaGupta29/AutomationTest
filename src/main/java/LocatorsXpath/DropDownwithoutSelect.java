package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownwithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement d1 = driver.findElement(By.id("searchDropdownBox"));
		d1.sendKeys(Keys.ARROW_DOWN);

	}

}
