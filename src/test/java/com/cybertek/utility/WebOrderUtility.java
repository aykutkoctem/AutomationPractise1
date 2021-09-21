package com.cybertek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtility {

    public static void login(WebDriver driverParam){
        driverParam.findElement(By.cssSelector("[name='ctl00$MainContent$username']")).sendKeys("Tester");
        driverParam.findElement(By.cssSelector("[name='ctl00$MainContent$password']")).sendKeys("test");

        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void login(WebDriver driverParam,String username,String password){
        driverParam.findElement(By.cssSelector("[name='ctl00$MainContent$username']")).sendKeys(username);
        driverParam.findElement(By.cssSelector("[name='ctl00$MainContent$password']")).sendKeys(password);

        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void logout(WebDriver driverParam){

        // logout link has id of ctl00_logout
        driverParam.findElement(By.id("ctl00_logout")).click();

    }

    public static boolean isAtOrderPage(WebDriver driverParam){
        boolean result=false;

       // locator for the header element of all order page
       //h2[normalize-space(.)='List of All Orders']
       try{
           WebElement header = driverParam.findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']"));
           System.out.println("ELEMENT WAS IDENTIFIED ");
           System.out.println("header.isDisplayed() = " + header.isDisplayed());
           result = true ;
       }catch (NoSuchElementException e){
           System.out.println("NO Such element! you are not at the right page");
       }

       return result ;
//        System.out.println("header.isDisplayed() = " + header.isDisplayed());

   }





}
