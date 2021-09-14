package com.cybertek.tests.day06_jUnitPractice_Utility_Methods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;

public class AllerPractiseTest extends TestBase {

    @Test
    public void testJavaScripAllert(){

        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
}
