package com.cybertek.day02_locators_practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        // 1. navigate to https://google.com
        driver.get(" https://google.com");
        driver.manage().window().maximize();

        // 2. search for `selenium`
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        Thread.sleep(2000);
        // 3. click google search button
        WebElement searchBtn= driver.findElement(By.name("btnK"));
        searchBtn.submit();

        // 4. identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`
        WebElement searchResults= driver.findElement(By.id("result-stats"));
        //5. get the text of that element
        System.out.println("searchResults.getText() = " + searchResults.getText());
//Thread.sleep(3000);
        //6. Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLy
        String value = driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
        String numberOnly= value.replaceAll("[^0-9]","");
        System.out.println("numberOnly = " + numberOnly);

        //7. get all the link that contain text `selenium` into a List<WebElement>
        List<WebElement> links=driver.findElements(By.partialLinkText("Selenium"));
        //8. get the count
        System.out.println("links.size() = " + links.size());
        //9. get the first one text
        WebElement firstOne = links.get(0);
        System.out.println("firstItem.getText() = " + firstOne.getText());
        //10. get the last one text
        WebElement lastOne = links.get(links.size()-1);
        System.out.println("lastOne.getText() = " + lastOne.getText());
        //11. iterate over the list and print the text of each link
        for (WebElement eachElement:links){
            System.out.println("eachElement.getText() = " + eachElement.getText());
        }


        driver.quit();
    }
}
