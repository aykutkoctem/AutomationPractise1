package com.cybertek.tests.day09_explicit_wait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
public class ExplicitWait2Test extends TestBase {
    @Test
    public void waitUntilElementInteractable(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebElement inputField=driver.findElement(By.cssSelector("form#input-example>input"));
        System.out.println("inputField.isEnabled() = " + inputField.isEnabled());
        WebDriverWait wait=new WebDriverWait(driver,7);
        wait.until(elementToBeClickable(inputField));

        inputField.sendKeys("HELLO WORLD");
        BrowserUtil.waitfor(5);
    }
}
//[name='ctl00$MainContent$username']
//[name='ctl00$MainContent$password']