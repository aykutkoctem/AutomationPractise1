package com.cybertek.Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P17_LocatingDropdownList_Multiple {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement multiItemDropdown=driver.findElement(By.name("Languages"));
        Select multiItemSelect=new Select(multiItemDropdown);
        System.out.println("multiItemSelect.isMultiple() = " + multiItemSelect.isMultiple());
        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");

        multiItemSelect.deselectByIndex(3);
        multiItemSelect.deselectByValue("c#");
        multiItemSelect.deselectByVisibleText("Java");
        multiItemSelect.deselectAll();
    }
}
