package LocatorsXpath;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonPaymentPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions a1= new Actions (driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(3000);
	WebElement e2 =	driver.findElement(By.linkText("Sign in"));
	
		e2.click();
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.name("email"));
		login.sendKeys("9891718014");
		WebElement Continue = driver.findElement(By.xpath("//input[@type='submit']"));
		Continue.click();
		Thread.sleep(3000);
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys("Demo@123456789");
		WebElement Signin = driver.findElement(By.id("signInSubmit"));
		Signin.click();
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(dropdown);
		s1.selectByVisibleText("Beauty");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("lipstic");
		Thread.sleep(3000);
		List<WebElement> autoitem = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		autoitem.get(2).click();
		Thread.sleep(3000);

		List<WebElement> multiitem = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']/div[1]"));
		multiitem.get(1).click();
		Thread.sleep(3000);
		Set<String> pcid = driver.getWindowHandles();
		System.out.println(pcid);
		Iterator<String> id = pcid.iterator();
		String pid = id.next();
		String cid = id.next();
		driver.switchTo().window(cid);
		Thread.sleep(3000);
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		WebElement Checkout = driver.findElement(By.name("proceedToRetailCheckout"));
		Checkout.click();
		Thread.sleep(3000);
		//WebElement COD = driver.findElement(By.xpath("//div[@id='checkout-paymentOptionPanel']/descendant::span[text()='Cash on Delivery/Pay on Delivery']/parent::span/preceding-sibling::input"));
		//COD.click();
		WebElement COD = driver.findElement(By.xpath("//div[@id='checkout-paymentOptionPanel']/descendant::span[text()='EMI']/parent::span/preceding-sibling::input"));
				COD.click();
//		WebElement credit = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
//		credit.click();
//		WebElement addcreditcard = driver.findElement(By.linkText("Add a new credit or debit card"));
//		addcreditcard.click();
//		Thread.sleep(3000);
//		driver.switchTo().parentFrame();
//		Thread.sleep(3000);
//		WebElement Carddetail = driver.findElement(By.name("addCreditCardNumber"));
//		Carddetail.sendKeys("5241939434939002");
//		WebElement Expiryday = driver.findElement(By.xpath("//ul[@class='a-nostyle a-list-link']/li"));
//		Select s2 = new Select(Expiryday);
//		s2.selectByIndex(2);
//		WebElement ExpiryYear = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
//		ExpiryYear.sendKeys(Keys.ARROW_DOWN);
//		
//		WebElement CVV = driver.findElement(By.name("addCreditCardVerificationNumber"));
//		CVV.sendKeys("115");
//		
//		WebElement conti = driver.findElement(By.xpath("//span[text()='Continue']"));
//		conti.click();
		
	}

}
