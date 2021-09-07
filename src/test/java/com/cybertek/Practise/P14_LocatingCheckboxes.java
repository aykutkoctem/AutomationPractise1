package com.cybertek.Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_LocatingCheckboxes {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1=driver.findElement(By.id("box1"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

        WebElement checkBox2=driver.findElement(By.id("box2"));
        System.out.println("checkBox2.getAttribute(\"checked\") = " + checkBox2.getAttribute("checked"));

        checkBox2.click();
        System.out.println("checkBox2.getAttribute(\"checked\") = " + checkBox2.getAttribute("checked"));
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }else {
            System.out.println("checkbox 1 is already selected");
        }
    }
}
