package com.cybertek.Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P16_LocationDropdownList {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElm=driver.findElement(By.id("dropdown"));
        Select selectObj=new Select(dropdownElm);
        selectObj.selectByIndex(2);
        selectObj.selectByValue("1");
        selectObj.selectByVisibleText("Option 2");



    }
}
