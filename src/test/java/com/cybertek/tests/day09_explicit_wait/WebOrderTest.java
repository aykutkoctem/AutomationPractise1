package com.cybertek.tests.day09_explicit_wait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtility;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebOrderTest extends TestBase {

    @Test
    public void testLogIn(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
     //   driver.findElement(By.cssSelector("[name='ctl00$MainContent$username']")).sendKeys("Tester");
     //   driver.findElement(By.cssSelector("[name='ctl00$MainContent$password']")).sendKeys("test");

      //  driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    //    WebOrderUtility.login(driver);
        WebOrderUtility.login(driver,"Tester","test");
        BrowserUtil.waitfor(2);
        WebOrderUtility.logout(driver);
        BrowserUtil.waitfor(4);


        WebOrderUtility.login(driver,"bla","bla");
        System.out.println("WebOrderUtility.isAtOrderPage(driver) = " + WebOrderUtility.isAtOrderPage(driver));
        BrowserUtil.waitfor(4);

    }


}
//[name='ctl00$MainContent$username']
//[name='ctl00$MainContent$password']