package TestN;

import java.io.File;
import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot

{
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(2000);

		/*
		 * Upcast driver to TakesScreenshot(I) Calling its method called as
		 * getscreenshotAs to take the screenshot Creating an Object of File class and
		 * mentioning the location where you wish to take the screenshot "Copy the file
		 * from source to the destination using Filehandler class"
		 */
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// File Destination=new
		// File("/Users/rk/Documents/Apurva_Project/ecommerce-automation/test-output/screenshot/photo.png");
		// File Destination=new
		// File("/Users/rk/Documents/Apurva_Project/ecommerce-automation/test-output/screenshot/photo"+Math.random()+".png");
		File Destination = new File(
				"/Users/rk/Documents/Apurva_Project/ecommerce-automation/test-output/screenshot/photo"
						+ new ScreenShot().getClass() + ".png");

		FileHandler.copy(source, Destination);

	}
}
