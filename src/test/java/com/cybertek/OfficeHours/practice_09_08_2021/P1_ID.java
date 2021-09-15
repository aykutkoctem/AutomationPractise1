package com.cybertek.OfficeHours.practice_09_08_2021;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_ID {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");

        driver.findElement(By.linkText("Multiple Buttons")).click();
     WebElement dissappiring_button= driver.findElement(By.id("disappearing_button"));
        System.out.println("dissappiring_button.getText() = " + dissappiring_button.getText());
        dissappiring_button.click();

        WebElement result=driver.findElement(By.id("result"));
        System.out.println("result.getText() = " + result.getText());

        driver.navigate().back();

        driver.quit();
    }
}
