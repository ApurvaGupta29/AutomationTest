package TestN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2param 
{
	@Test(dataProvider="dataforlogic")
	public void tc1(String username,String password)throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e1 = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
	Actions a1 = new Actions(driver);
	a1.moveToElement(e1).perform();
	
	Thread.sleep(3000);
	
	WebElement e2 = driver.findElement(By.linkText("Sign in"));

	e2.click();
	Thread.sleep(3000);
	WebElement login = driver.findElement(By.name("email"));
	login.sendKeys(username);
	WebElement Continue = driver.findElement(By.xpath("//input[@type='submit']"));
	Continue.click();
	Thread.sleep(3000);
	WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
	pswd.sendKeys(password);
	WebElement Signin = driver.findElement(By.id("signInSubmit"));
	Signin.click();
	}
@DataProvider
public Object[][] dataforlogic()
{
	Object[][] d1= new Object[3][2];
	//1st row
	d1[0][0]="apurva9110@gmail.com";
	d1[0][1]="Demo@123456789";
	
	d1[1][0]="apurva9110@gmail.com";
	d1[1][1]="Demo@1289";
	
	d1[2][0]="apurva9110@gma";
	d1[2][1]="Demo@123456";
	return d1;
	
}

}