package com.cybertek.tests.day06_jUnitPractice_Utility_Methods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SlowElementTest extends TestBase {
    @Test
    public void testWait() throws InterruptedException {


        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.xpath("//button[.='Remove']")).click();

       // Thread.sleep(5000);
        WebElement itsGoneElement=driver.findElement(By.id("message"));
        System.out.println("itsGoneElement.getText() = " + itsGoneElement.getText());
    }
}
