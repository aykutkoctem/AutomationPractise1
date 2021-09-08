package com.cybertek.day04_check_isSelected;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatingRadioButtons {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blueRadio=driver.findElement(By.id("blue"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());
        blueRadio.click();

        WebElement redRadio=driver.findElement(By.id("red"));
        System.out.println("before redRadio.isSelected() = " + redRadio.isSelected());

        redRadio.click();
        System.out.println("after click redRadio.isSelected() = " + redRadio.isSelected());

        WebElement greenRadio=driver.findElement(By.id("green"));
        greenRadio.click();
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());
        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());
        List<WebElement> allColorRadios=driver.findElements(By.name("color"));
        System.out.println("allColorRadios.size() = " + allColorRadios.size());
        allColorRadios.get(2).click();

        for (WebElement eachRadio : allColorRadios) {
            System.out.println("----------------------------------------");
            System.out.println("eachRadio.getAttribute(\"id\") = " + eachRadio.getAttribute("id"));
            System.out.println("eachRadio.isSelected() = " + eachRadio.isSelected());
            System.out.println("eachRadio.isEnabled() = " + eachRadio.isEnabled());
            System.out.println("----------------------------------------");
        }
        driver.close();
    }
}
