package com.cybertek.utility;

public class BrowserUtil {
    public static void waitfor(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
