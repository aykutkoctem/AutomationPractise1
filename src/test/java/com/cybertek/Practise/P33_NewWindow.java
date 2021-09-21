package com.cybertek.Practise;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class P33_NewWindow extends TestBase {

    @Test
    public void testWindow(){
        driver.get("http://practice.cybertekschool.com/windows");
        String currentWindow=driver.getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);
        Set<String> allHandles=driver.getWindowHandles();
        System.out.println("allHandle = " + allHandles);
        WebElement clickHereElm=driver.findElement(By.linkText("Click Here"));
        clickHereElm.click();
        System.out.println("after clicking once driver.getWindowHandle() = " + driver.getWindowHandle());
        System.out.println("after clicking once driver.getWindowHandles() = " + driver.getWindowHandles());

        allHandles=driver.getWindowHandles();
        for (String eachHandle : allHandles) {
            System.out.println("eachHandle = " + eachHandle);
            BrowserUtil.waitfor(2);
            driver.switchTo().window(eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
        BrowserUtil.waitfor(3);
    }
}
