package com.cybertek.Practise;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P32_Keyword extends TestBase {
    // navigate to https://www.google.com
    // hold down to shift enter text "i love selenium"
    // release the shift
    // enter text "i love selenium"
    // hold down to command on mac control on windows and enter "A"
    // release the command or control key
    // then hit backspace to delete
    @Test
    public void keyWord(){
        driver.get("https://www.google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(" I love Selenium").pause(2000).keyUp(Keys.SHIFT).sendKeys("I love Selenium").pause(2000)
                .keyDown(Keys.CONTROL).sendKeys("A")
                .keyUp(Keys.CONTROL).pause(2000)
                .sendKeys(Keys.BACK_SPACE)
                .perform();

    }
}
