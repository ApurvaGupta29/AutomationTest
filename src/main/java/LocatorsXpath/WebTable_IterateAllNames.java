package LocatorsXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_IterateAllNames {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/rk/Documents/Apurva_Project/employee.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	List<WebElement> Name = driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr/td[1]"));
for(int i =0;i<Name.size();i++)
{
	WebElement e2= Name.get(i);
	System.out.println(e2.getText());
	}


}
}
