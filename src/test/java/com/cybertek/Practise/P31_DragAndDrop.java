package com.cybertek.Practise;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static org.junit.jupiter.api.Assertions.*;
public class P31_DragAndDrop extends TestBase {

    @Test
    public void DragAndDrop(){

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtil.waitfor(5) ;

        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement biggerCircle= driver.findElement(By.id("droptarget"));

        // dragAndDrop method of Actions class , accept 2 webelemet and drop first one into second one
        Actions actions = new Actions(driver) ;
        //actions.dragAndDrop(smallCircle, biggerCircle).perform();

        actions.moveToElement(smallCircle).pause(1000).clickAndHold().pause(1000).moveToElement(biggerCircle).pause(1000)
                        .release().perform();
        BrowserUtil.waitfor(5);

        // verify the big circle text has changed to You did great!
        assertEquals("You did great!", biggerCircle.getText() );
    }
}
