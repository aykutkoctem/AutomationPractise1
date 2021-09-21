package com.cybertek.tests.day09_explicit_wait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ExplicitWaitTest extends TestBase {

    @Test
    public void testWaitForTitle(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.findElement(By.cssSelector("[href='/dynamic_loading/7']")).click();


        WebDriverWait wait=new WebDriverWait(driver,6);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        System.out.println("Title");

        wait.until(visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")));

    }
    @Test
    public void testByTextToBe(){

        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.findElement(By.cssSelector("[href='/dynamic_loading/7']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 6);
        // wait for the image show up
        wait.until( visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")) ) ;

        WebElement alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());

    }
}
