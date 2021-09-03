package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eBay {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // navigate to https://google.com
        driver.get("https://www.ebay.com");

        WebElement search=driver.findElement(By.name("_nkw"));
        search.sendKeys("shoe");

        WebElement click=driver.findElement(By.id("gh-btn"));
        click.click();

        WebElement item=driver.findElement(By.className("s-item__image-img"));
        item.click();

        WebElement size=driver.findElement(By.id("msku-sel-1"));

        size.click();

        WebElement color=driver.findElement(By.name("Color"));
        color.click();

        WebElement buy=driver.findElement(By.id("binBtn_btn"));
        buy.click();
    }
}