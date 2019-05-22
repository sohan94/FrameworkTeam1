package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Optional;

import java.sql.Time;
import java.util.concurrent.TimeUnit;


public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"search-field\"]")
    public static WebElement search;

    @FindBy(xpath = "//*[@id=\"formcatsearch\"]/div[2]/button/i")
    public static WebElement clicksearch;

    @FindBy(xpath = "//*[@id=\"search-dropdown-select\"]")
    public static WebElement drop;

    @FindBy(xpath = "//*[@id=\"navigation-dropdown\"]")
    public static WebElement shop;

    @FindBy(id = "Home_Ancillary_0")
    public static WebElement grocery;

    @FindBy(xpath = "//*[@id=\"Home_Ancillary_2\"]")
    public static WebElement optical;

    @FindBy(xpath = "//*[@id=\"warehouse-locations-dropdown\"]")
    public static WebElement findWarehouse;
    private Actions actions;

    @FindBy(xpath = "//*[@id=\"warehouse-search-field-desktop\"]")
    public static WebElement searchWH;

    @FindBy(xpath = "//*[@id=\"warehouse_locator_search-desktop\"]/input[8]")
    public static WebElement clickWH;

    @FindBy(xpath = "//input[@type =\"checkbox\"]")
    public static WebElement checkboxes;

    @FindBy(xpath = "//*[@id=\"locator_search_filters\"]/div[1]/div[2]/label")
    public static WebElement markup;

    @FindBy(xpath = "//*[@for = 'warehouse-search-field-desktop']")
    public WebElement address;

    @FindBy(xpath = "//*[@id=\"hero-carousel\"]/button[1]")
    public WebElement arrowclick;




    public void checkTitle() {
        System.out.println(driver.getTitle());
        if (driver.getTitle().equalsIgnoreCase("Welcome to Costco Wholesale")) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Failed");
        }
    }
    public void writeSearch () {
       search.sendKeys("Beds");
       clicksearch.click();
       search.clear();
       search.sendKeys("Chairs");
       clicksearch.click();
       search.clear();
       search.sendKeys("Tables");
       sleepFor(20);
       search.sendKeys(Keys.ARROW_DOWN);
       search.sendKeys(Keys.ENTER);
       clicksearch.click();
    }
    public void dropAll(){
        Select select = new Select(drop);
        drop.click();
        select.selectByIndex(1);
        System.out.println(drop.getText());
    }

    public void shopdepart(){
        System.out.println(shop.getText());
        sleepFor(2);
        shop.sendKeys(Keys.ARROW_DOWN);
        sleepFor(20);
        shop.sendKeys(Keys.ENTER);
    }

    public void groceryclick(){
        System.out.println(grocery.getText());
        grocery.sendKeys(Keys.ARROW_DOWN);
        sleepFor(10);
        grocery.sendKeys(Keys.ENTER);
        System.out.println(grocery.getText());
    }

    public void opticalClick() {
        System.out.println(optical.getText());
        optical.click();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
    }

    public void warehouse(){
        actions = new Actions(driver);
        actions.moveToElement(findWarehouse);
        actions.perform();
        sleepFor(4);
        System.out.println(findWarehouse.getText());
    }

    public void lookWH(String ZipCode){
        actions = new Actions(driver);
        actions.moveToElement(findWarehouse);
        actions.perform();
        sleepFor(4);
        searchWH.sendKeys(ZipCode);
        clickWH.click();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

    public void checkboxesWH(String city){
        actions = new Actions(driver);
        actions.moveToElement(findWarehouse);
        actions.perform();
        sleepFor(4);
        searchWH.sendKeys(city);
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        System.out.println(checkboxes.getSize());
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        clickWH.click();
    }

    public void checkmarkWH(String State){
        actions = new Actions(driver);
        actions.moveToElement(findWarehouse);
        actions.perform();
        sleepFor(4);
        searchWH.sendKeys(State);
        //driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        //System.out.println(checkboxes.getSize());
        //driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        markup.click();
        sleepFor(6);
        System.out.println(markup.isEnabled());

        //Assert.assertFalse(false);
        //clickWH.click();
    }

    public void any(String anyparameter){
        actions = new Actions(driver);
        actions.moveToElement(findWarehouse);
        actions.perform();
        sleepFor(4);
        System.out.println(address.getText());
        searchWH.sendKeys(anyparameter);
    }

    public void arrow(){
        arrowclick.click();
        arrowclick.click();

    }
}