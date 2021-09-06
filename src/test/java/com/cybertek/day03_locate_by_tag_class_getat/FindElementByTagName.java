package com.cybertek.day03_locate_by_tag_class_getat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByTagName {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        WebElement firstLink=driver.findElement(By.tagName("a"));
        System.out.println("firstLink.getText() = " + firstLink.getText());

        List<WebElement> allTagElements=driver.findElements(By.tagName("a"));
        System.out.println("allTagElements.size() = " + allTagElements.size());

        for (WebElement eachElement : allTagElements) {
            System.out.println("eachElement.getText() = " + eachElement.getText());
            System.out.println("eachElement.getAttribute(\"href\") = " + eachElement.getAttribute("href"));
        }

        WebElement firstH1TagElm=driver.findElement(By.tagName("h1"));
        System.out.println("firstH1TagElm.getText() = " + firstH1TagElm.getText());



    }
}
