package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
//Relative : traverse directly to tagname directly with double forward slash
		// Absolute: traverse to from parent tagname to immediate child with single
		// forward flash

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println("Title: " + driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement s1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
//WebElement s1=	driver.findElement(By.xpath("//input[@role='searchbox']")); //tagname[@AN='AV']

		s1.click();
//s1.sendKeys("Shoes"+Keys.ENTER);
//System.out.println("Title: " + driver.getTitle());
		Thread.sleep(10000);
		WebElement s2 = driver.findElement(By.xpath("//input[@name='email']"));

		s2.sendKeys("apurva9110@gmail.com" + Keys.ENTER);
		WebElement s3 = driver.findElement(By.className("a-button-input"));
		s3.click();

	}

}
