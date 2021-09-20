package com.cybertek.tests.day08_actions_2indow_wait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import java.security.Key;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ActionClassTest extends TestBase {

    @Test
    public void testHoverAction(){

        /**
         * //img[1]
         * (//div[@class= 'figure']/img)[1]
         */
        driver.get("http://practice.cybertekschool.com/hovers");

        // locate first image and hover over to the image
        WebElement img1Elm = driver.findElement(By.xpath("(//div[@class= 'figure']/img)[1]"));

        // Create instance of Actions class by passing driver object
        // its coming from here import org.openqa.selenium.interactions.Actions;
        Actions actions = new Actions(driver) ;
        actions.moveToElement(img1Elm).perform();

        BrowserUtil.waitfor(3);

        // and verify User profile 1 displayed with text "name: user1"
        WebElement firstProfileElm = driver.findElement(By.xpath("//h5[.='name: user1']"));
        assertTrue( firstProfileElm.isDisplayed()  ) ;

        // locate second image and hover over to the image
        WebElement img2Elm = driver.findElement(By.xpath("(//div[@class= 'figure']/img)[2]"));
        actions.moveToElement(img2Elm).perform();

        BrowserUtil.waitfor(3);

        // perform these action in this sequence
        // , hover over to 1st image , pause 2 second , then second image pause 2 second
        //  then hover over to 1st image again , pause 2 second  then second image pause 2 second
        // PERFORM THE ACTION!!!
        actions.moveToElement(img1Elm).pause(2000)
                .moveToElement(img2Elm).pause(2000)
                .moveToElement(img1Elm).pause(2000)
                .moveToElement(img2Elm).pause(2000)
                .perform();



        //TODO : Homework : get a List<WebElement> containing those 3 images , Iterate over the list to hover over and verify the text


    }

    @Test
    public void testDragAndDrop(){

    driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

    BrowserUtil.waitfor(2);
    WebElement smallCircle =driver.findElement(By.id("draggable"));
    WebElement biggerCircle=driver.findElement(By.id("droptarget"));

    Actions actions=new Actions(driver);
    actions.dragAndDrop(smallCircle,biggerCircle).perform();
    BrowserUtil.waitfor(2);

        assertEquals("You did great!|", biggerCircle.getText() );
}

    @Test
    public void testKeyboardAction(){
        // navigate to https://www.google.com
        // hold down to shift enter text "i love selenium"
        // release the shift
        // enter text "i love selenium"
        // hold down to command on mac control on windows and enter "A"
        // release the command or control key
        // then hit backspace to delete

        driver.get("https://www.google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        Actions actions=new Actions(driver);

        actions.keyDown(Keys.SHIFT).sendKeys(" I love Selenium").pause(2000).keyUp(Keys.SHIFT).sendKeys("I love Selenium").pause(2000)
                .keyDown(Keys.CONTROL).sendKeys("A")
                .keyUp(Keys.CONTROL).pause(2000)
                .sendKeys(Keys.BACK_SPACE)
                .perform();
    }

    @Test
    public void testDoubleClick(){
        
    }
}