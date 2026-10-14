package LocatorsXpath;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesColoumncount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/rk/Documents/Apurva_Project/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='employeeTable']/descendant::tr/th"));

		System.out.println(col.size());// gives count of column
		for (int i = 0; i < col.size(); i++) {
			WebElement e2 = col.get(i);
			String text = e2.getText();
			System.out.println(text);

		}
	}
}
