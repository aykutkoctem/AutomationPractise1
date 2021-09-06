package com.cybertek.day03_locate_by_tag_class_getat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsByClassName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");


        WebElement elm1=driver.findElement(By.className("h1y"));
        System.out.println("elm1.getText() = " + elm1.getText());



        driver.quit();

    }
}
