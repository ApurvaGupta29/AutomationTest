package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramehandling {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("chat-bot-launcher-button"));
		e1.click();
		Thread.sleep(5000);
		WebElement iframe = driver.findElement(By.id("chat-bot-iframe"));
		driver.switchTo().frame(iframe);
		WebElement e2 = driver.findElement(By.id("textInput"));
		e2.sendKeys("hi" + Keys.ENTER);

		Thread.sleep(3000);

		driver.switchTo().defaultContent(); // this move the control to default

		WebElement e3 = driver.findElement(By.xpath("//ul[@class='elementor-nav-menu']/li[1]"));
		e3.click();
	}

}
