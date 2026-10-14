package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown { //handle with select class
	
	//Select s1= new Select(E1);
	//s1.selectbyvalue("String")
	//s1.selectbyindex(int index)'
	//s1.selectbyvisibletext("String");
	
	//create object of select class and then pass webelement param of dropdown comp.

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement d1=	driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(d1);
		//s1.selectByIndex(6);
		//s1.selectByVisibleText("Alexa Skills");
       
		s1.selectByValue("search-alias=stripbooks");
	}

}
