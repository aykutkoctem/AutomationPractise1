package com.cybertek.day02_locators_practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.Element;
import java.util.List;

public class FindMultipleElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/");
        driver.findElements(By.partialLinkText("A"));

        List<WebElement> allLinks=driver.findElements(By.partialLinkText("A"));

        System.out.println("allLinks.size() = " + allLinks.size());

        WebElement firstElement=allLinks.get(0);
        System.out.println("firstElement.getText() = " + firstElement.getText());

        WebElement secondItem=allLinks.get(1);
        System.out.println("secondItem = " + secondItem.getText());


        for (WebElement eachElement : allLinks) {
            System.out.println("eachElement.getText() = " + eachElement.getText());
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
