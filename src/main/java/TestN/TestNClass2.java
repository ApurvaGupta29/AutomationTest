package TestN;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNClass2 

{
    @Test

public static void method1() throws InterruptedException

{
    	ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes");
		Thread.sleep(3000);
		List<WebElement> e2= driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		e2.get(3).click();

}

}
