package LocatorsXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLink {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> e1 = driver.findElements(By.tagName("a"));
		int count = e1.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			WebElement e2 = e1.get(i);
			String text = e2.getText();
			System.out.println(text);
			String url = e2.getDomAttribute("href");
			System.out.println(url);
			String text2 = e2.getTagName();
			System.out.println(text2);
		}

	}
}