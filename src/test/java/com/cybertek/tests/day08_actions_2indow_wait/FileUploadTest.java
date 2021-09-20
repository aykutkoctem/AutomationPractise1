package com.cybertek.tests.day08_actions_2indow_wait;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileUploadTest extends TestBase {


    @Test
    public void TestUpload(){
        driver.get("http://practice.cybertekschool.com/upload");
        String filePath="C:\\Users\\ekull\\Desktop/WhatsApp Image 2021-08-12 at 9.07.42 PM.jpeg";
        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        driver.findElement(By.id("file-submit")).click();
        System.out.println("END");

    }
}
