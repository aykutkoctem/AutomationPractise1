package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homeWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // navigate to https://google.com
        driver.get("https://facebook.com");

        WebElement searchBox = driver.findElement(By.name("email")) ;
        searchBox.sendKeys("aykutKKK@gmail.com");

        WebElement searchBox1 = driver.findElement(By.name("pass")) ;
        searchBox1.sendKeys("1234567890");

        WebElement login = driver.findElement(By.name("login") ) ;
        login.click();

        Thread.sleep(5000);



        WebElement searchBox2=driver.findElement(By.className("_97w4"));
        searchBox2.click();

        WebElement searchBox3 = driver.findElement(By.id("identify_email")) ;
        searchBox3.sendKeys("123455");

        WebElement search=driver.findElement(By.id("did_submit"));
        search.click();
        WebElement cancel=driver.findElement(By.className("_42ft _4jy0 _9nq1 textPadding20px _4jy3 _517h _51sy"));
         cancel.click();


         driver.navigate().back();
    }
}
