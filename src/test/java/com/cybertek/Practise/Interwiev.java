package com.cybertek.Practise;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Interwiev extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://moneygaming.qa.gameaccount.com/");

        driver.findElement(By.cssSelector("[href='/sign-up.shtml']")).click();
        WebElement title=driver.findElement(By.name("map(title)"));
        Select selectTitle=new Select(title);
        selectTitle.selectByIndex(0);

        Thread.sleep(5000);

        driver.findElement(By.id("forename")).sendKeys("Aykut");

    }
}
