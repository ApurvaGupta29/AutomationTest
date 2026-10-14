package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		driver.get("https://www.google.com");
		driver.getWindowHandle();
		System.out.println("Parentid: " + driver.getWindowHandle());
driver.getTitle();
driver.manage().window().maximize();
System.out.println("Title: " + driver.getTitle());
/*WebElement u1= driver.findElement(By.name("email"));
u1.sendKeys("9891718014");
WebElement p1=driver.findElement(By.name("pass"));
p1.sendKeys("Demo@1234");

WebElement l1=driver.findElement(By.partialLinkText("Sto"));
l1.click();*/

//WebElement u1=driver.findElement(By.tagName("textarea"));
WebElement u1=driver.findElement(By.className("gLFyf"));
u1.sendKeys("hello Java" + Keys.ENTER);



	}

}
