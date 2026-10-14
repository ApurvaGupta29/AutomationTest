package LocatorsXpath;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class XPath {
	
		public static void main(String[] args) throws InterruptedException 
		{
			ChromeDriver driver=new ChromeDriver();		
				driver.get("https://www.google.com");
		driver.manage().window().maximize();	
				Thread.sleep(2000);
			WebElement e1=	driver.findElement(By.xpath("//textarea"));
			e1.sendKeys("India");
		}
	}
	

