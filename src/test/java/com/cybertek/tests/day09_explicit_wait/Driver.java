package com.cybertek.tests.day09_explicit_wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver obj;


    private Driver() {

    }

    public static WebDriver getDriver() {
        if (obj == null) {
            obj = new ChromeDriver();
            WebDriverManager.chromedriver().setup();
            return obj;
        } else {
        //    System.out.println("You already have object, use it");
            return obj;
        }
    }
}