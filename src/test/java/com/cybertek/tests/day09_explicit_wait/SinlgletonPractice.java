package com.cybertek.tests.day09_explicit_wait;

import org.junit.jupiter.api.Test;

public class SinlgletonPractice {
    @Test
    public void testSingleton(){
       // Singleton s1=new Singleton();
      //  s1.word="abc";

       // Singleton s2=new Singleton();
       // s2.word="efd";
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
    }
}
