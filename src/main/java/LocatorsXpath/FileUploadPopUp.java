package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) 
		throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();		
			driver.get("https://grotechminds.com/registration/");
			driver.manage().window().minimize();
				Thread.sleep(5000);
				
		WebElement e1=	driver.findElement(By.id("file"));
		e1.sendKeys("/Users/rk/Downloads/All_Good_Shares.xlsx");

	}

}
