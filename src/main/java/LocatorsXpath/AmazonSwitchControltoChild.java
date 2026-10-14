package LocatorsXpath;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSwitchControltoChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("toys" + Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> e2 = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
		e2.get(3).click();
		Set<String> pcid = driver.getWindowHandles();
//		String parent = driver.getWindowHandle();
//		System.out.println(pcid);
//		
//		for (String handle : pcid) {
//		    if (!handle.equals(parent)) {                  // not the parent, so it's the child
//		        driver.switchTo().window(handle);
//		        break;                                     // stop once we've switched
//		    }
//		}

		Iterator<String> id = pcid.iterator();
		System.out.println("checking" + id);
		Thread.sleep(3000);
		String pid = id.next();// parent
		String cid = id.next();// child
		driver.switchTo().window(cid);
		Thread.sleep(3000);
		WebElement e3 = driver.findElement(By.id("add-to-cart-button"));
		e3.click();
		

	}

}
