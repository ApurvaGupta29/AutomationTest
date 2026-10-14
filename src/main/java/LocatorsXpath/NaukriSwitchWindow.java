package LocatorsXpath;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriSwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//button[@name='google-register']"));
		e1.click();

		Set<String> pcid = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		for (String handle : pcid) {
			if (!handle.equals(parent)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		driver.close();
//System.out.println(pcid);
//Iterator <String> id = pcid.iterator();
//String pid=id.next();
//String cid= id.next();
//System.out.println(cid);
//driver.switchTo().window(cid);
	}

}
