package com.cybertek.day03_locate_by_tag_class_getat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementAtribute {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        WebElement firstLink=driver.findElement(By.linkText("A/B Testing"));

        System.out.println("firstLink.getText() = " + firstLink.getText());

        System.out.println("firstLink.getAttribute(\"href\") = " + firstLink.getAttribute("href"));



        Thread.sleep(1000);
        driver.quit();
    }
}