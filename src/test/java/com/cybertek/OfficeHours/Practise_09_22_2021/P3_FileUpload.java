package com.cybertek.OfficeHours.Practise_09_22_2021;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P3_FileUpload extends TestBase {

    @Test
    public void fileUpload() {
        // path of test pdf     /Users/soyturk/Desktop/test.pdf

        // path choose file     #fileinput
        // message              .explanation

        driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");

        String path="C:\\Users\\ekull\\Desktop\\WhatsApp Image 2021-08-12 at 9.07.42 PM.jpeg";

        WebElement chooseFile = driver.findElement(By.cssSelector("#fileinput"));

        chooseFile.sendKeys(path);

        BrowserUtil.waitfor(3);
        chooseFile.submit();

        /*
        WebElement uploadButton = driver.findElement(By.cssSelector("input[type='submit']"));
        uploadButton.click();
         */

        String expectedResult= "You uploaded a file. This is the result.";
        String actualResult= driver.findElement(By.cssSelector(".explanation")).getText();

        Assertions.assertEquals(expectedResult, actualResult);




    }
}