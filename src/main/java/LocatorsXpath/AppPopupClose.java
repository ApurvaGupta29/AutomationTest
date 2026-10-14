package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppPopupClose {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.passportindia.gov.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement d1=	driver.findElement(By.xpath("//button[@aria-label='Close']"));
		d1.click();

	}

}
