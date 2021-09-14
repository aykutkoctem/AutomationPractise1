package com.cybertek.Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P20_LocateElementByCssSelektor_FormTask {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/registration_form");

        WebElement firstnameField=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstnameField.sendKeys("Aykut");

        WebElement lastnameField=driver.findElement(By.cssSelector("input[name='lastname']"));
        lastnameField.sendKeys("Koc");

        WebElement usernameField=driver.findElement(By.cssSelector("input[name='username']"));
        usernameField.sendKeys("aykut_aga");

        WebElement emailField=driver.findElement(By.cssSelector("input[name='email']"));
        emailField.sendKeys("aaaa@gmail.com");

        WebElement passwordField=driver.findElement(By.cssSelector("input[name='password']"));
        passwordField.sendKeys("12345");

        WebElement phonenumberField=driver.findElement(By.cssSelector("input[name='phone']"));
        phonenumberField.sendKeys("23456543");

        WebElement radioButton=driver.findElement(By.cssSelector("input[type='radio']"));
        radioButton.click();

        WebElement birthDay=driver.findElement(By.cssSelector("input[name='birthday']"));
        birthDay.sendKeys("01/22/1994");

        WebElement depDropDown=driver.findElement(By.cssSelector("select[name='department']"));
        Select dropDown=new Select(depDropDown);
        dropDown.selectByIndex(2);

        WebElement jobTitle=driver.findElement(By.cssSelector("select[name='job_title']"));
        Select job=new Select(jobTitle);
        job.selectByIndex(2);

        driver.findElement(By.cssSelector("input[id='inlineCheckbox2']")).click();

        driver.findElement(By.cssSelector("button[id='wooden_spoon']")).click();
    }
}
