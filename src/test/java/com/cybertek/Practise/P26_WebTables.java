package com.cybertek.Practise;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P26_WebTables extends TestBase {

    @Test
    public void testWebTable(){
        driver.get("http://practice.cybertekschool.com/tables");
        //  //table[@id='table1']/tbody/tr[4]/td[2]
        //  //table[@id='table1']//td[text()='Tim']

        String cell42Locator="//table[@id='table1']//td[text()='Tim']";
        WebElement cell42=driver.findElement(By.xpath(cell42Locator));
        System.out.println(cell42.getText());

        WebElement cellTim=driver.findElement(By.xpath("//table[@id='table1']//td[text()='Tim']"));
        System.out.println("cellTim.getText() = " + cellTim.getText());

        //   //table[@id='table1']/tbody/tr[4]/td

        List<WebElement> allRow4Cells=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[4]/td"));
        for (WebElement eachCell : allRow4Cells) {
            System.out.println("eachCell.getText() = " + eachCell.getText());
        }

    }
}
