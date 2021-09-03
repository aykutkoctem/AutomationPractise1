package com.cybertek.day02_locators_practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //  1. open chrome and navigate to http://zero.webappsecurity.com/

        driver.get("http://zero.webappsecurity.com/");
        //      2. verify the title is `Zero - Personal Banking - Loans - Credit Cards` with if statement

        String title=driver.getTitle();
        if (title.equals("Zero - Personal Banking - Loans - Credit Cards")){
            System.out.println("title is match with actual title = " + title);
        }else {
            System.out.println("title is not match actual title is = " + title);
        }
//3. click on `signin button`

        WebElement signBtn=driver.findElement(By.id("signin_button"));
        signBtn.click();
        //        4. verify the title is "Zero- Log in"

        String logInTitle=driver.getTitle();

        if (logInTitle.equals("Zero- Log in")){
            System.out.println("Actual log In Title is match with = " + logInTitle);
        }else {
            System.out.println("logInTitle is not match actual log in title  = " + logInTitle);
        }
        //        5. enter text as "username" into username box
        WebElement username=driver.findElement(By.id("user_login"));
        username.sendKeys("username");
//6. enter text "password" into password box
        WebElement password=driver.findElement(By.id("user_password"));
        password.sendKeys("password");
//7. submit by clicking login button
        WebElement login=driver.findElement(By.name("submit"));
        login.click();
//8. verify you are at "Zero - Account Summary" page by checking title
        WebElement summary=driver.findElement(By.id("details-button"));
        summary.click();

        WebElement prooced=driver.findElement(By.id("proceed-link"));
        prooced.click();
        String titleproceed=driver.getTitle();

        System.out.println("titleproceed = " + titleproceed);
//9. now use your imagination to play around here and explore , automate within the capacity we already have so far.
    }
}