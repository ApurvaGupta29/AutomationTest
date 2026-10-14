package LocatorsXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables_RamSalary {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/rk/Documents/Apurva_Project/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> Salary = driver.findElements(By.xpath("(//td[text()='Ram']/following-sibling::td)[2]"));
		for (int i = 0; i < Salary.size(); i++) {
			WebElement e2 = Salary.get(i);

			System.out.print(e2.getText());
		}

	}
}
