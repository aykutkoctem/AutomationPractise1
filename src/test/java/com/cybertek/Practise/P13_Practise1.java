package com.cybertek.Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P13_Practise1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://saucedemo.com");

        String titleSauce=driver.getTitle();
        System.out.println("titleSauce = " + titleSauce);

        WebElement username=driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement passpord=driver.findElement(By.id("password"));
        passpord.sendKeys("secret_sauce");

        WebElement LogIn=driver.findElement(By.id("login-button"));
        LogIn.click();


        WebElement firstProductLink=driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println("firstProductLink.getAttribute(\"id\") = " + firstProductLink.getAttribute("id"));

       WebElement firstProduct1=driver.findElement(By.className("inventory_item_name"));
        System.out.println("firstProduct1.getText() = " + firstProduct1.getText());

        WebElement firstProduct2=driver.findElement(By.id("item_4_title_link"));
        System.out.println("firstProduct2.getText() = " + firstProduct2.getText());

        List<WebElement> allProductTitle=driver.findElements(By.className("inventory_item_name"));
        System.out.println("product count is = " + allProductTitle.size());

        for (WebElement eachProductTitle: allProductTitle){
            String title=eachProductTitle.getText();
            System.out.println("title = " + title);
        }

        WebElement cartContainerElm=driver.findElement(By.id("shopping_cart_container"));
        cartContainerElm.click();

        Thread.sleep(1000);
        WebElement continueShoppingBtn=driver.findElement(By.id("continue-shopping"));
        continueShoppingBtn.click();

        driver.quit();
    }
}
