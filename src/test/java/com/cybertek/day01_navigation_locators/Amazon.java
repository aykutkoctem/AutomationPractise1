package com.cybertek.day01_navigation_locators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

    public static void main(String[] args) {

        //Set up chrome driver, so selenium can use it to automate chrome
        WebDriverManager.chromedriver().setup();
        // Create chrome driver object to open browser
        WebDriver driver = new ChromeDriver();
        //Navigate to https://google.com
        // driver.navigate().to("https://google.com");
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
        signIn.click();

        WebElement email = driver.findElement(By.id("ap_email"));
        email.click();
        email.sendKeys("Ahmadsamir24@gmail.com");

        WebElement continuee = driver.findElement(By.id("continue"));
        continuee.click();

        WebElement password = driver.findElement(By.id("ap_password"));
        password.click();

        password.sendKeys("");                              // Enter Password

        WebElement signInSubmit = driver.findElement(By.id("signInSubmit"));
        signInSubmit.click();

    }
}