package LocatorsXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtablesCountrows {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/rk/Documents/Apurva_Project/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeTable']/descendant::tbody/tr"));

		System.out.println(rows.size());// gives count of rows

	}

}
