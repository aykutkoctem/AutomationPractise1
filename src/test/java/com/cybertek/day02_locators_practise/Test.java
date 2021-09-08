package com.cybertek.day02_locators_practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");

        WebElement email=driver.findElement(By.id("inputEmail"));
        email.sendKeys("student34@library");

        WebElement passpord=driver.findElement(By.id("inputPassword"));
        passpord.sendKeys("Sdet2022*");

        WebElement logIn=driver.findElement(By.name("Sign in"));
        logIn.click();

      //  driver.quit();
    }
}
