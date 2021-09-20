package com.cybertek.Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Atequella {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/sign_up");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[name='full_name']")).sendKeys("DAF");
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("afsaadf");



    WebElement message= driver.findElement(By.cssSelector("[name='wooden_spoon']"));
    message.click();

        String txt = driver.switchTo().alert().getText();
        System.out.println("The text is - " +txt);
    }
}
