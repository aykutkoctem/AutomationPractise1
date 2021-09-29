package com.cybertek.tests.day09_explicit_wait;

import com.cybertek.tests.day09_explicit_wait.Driver;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.cybertek.utility.WebOrderUtility.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderFunctionalityTests extends TestBase {

    @Test
    public void testCheckAllButton(){
        openWebOrderApp();
        login();
        checkAll();
        assertTrue(checkAll());
    }
    @Test
    public void testUncheckAllButton(){
        openWebOrderApp();
        login();
      //  uncheckAll();
      //  assertTrue(uncheckAll());
    }

    @Test
    public void testAllProductName(){
        openWebOrderApp();
        login();
        selectSideBar("View all products");
        List<WebElement> headers= Driver.getDriver().findElements(By.xpath("//h2[normalize-space(.)='List of Products']"));

        for (WebElement eachHeader : headers) {
            System.out.println(eachHeader.getText());
        }
    }
    @Test
    public void testProductInformation_Price(){
        openWebOrderApp();
        login();
        selectSideBar("Order");
        assertEquals(getUnitPriceFromForm("MyMoney"), 100);
        assertEquals(getUnitPriceFromForm("FamilyAlbum"), 80);
        assertEquals(getUnitPriceFromForm("ScreenSaver"), 20);
    }
    @Test
    public void testProductInformation_Discount() {
        openWebOrderApp();
        login();
        selectSideBar("Order");
        Assertions.assertEquals(getDiscountFromForm("MyMoney",10),getExpectedResult("MyMoney", 10));
    }

    @Test
    public void testProductInformation_CalculationLessThan10(){
        openWebOrderApp();
        login();
        selectSideBar("Order");
        assertEquals(calculateTotal( "MyMoney", 10), (int)((1-0.08) * 10*100));
        assertEquals(calculateTotal("FamilyAlbum", 10), (int)((1-0.15) * 10*80));
        assertEquals(calculateTotal("ScreenSaver", 10), (int)((1-0.1) * 10*20));


    }
    @Test
    public void testOrderFlow(){
        openWebOrderApp();
        login();
        selectSideBar("Order");
        calculateTotal("MyMoney",10);
        addressInfo();
        paymentInfo();
        assertTrue(submitAndVerify());
    }
}
