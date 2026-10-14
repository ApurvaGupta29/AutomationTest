package LocatorsXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
driver.manage().window().maximize();
Thread.sleep(3000);
WebElement e1= driver.findElement(By.xpath("//textarea"));
e1.sendKeys("Hanuman");
Thread.sleep(3000);
List<WebElement> e2= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
e2.get(0).click();

	}

}
