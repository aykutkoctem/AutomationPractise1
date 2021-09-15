package com.cybertek.tests.day06_jUnitPractice_Utility_Methods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AllerPractiseTest extends TestBase {

    @Test
    public void testJavaScripAllert(){

        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
       // driver.switchTo().alert().dismiss();
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
        System.out.println("The end");
    }
}
