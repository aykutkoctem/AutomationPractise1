package com.cybertek.OfficeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_NAMe {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");

        driver.findElement(By.partialLinkText("Sign Up For Mailing List")).click();

       WebElement name= driver.findElement(By.name("full_name"));
       name.sendKeys("Mike Smith");
        System.out.println("name.getAttribute(\"type\") = " + name.getAttribute("type"));

        WebElement email=driver.findElement(By.name("email"));
       email.sendKeys("aykutkoctem@gmail.com");
        System.out.println("email.getAttribute(\"name\") = " + email.getAttribute("name"));
        WebElement signUpButton=driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();
       // driver.navigate().back();
     //   driver.navigate().back();

        driver.navigate().to("http://practice.cybertekschool.com");
        signUpButton=driver.findElement(By.partialLinkText("Sign"));
        signUpButton.click();
        driver.quit();
    }
}
