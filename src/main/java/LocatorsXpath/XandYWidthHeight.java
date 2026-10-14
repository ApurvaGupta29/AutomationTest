package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XandYWidthHeight {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement e1=	driver.findElement(By.name("q"));
int x= 	e1.getSize().getHeight();
int y =	e1.getSize().getWidth();
	System.out.println(x);
	System.out.println(y);

	}

}
