package LocatorsXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Employee_QADept {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/rk/Documents/Apurva_Project/employee%20(1).html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		List<WebElement> Employee = driver.findElements(By.xpath("//td[text()='QA']/preceding-sibling::td"));

		for (int i = 0; i < Employee.size(); i++) {
			WebElement e2 = Employee.get(i);
			System.out.println(e2.getText());
		}

	}
}