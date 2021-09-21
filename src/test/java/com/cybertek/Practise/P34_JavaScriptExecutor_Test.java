package com.cybertek.Practise;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class P34_JavaScriptExecutor_Test  extends TestBase {
    @Test
    public void test_Scroll(){
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        // scroll by 1000 px down , no need for left and right scroll

        // get JavaScriptExecutor reference from driver variable
        // so we can run this js code windows.scrollBy(0,1000)
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // it uses execute method to run javascript , it can accept parameter
        jse.executeScript("window.scrollBy(0,1000)") ;

        for (int i = 1; i <=10 ; i++) {
            jse.executeScript("window.scrollBy(0,1000)") ;
            BrowserUtil.waitfor(1);

        }
        BrowserUtil.waitfor(4);
    }

    @Test
    public void testScrollElementIntro_the_View(){
        driver.get("http://practice.cybertekschool.com/");
        BrowserUtil.waitfor(2);

        WebElement schollLink=driver.findElement(By.linkText("Cybertek School"));
        WebElement homeLink=driver.findElement(By.linkText("Home"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)",schollLink);
    }
}
