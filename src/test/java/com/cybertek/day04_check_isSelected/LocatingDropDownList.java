package com.cybertek.day04_check_isSelected;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropDownList {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement yearDropDownElm=driver.findElement(By.id("year"));
        Select yearSelectObj=new Select(yearDropDownElm);
        yearSelectObj.selectByIndex(2);
        yearSelectObj.selectByValue("2019");
        yearSelectObj.deselectByVisibleText("BLA BLA");
    }
}
