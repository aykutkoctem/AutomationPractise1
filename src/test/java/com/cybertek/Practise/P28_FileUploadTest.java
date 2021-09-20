package com.cybertek.Practise;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class P28_FileUploadTest extends TestBase {

    @Test
    public void testFileUpload(){
        driver.get("http://practice.cybertekschool.com/upload");
        String filePath="C:\\Users\\ekull\\Desktop/WhatsApp Image 2021-08-12 at 9.07.42 PM.jpeg";
        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        driver.findElement(By.id("file-submit")).click();
        System.out.println("END");
    }
}
