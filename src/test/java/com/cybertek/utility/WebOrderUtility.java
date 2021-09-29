package com.cybertek.utility;

import com.cybertek.tests.day09_explicit_wait.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebOrderUtility  {


    public static void login(){


        // enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")) .sendKeys("test");
        // click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }


    public static void login(String username ,String password){


        // enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        // enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")) .sendKeys(password);
        // click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }


    public static void logout(){

        // logout link has id of ctl00_logout
        Driver.getDriver().findElement(By.id("ctl00_logout")).click();

    }


    public static boolean isAtOrderPage(){
        // you can also check the url
        // you can check the title if it's different
        // whatever that makes sense
        // in here we decided to check one element
        boolean result = false ;

        // locator for the header element of all order page
        //h2[normalize-space(.)='List of All Orders']
        //TODO : Try to replace this with WebDriverWait
        // since it will wait 10 second set by implicit wait if not found.
        try{
//            WebElement header = driverParam.findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']"));
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space(.)='List of All Orders']"))) ;
            System.out.println("ELEMENT WAS IDENTIFIED ");
//            System.out.println("header.isDisplayed() = " + header.isDisplayed());
            result = true ;
//        }catch (NoSuchElementException e){
        }catch (TimeoutException e){
            System.out.println("you are not at the right page");
        }

        return result ;
//        System.out.println("header.isDisplayed() = " + header.isDisplayed());

    }

    // so now we have Driver class that generate Single WebDriver instance
    // we can use it anywhere here in this method
    // without passing the WebDriver as parameter

    public static void openWebOrderApp(){
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    }

    public static boolean verifyUserName(String userName) {

        boolean result = false;
        openWebOrderApp();
        login();
        String expectedText = Driver.getDriver().findElement(By.xpath("//div[@class='login_info']")).getText();

        if (expectedText.contains(userName)){
            result = true;
        }


        return result;

    }
    public static void selectSideBar(String tabName) {
        openWebOrderApp();
        login();
        if (tabName.equals("View all orders")) {
            Driver.getDriver().findElement(By.xpath("//a[.='View all orders']")).click();
        } else if (tabName.equals("View all products")) {
            Driver.getDriver().findElement(By.xpath("//a[.='View all products']")).click();
        } else if (tabName.equals("Order")) {
            Driver.getDriver().findElement(By.xpath("//a[.='Order']")).click();

        } else {
            System.out.println("Invalid " + tabName+" please try again");
        }
    }

    public static boolean checkAll() {
        boolean result = false;
        openWebOrderApp();
        login();
        Driver.getDriver().findElement(By.xpath("//a[.='Check All']")).click();

        List<WebElement> checkBox = Driver.getDriver().findElements(By.xpath("//input[@checked='checked']"));
        for (WebElement eachBox : checkBox) {
            if (eachBox.isSelected()) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        return result;

    }

    public static List<String> getAllProduct(){
        openWebOrderApp();
        login();
        Driver.getDriver().findElement(By.xpath("//a[.='View all products']")).click();
        List<WebElement> headers=Driver.getDriver().findElements(By.xpath("//table[@class='ProductsTable']/tbody//th"));

        for (WebElement eachHeader : headers) {
            System.out.println(eachHeader.getText());
        }
        List<WebElement> allRow=Driver.getDriver().findElements(By.xpath("//table[@class='ProductsTable']/tbody//tr"));
        System.out.println("allRow.size() = " + allRow.size());




            String first=Driver.getDriver().findElement(By.xpath("//table[@class='ProductsTable']/tbody//tr[1]")).getText();
        String second=Driver.getDriver().findElement(By.xpath("//table[@class='ProductsTable']/tbody//tr[2]")).getText();
        String third=Driver.getDriver().findElement(By.xpath("//table[@class='ProductsTable']/tbody//tr[3]")).getText();
        String forth=Driver.getDriver().findElement(By.xpath("//table[@class='ProductsTable']/tbody//tr[4]")).getText();
        List<String> productNames = new ArrayList<String>();

        productNames.addAll(Arrays.asList(first, second, third,forth));

        System.out.println(productNames);
        return productNames;
    }

    public static int getUnitPriceFromForm(String productName){

selectSideBar("Order");
        Select select=new Select(Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        select.selectByValue(productName);
        WebElement perUnitBox=Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice"));
        int unitPrice=Integer.valueOf(perUnitBox.getAttribute("value"));

       return unitPrice;


    }


    public static int getDiscountFromForm(String productName, int quantity){

        WebOrderUtil.openWebOrderApp();
        login();

        Driver.getDriver().findElement(By.cssSelector("[href='Process.aspx']")).click();
        WebElement dropdown = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        //dropdown.click();

        Select products = new Select(dropdown);
        products.selectByVisibleText(productName);

        WebElement quantityBox = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        //quantityBox.click().;
       // quantityBox.clear();
        //BrowserUtil.waitFor(2);
       // quantityBox.sendKeys(Integer.toString(quantity));
        quantityBox.sendKeys(Integer.toString(quantity));

        Driver.getDriver().findElement(By.cssSelector("[value='Calculate']")).click();

        WebElement discountBox = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtDiscount"));

int dicount= Integer.parseInt(discountBox.getAttribute("value"));

        return dicount;
    }

public static int calculateTotal(String productName, int quantity){

    WebOrderUtil.openWebOrderApp();
    login();

    Driver.getDriver().findElement(By.cssSelector("[href='Process.aspx']")).click();
    WebElement dropdown = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
    //dropdown.click();

    Select products = new Select(dropdown);
    products.selectByVisibleText(productName);

    WebElement quantityBox = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
    //quantityBox.click().;
    // quantityBox.clear();
    //BrowserUtil.waitFor(2);
    // quantityBox.sendKeys(Integer.toString(quantity));
    quantityBox.sendKeys(Integer.toString(quantity));

    Driver.getDriver().findElement(By.cssSelector("[value='Calculate']")).click();

    WebElement totalBox = Driver.getDriver().findElement(By.cssSelector("[id='ctl00_MainContent_fmwOrder_txtTotal']"));
    int total= Integer.parseInt(totalBox.getAttribute("value"));

    return total;
}
    public static int getExpectedResult(String productName, int quantity){

        int discount = 0;

        if (quantity>=10 && (productName.equals("MyMoney") || productName.equals("FamilyAlbum") || productName.equals("ScreenSaver"))){
            switch (productName){
                case "MyMoney":
                    discount=8;
                    break;
                case "FamilyAlbum":
                    discount=15;
                    break;
                case "ScreenSaver":
                    discount=10;
                default:
                    break;
            }
        }else{
            System.out.println("No such product in the list");
        }

        return discount;
    }

    public static void addressInfo(){

        WebOrderUtil.openWebOrderApp();
        login();
// [id='ctl00_MainContent_fmwOrder_TextBox3']
        Driver.getDriver().findElement(By.cssSelector("[href='Process.aspx']")).click();
        Driver.getDriver().findElement(By.cssSelector("[id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys("Aykut");
        Driver.getDriver().findElement(By.cssSelector("[id='ctl00_MainContent_fmwOrder_TextBox2']")).sendKeys("Utah avanue");
        Driver.getDriver().findElement(By.cssSelector("[id='ctl00_MainContent_fmwOrder_TextBox3']")).sendKeys("South gate");
    }

    public static void paymentInfo(){
        WebOrderUtil.openWebOrderApp();
        login();
// [id='ctl00_MainContent_fmwOrder_TextBox3']
        Driver.getDriver().findElement(By.cssSelector("[href='Process.aspx']")).click();
        Driver.getDriver().findElement(By.cssSelector("[id='ctl00_MainContent_fmwOrder_cardList_0']")).click();
        Driver.getDriver().findElement(By.cssSelector("[id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys("12334567890");
        Driver.getDriver().findElement(By.cssSelector("[id='ctl00_MainContent_fmwOrder_TextBox1']")).sendKeys("123");

    }

    public static boolean submitAndVerify(){
        WebOrderUtil.openWebOrderApp();
        login();
// [id='ctl00_MainContent_fmwOrder_TextBox3']
        Driver.getDriver().findElement(By.cssSelector("[href='Process.aspx']")).click();
        boolean result = false;

        WebElement processBtn = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processBtn.click();

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver() ,2);
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[normalize-space(text())='New order has been successfully added.']"));
            System.out.println("New order has been successfully added.");
            result=true;

        }catch(TimeoutException e){
            System.out.println("Element is not found, wrong info entered");
        }

        return result;
    }

}