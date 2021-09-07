package com.cybertek.Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_LocatingAndSelectingFrom_DropdownWithNoSelectTag {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropDownLink=driver.findElement(By.linkText("Dropdown link"));
    dropDownLink.click();
        WebElement itemGoogle=driver.findElement(By.linkText("Google"));
        itemGoogle.click();
    }
}
