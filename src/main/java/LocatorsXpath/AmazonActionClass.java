package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement e1 = driver.findElement(By.linkText("Today's Deals"));
		Thread.sleep(1000);
		WebElement e2 = driver.findElement(By.xpath("//a[text()='Bestsellers']"));
		Actions a1= new Actions(driver); 
		a1.moveToElement(e1).perform(); //hover over
		//a1.contextClick(e1).perform();//right click
	//	a1.doubleClick(e1).perform();//double click
		
	//	a1.dragAndDrop(e1, e2);
		

	}

}
