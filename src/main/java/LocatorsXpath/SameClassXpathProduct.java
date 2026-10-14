package LocatorsXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SameClassXpathProduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("toys"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> e2= driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
		e2.get(3).click();
	}

}
