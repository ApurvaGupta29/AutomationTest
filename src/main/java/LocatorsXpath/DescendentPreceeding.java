package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescendentPreceeding {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes" + Keys.ENTER);
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath(
				"//div[@id='brandsRefinements']/descendant::span[text()='PUMA']/preceding-sibling::div/label/i"));
		checkbox.click();
	}

}
