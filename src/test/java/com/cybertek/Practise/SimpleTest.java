package com.cybertek.Practise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void testAddition(){
        System.out.println("Hello World");

        int num1=2;
        int num2=3;
        int expectedResult=5;

       Assertions.assertEquals(expectedResult,num1+num2);

    }
    @Test
    public void testString(){
        System.out.println("message from test");
        String name="Junit";
        Assertions.assertEquals("Junit",name);
    }
}
