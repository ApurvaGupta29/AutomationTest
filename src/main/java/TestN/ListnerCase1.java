package TestN;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import org.testng.annotations.Listeners;
@Listeners(ListnersLogic.class)

public class ListnerCase1 extends BaseClassListner
{

	@Test

	public void tc1() throws InterruptedException
	{
		
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.xpath("//textarea"));
		e1.sendKeys("Hanuman");
		
	}
}
