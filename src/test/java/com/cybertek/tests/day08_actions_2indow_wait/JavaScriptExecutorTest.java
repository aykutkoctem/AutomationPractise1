package com.cybertek.tests.day08_actions_2indow_wait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorTest extends TestBase {

    @Test
    public void testScrollWholeWindow(){
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
    public void testScrollElementIntroView(){

    }
}
