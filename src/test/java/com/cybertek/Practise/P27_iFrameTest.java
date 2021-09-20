package com.cybertek.Practise;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P27_iFrameTest extends TestBase {

    @Test
    public void test_iFrame(){
        driver.get("http://practice.cybertekschool.com/iframe");

      //  driver.switchTo().frame(0);
     //   driver.switchTo().frame("mce_0_ifr");
        WebElement iFrame=driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
        driver.switchTo().frame(iFrame);
        WebElement pTagELmInsideFrame=driver.findElement(By.tagName("p"));
        System.out.println("pTagELmInsideFrame.getText() = " + pTagELmInsideFrame.getText());

     //   driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();

        driver.findElement(By.linkText("Home")).click();
    }

    @Test
    public void test_Nested_iFrame(){
        driver.get("http://practice.cybertekschool.com/nested_frames");

        driver.switchTo().frame("frame-bottom");
        WebElement bottomFrameBodyElm=driver.findElement(By.tagName("body"));
        System.out.println("bottomFrameBodyElm.getText() = " + bottomFrameBodyElm.getText());

        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middleFrameDiv=driver.findElement(By.id("content"));
        System.out.println("middleFrameDiv.getText() = " + middleFrameDiv.getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        WebElement rightFrameBodyElm=driver.findElement(By.tagName("body"));
        System.out.println("rightFrameBodyElm.getText() = " + rightFrameBodyElm.getText());
        driver.switchTo().defaultContent();
    }
}
