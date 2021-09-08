package com.cybertek.day04_check_isSelected;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingCheckBoxes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkboxes1=driver.findElement(By.id("box1"));
        System.out.println("checkboxes1.isSelected() = " + checkboxes1.isSelected());

        System.out.println("checkboxes1.getAttribute(\"checked\") = " + checkboxes1.getAttribute("checked"));


        WebElement checkboxes2=driver.findElement(By.id("box2"));
        System.out.println("checkboxes2.isSelected() = " + checkboxes2.isSelected());
        System.out.println("checkboxes2.getAttribute(\"checked\") = " + checkboxes2.getAttribute("checked"));

        checkboxes1.click();
        checkboxes2.click();
        if (!checkboxes1.isSelected()){
            checkboxes1.click();
        }else {
            System.out.println("check boxes1, already checked");
        }
        if (!checkboxes2.isSelected()){
            checkboxes2.click();
        }else {
            System.out.println("check boxes2, already checked");
        }
    }
}
