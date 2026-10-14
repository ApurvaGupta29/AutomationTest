package com.apurva.selenium;

import LocatorsXpath.LoginPage;
import LocatorsXpath.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventory = loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(inventory.isDisplayed());
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "wrong_password");
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void testAddProductToCart() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventory = loginPage.login("standard_user", "secret_sauce");

        inventory.addProductToCart("Sauce Labs Backpack");

        Assert.assertEquals(inventory.getCartCount(), "1");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}