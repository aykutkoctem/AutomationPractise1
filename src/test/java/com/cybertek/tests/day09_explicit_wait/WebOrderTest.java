package com.cybertek.tests.day09_explicit_wait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtil;
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
        WebOrderUtility.login("Tester","test");
        BrowserUtil.waitfor(2);


        WebOrderUtility.logout();
        BrowserUtil.waitfor(4);


        WebOrderUtility.login("bla","bla");

        System.out.println(WebOrderUtility.isAtOrderPage());
        BrowserUtil.waitfor(4);



    }
@Test
    public void verifyUserName(){
        WebOrderUtility.openWebOrderApp();
    //driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    //   driver.findElement(By.cssSelector("[name='ctl00$MainContent$username']")).sendKeys("Tester");
    //   driver.findElement(By.cssSelector("[name='ctl00$MainContent$password']")).sendKeys("test");

    //  driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    //    WebOrderUtility.login(driver);
    WebOrderUtility.login();
    BrowserUtil.waitfor(2);

    System.out.println(WebOrderUtility.verifyUserName("Aykut"));


}

@Test
public void selectSide(){
        WebOrderUtility.openWebOrderApp();
        WebOrderUtility.login();
        BrowserUtil.waitfor(3);

        WebOrderUtility.selectSideBar("View all orders");

        BrowserUtil.waitfor(3);
}

@Test
    public void checked(){
        WebOrderUtility.openWebOrderApp();
        WebOrderUtility.login();

    System.out.println(WebOrderUtility.checkAll());
}

    @Test
    public void  getAllProduct(){


        WebOrderUtility.getAllProduct();
        BrowserUtil.waitfor(1);
    }


    @Test
    public void getDiscountFromForm(){
        WebOrderUtility.getDiscountFromForm("MyMoney",2);
        BrowserUtil.waitfor(3);
    }
    @Test
    public void calculateTotal(){
        WebOrderUtility.calculateTotal("MyMoney",2);
        //System.out.println("WebOrderUtility.calculateTotal(\"MyMoney\",2) = " + WebOrderUtility.calculateTotal("MyMoney", 2));
        BrowserUtil.waitfor(3);
    }
    @Test
    public void AdressInfo(){
        WebOrderUtility.addressInfo();
    }
@Test
    public void paymentInfo(){
        WebOrderUtility.paymentInfo();
}

@Test
    public void submitverifyInfo(){
        WebOrderUtility.submitAndVerify();
}
    }

