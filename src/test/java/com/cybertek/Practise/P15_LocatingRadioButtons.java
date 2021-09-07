package com.cybertek.Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P15_LocatingRadioButtons {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blueRadioBtn=driver.findElement(By.id("blue"));

        System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());
        blueRadioBtn.click();

        WebElement radioButton=driver.findElement(By.id("red"));

        System.out.println("radioButton.isSelected() = " + radioButton.isSelected());
        radioButton.click();
        System.out.println("radioButton.isSelected() = " + radioButton.isSelected());
        WebElement greenRadioBtn=driver.findElement(By.id("green"));
        System.out.println("greenRadioBtn.isSelected() = " + greenRadioBtn.isSelected());

        greenRadioBtn.click();

        System.out.println("greenRadioBtn.isSelected() = " + greenRadioBtn.isSelected());

        List<WebElement> allColorRadios=driver.findElements(By.name("color"));
        System.out.println("allColorRadios.size() = " + allColorRadios.size());

        for (WebElement eachRadius : allColorRadios) {
            System.out.println("eachRadius.isEnabled() = " + eachRadius.isEnabled());
            System.out.println("eachRadius.getAttribute(\"id\") = " + eachRadius.getAttribute("id"));
        }
    }
}
