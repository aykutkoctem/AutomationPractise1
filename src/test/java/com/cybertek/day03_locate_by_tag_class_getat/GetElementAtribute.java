package com.cybertek.day03_locate_by_tag_class_getat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementAtribute {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        // get the first link on the page and get href attribute
        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));

        // get text practice
        System.out.println("firstLink.getText() = " + firstLink.getText());

        // get any attribute of identified element , in this case href
        System.out.println("firstLink.getAttribute(\"href\") = "
                + firstLink.getAttribute("href"));

        // navigate to google.com and identify the searchbox and get couple attributes value
        driver.navigate().to("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q")) ;
        searchBox.sendKeys("Selenium");

        // get the class attribute
        System.out.println("searchBox.getAttribute(\"class\") = "
                + searchBox.getAttribute("class"));
        //maxlength
        System.out.println("searchBox.getAttribute(\"maxlength\") = "
                + searchBox.getAttribute("maxlength"));
        //title
        System.out.println("searchBox.getAttribute(\"title\") = "
                + searchBox.getAttribute("title"));

        //autocapitalize
        System.out.println("searchBox.getAttribute(\"autocapitalize\") = "
                + searchBox.getAttribute("autocapitalize"));
        //spellcheck
        System.out.println("searchBox.getAttribute(\"spellcheck\") = "
                + searchBox.getAttribute("spellcheck"));
        //role
        System.out.println("searchBox.getAttribute(\"role\") = "
                + searchBox.getAttribute("role"));

        System.out.println("searchBox.getAttribute(\"value\") = "
                + searchBox.getAttribute("value"));


        driver.quit();
    }

}