package com.cybertek.tests.day05_css_xpatth_jUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchPageTest {

    WebDriver driver;
    @BeforeAll
    public static void setUpDriver(){
        WebDriverManager.chromedriver().setup();

    }
    @BeforeEach
    public  void setUpWebDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterEach
    public  void quitBrowser(){
        driver.quit();
    }
    @AfterAll
    public static void tearDown(){
        System.out.println("@After all , nothing to do here");
    }
    // write 2 tests :
    // testYahooSearchHomePageTitle
    //
    //    test when you navigate to yahoo search page
    //        the title should be "Yahoo Search - Web Search"

    @Test
    public void testYahooSearchHomePageTitle(){

        driver.get("https://search.yahoo.com/");
        String expectedTitle="Yahoo Search - Web Search";
        String actualTitle=driver.getTitle();
        driver.quit();
        assertEquals(expectedTitle,actualTitle ) ;


    }
    // test method name : testYahooSearchResultPageTitle
    // test navigate to yahoo page
    // and search for Selenium
    // the page title should start with selenium

    @Test
    public void testYahooSearchResultPageTitle(){
        driver.get("https://search.yahoo.com/");
        WebElement searchBox=driver.findElement(By.xpath("//input[@name='p']"));
        searchBox.sendKeys("selenium"+ Keys.ENTER);
        String expectedTitleStartWith="Selenium";
        String actualTitle=driver.getTitle();


        assertTrue(actualTitle.startsWith("selenium"));
    }



}
