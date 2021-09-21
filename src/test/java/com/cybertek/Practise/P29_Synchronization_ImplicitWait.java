package com.cybertek.Practise;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
public class P29_Synchronization_ImplicitWait extends TestBase {

    @Test
    public void testSlowElement() throws InterruptedException{

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //p[id='message']
        //[onclick='swapCheckbox()']
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.cssSelector("[onclick='swapCheckbox()']")).click();
     //   BrowserUtil.waitfor(4);
        WebElement gone=driver.findElement(By.cssSelector("p[id='message']"));
        System.out.println("gone.getText() = " + gone.getText());

        assertEquals("It's gone!",gone.getText());

    }
}
