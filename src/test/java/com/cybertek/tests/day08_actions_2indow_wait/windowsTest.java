package com.cybertek.tests.day08_actions_2indow_wait;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;

public class windowsTest extends TestBase {
    @Test
    public void testWindowOrTab(){

        // selenium see window or tab with no difference
        // everything tab is new window for selenium
        driver.get("http://practice.cybertekschool.com/windows");

        // save windowHandle of this tab into currentHandle variable
        String currentHandle = driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);

        // try to use getWindowHandles() method and print it out
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("allHandles = " + allHandles);



        // iterate over Collection , you can use for each loop
        for(String eachHandle : allHandles  ){

            System.out.println("eachHandle = " + eachHandle);
            // THIS IS HOW YOU SWITCH TO DIFFERENT WINDOW|tab
            driver.switchTo().window( eachHandle ) ;
            // now we can print out the title so we know what tab we are in right now
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

        // at the end of execution we observed
        // last switched window was window with the title "New Window"
        // now we want to go back to original tab so we can continue to work on it
        System.out.println("SWITCHING BACK TO ORGINAL TAB ");
        driver.switchTo().window(currentHandle ) ;


        System.out.println("current title = " + driver.getTitle());
        assertEquals("Practice",driver.getTitle());

    }
}
