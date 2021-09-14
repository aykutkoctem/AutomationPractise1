package com.cybertek.OfficeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6_CSSSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
        WebElement checkBoxPage=driver.findElement(By.cssSelector("[href='/checkboxes']"));
        checkBoxPage.click();

        WebElement cbox1=driver.findElement(By.cssSelector("#box1"));
        System.out.println("cbox1.isSelected() = " + cbox1.isSelected());
        System.out.println("cbox1.isEnabled() = " + cbox1.isEnabled());
        System.out.println("cbox1.isDisplayed() = " + cbox1.isDisplayed());


        driver.navigate().to("http://practice.cybertekschool.com/multiple_buttons");
        WebElement dontClick = driver.findElement(By.cssSelector("#disappearing_button"));
        System.out.println("dontClick.getText() = " + dontClick.getText());
        dontClick.click();

        WebElement result = driver.findElement(By.cssSelector("p[id='result']"));

        System.out.println("result.getText() = " + result.getText());
        driver.quit();

    }
}
