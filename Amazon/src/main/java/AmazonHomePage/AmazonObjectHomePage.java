package AmazonHomePage;

import base.CommonAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

    public class AmazonObjectHomePage extends CommonAPI {

     @FindBy (css = "select[id='searchDropdownBox']")
     WebElement homepageDropdown;
     @FindBy(xpath =("//input[@id='twotabsearchtextbox']"))
     WebElement searchbar;
     @FindBy (xpath = "//a[@tabindex='47']")
     WebElement TodaysDeal;
     @FindBy (xpath = "//a[@tabindex='48']")
     WebElement YourAmazon;
     @FindBy (xpath = "//a[@tabindex='49']")
     WebElement BuyAgain;
     @FindBy (xpath = "//a[@tabindex='50']")
     WebElement GiftCards;
     @FindBy (xpath = "//a[@tabindex='51']")
     WebElement Help;
     @FindBy (xpath = "//a[@tabindex='52']")
     WebElement Wholefoods;
     @FindBy (xpath = "//a[@tabindex='53']")
     WebElement Registry;
     @FindBy (xpath = "//a[@tabindex='54']")
     WebElement Sell;
     @FindBy (xpath = "//img[@alt='Yard Care']")
     WebElement yard;
     @FindBy (xpath = "//img[@alt='Sports & Outdoors']")
     WebElement sports;
     @FindBy (xpath = "//div[@id='desktop-top']//li[3]//span[1]//a[1]//img[1]")
     WebElement women;
     @FindBy (xpath = "//div[@id='desktop-top']//li[4]//span[1]//a[1]//img[1]")
     WebElement men;
     @FindBy (xpath = "//div[@id='desktop-top']//li[5]//span[1]//a[1]//img[1]")
     WebElement toy;
     @FindBy (xpath = "//div[@id='desktop-top']//li[6]//span[1]//a[1]//img[1]")
     WebElement health;
     @FindBy (xpath = "//div[@id='desktop-top']//li[7]//span[1]//a[1]//img[1]")
     WebElement magazines;
     @FindBy (xpath = "//span[@class='icp-nav-link-inner']")
     WebElement languange;
     @FindBy (xpath = "//a[@id='nav-hamburger-menu']")
     WebElement iconHomepage;
     @FindBy (xpath = "//a[@data-menu-id='11']")
     WebElement booksandAudibles;
     @FindBy (xpath = "//ul[@class='hmenu hmenu-visible hmenu-translateX']//li[3]//a[1]")
     WebElement books;


    public void searchBarInput(String search) throws InterruptedException {
        searchbar.sendKeys(search);
        sleepFor(2);
        searchbar.sendKeys(Keys.ENTER);
    }
    public void AllDropdownHomepage(String Catergory)
    {
        Select select = new Select(homepageDropdown);
        homepageDropdown.click();
        select.selectByVisibleText(Catergory);
        homepageDropdown.sendKeys(Keys.ENTER);
        sleepFor(5);
    }
    public String TabsunderSearcbar(String tablink)
    {
       if (tablink.equalsIgnoreCase("todays deal")){
           TodaysDeal.click();
           System.out.println(driver.getTitle());
       }
        else if (tablink.equalsIgnoreCase("your amazon.com"))
        {
            YourAmazon.click();
            System.out.println(driver.getTitle());
        }
        else if (tablink.equalsIgnoreCase("buy again"))
        {
            BuyAgain.click();
            System.out.println(driver.getTitle());
        }
       else if (tablink.equalsIgnoreCase("gift cards"))
       {
           GiftCards.click();
           System.out.println(driver.getTitle());
       }
       else if (tablink.equalsIgnoreCase("help"))
       {
           Help.click();
           System.out.println(driver.getTitle());
       }
       else if (tablink.equalsIgnoreCase("whole foods"))
       {
           Wholefoods.click();
           System.out.println(driver.getTitle());
       }
       else if (tablink.equalsIgnoreCase("registry"))
       {
           Registry.click();
           System.out.println(driver.getTitle());
       }
       else if (tablink.equalsIgnoreCase("sell"))
       {
           Sell.click();
           System.out.println(driver.getTitle());
       }
        return driver.getTitle();
    }

    public String GetreadyforSummerList(String links)
    {
        if (links.equalsIgnoreCase("yard"))
    {
        yard.click();
        System.out.println(driver.getTitle());
    }
    else if (links.equalsIgnoreCase("sports"))
    {
        sports.click();
        System.out.println(driver.getTitle());
    }
    else if (links.equalsIgnoreCase("Womens"))
    {
        women.click();
        System.out.println(driver.getTitle());
    }
    else if (links.equalsIgnoreCase("mens"))
    {
        men.click();
        System.out.println(driver.getTitle());
    }
    else if (links.equalsIgnoreCase("toys"))
    {
        toy.click();
        System.out.println(driver.getTitle());
    }
    else if (links.equalsIgnoreCase("health"))
    {
        health.click();
        System.out.println(driver.getTitle());
    }
    else if (links.equalsIgnoreCase("magazines"))
    {
        magazines.click();
        System.out.println(driver.getTitle());
    }
        return driver.getTitle();
    }


    public void hoveroverLanguage()
    {
        Actions action = new Actions(driver);
        action.moveToElement(languange).perform();
        sleepFor(3);
    }

    public void icononHomepage()
    {
        iconHomepage.click();
        sleepFor(2);
    }

    public String onetabfromicon()
    {
        booksandAudibles.click();
        books.click();
        System.out.println(driver.getTitle());
        return driver.getTitle();
    }
    }



