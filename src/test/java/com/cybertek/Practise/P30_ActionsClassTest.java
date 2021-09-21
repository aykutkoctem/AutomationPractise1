package com.cybertek.Practise;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.*;
public class P30_ActionsClassTest extends TestBase {

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/hovers");
        //(//div[@class='figure']/img)[1]
        WebElement FirstImage=driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));
        System.out.println("FirstImage.isDisplayed() = " + FirstImage.isDisplayed());
        assertTrue(FirstImage.isDisplayed());
        Actions actions=new Actions(driver);
        actions.moveToElement(FirstImage).perform();
        assertTrue(FirstImage.isDisplayed());
////h5[.='name: user1'] css
        BrowserUtil.waitfor(4);
        System.out.println("FirstImage.isDisplayed() = " + FirstImage.isDisplayed());
        System.out.println("END");
    }
}
