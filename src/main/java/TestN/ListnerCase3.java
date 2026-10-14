package TestN;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

@Listeners(ListnersLogic.class)
public class ListnerCase3 extends BaseClassListner

{
	@Test

	public void tc3() throws InterruptedException {

		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//textarea"));
		e1.sendKeys("Hanuman");
	}

}