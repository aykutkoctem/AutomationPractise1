package com.cybertek.selfPractıce;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class iFrame extends TestBase {

    @Test
    public void toolQa() {
        driver.get("https://demoqa.com/frames");
        //css-> sampleHeading
        driver.switchTo().frame("frame1");
        System.out.println("driver.findElement(By.cssSelector(\"#sampleHeading\")) = " + driver.findElement(By.cssSelector("#sampleHeading")).getText());


    }
    @Test
    public void nestedFrames() {

        driver.get("http://practice.cybertekschool.com/nested_frames");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        // #content
        System.out.println(driver.findElement(By.cssSelector("#content")).getText());
        driver.switchTo().parentFrame();
        driver.switchTo().frame(2);
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.tagName("body")).getText());
    }
}
