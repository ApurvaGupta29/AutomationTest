package LocatorsXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanSelectedENabled {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().minimize();
		Thread.sleep(3000);

		WebElement e1 = driver.findElement(By.xpath("//input[@id='firstName']"));
		boolean b1 = e1.isSelected();
		System.out.println(b1);

		Thread.sleep(3000);
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));

		if (lastName.isEnabled() && lastName.isDisplayed()) {
			System.out.println("Singh");
		}

	}
}
