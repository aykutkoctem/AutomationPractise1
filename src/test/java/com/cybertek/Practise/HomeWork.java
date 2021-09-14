package com.cybertek.Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement loginBTN=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginBTN.click();

        WebElement select123=driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
        Select select=new Select(select123);
        select.selectByIndex(2);

        WebElement addCard=driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-onesie']"));
        addCard.click();

        WebElement shoppingList=driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        shoppingList.click();

        WebElement checkout=driver.findElement(By.xpath("//button[@data-test='checkout']"));
        checkout.click();

        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Fenasi");

        WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Kerim");

        WebElement zipCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCode.sendKeys("90280");

        WebElement continued=driver.findElement(By.xpath("//input[@id='continue']"));
        continued.click();

        driver.findElement(By.xpath("//button[@id='finish']")).click();

        driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
        driver.quit();
    }
}
