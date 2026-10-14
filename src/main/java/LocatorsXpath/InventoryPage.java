package LocatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class InventoryPage {
    WebDriver driver;

    By pageTitle  = By.className("title");
    By cartBadge  = By.className("shopping_cart_badge");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayed() {
        return driver.findElement(pageTitle).getText().equals("Products");
    }

    public void addProductToCart(String productName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By buttonLocator = By.xpath(
            "//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button"
        );

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
        button.click();
    }

    public String getCartCount() {
        return driver.findElement(cartBadge).getText();
    }
}