package com.cybertek.tests.day05_css_xpatth_jUnit;

import org.junit.jupiter.api.*;

public class LifeCycleAnnotationDemoTest {

    @BeforeAll
    public static void unit(){
        System.out.println("@BeforeAll run once all test");
    }

    @BeforeEach
    public void setup(){
        System.out.println("run before each test");
    }
    @AfterEach
    public void tearDown(){
        System.out.println("run after each test");
    }
    @Test
    public void test1(){
        System.out.println("test1 method is running");
    }

    @Test
    public void test2(){
        System.out.println("test1 method is running");
    }

@AfterAll
    public static void cleanUp(){
    System.out.println("add after all");
}

}
