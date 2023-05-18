package com.example.browsersetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    WebDriver driver;
    // String browser;

    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        this.driver.findElement(By.id("user-name")).sendKeys("standard_user");
        this.driver.findElement(By.id("password")).sendKeys("secret_sauce");
        this.driver.findElement(By.id("login-button")).click();

    }
}