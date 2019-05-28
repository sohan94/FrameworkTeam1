package AmazonHomePage;

import base.CommonAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
     @FindBy (xpath = "//div[@class='navFooterLine navFooterLinkLine navFooterDescLine']/table/tbody/tr/td/a")
     WebElement AmazonMusic;
     @FindBy (xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")
     WebElement Careers;
    @FindBy (xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")
    WebElement Blog;
    @FindBy (xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[3]/a")
    WebElement AboutAmazon;
    @FindBy (xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[4]/a")
    WebElement PressCenter;
    @FindBy (xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[5]/a")
    WebElement InvestorRelations;
    @FindBy (xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[6]/a")
    WebElement AmazonDevices;
    @FindBy (xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[7]/a")
    WebElement Tour;
    @FindBy (xpath = "//div[@class='navFooterVerticalRow navAccessibility']/div[3]/ul/li[1]")
    WebElement SellAmazon;
    @FindBy (xpath = "//div[@class='navFooterVerticalRow navAccessibility']/div[3]/ul/li[2]")
    WebElement SellunderBrand;
    @FindBy (xpath = "//div[@class='navFooterVerticalRow navAccessibility']/div[3]/ul/li[3]")
    WebElement SellHandmade;
    @FindBy (xpath = "//div[@class='navFooterVerticalRow navAccessibility']/div[3]/ul/li[4]")
    WebElement SellServices;
    @FindBy (xpath = "//div[@class='navFooterVerticalRow navAccessibility']/div[3]/ul/li[5]")
    WebElement SellBusiness;
    @FindBy (xpath = "//div[@class='navFooterVerticalRow navAccessibility']/div[3]/ul/li[6]")
    WebElement SellApp;
    @FindBy (xpath = "//div[@class='navFooterVerticalRow navAccessibility']/div[3]/ul/li[7]")
    WebElement BecomeAffiliate;
    @FindBy (xpath = "//div[@class='navFooterVerticalRow navAccessibility']/div[3]/ul/li[8]")
    WebElement Advertise;
    @FindBy (xpath = "//div[@class='navFooterVerticalRow navAccessibility']/div[3]/ul/li[9]")
    WebElement SelfPublish;
    @FindBy (xpath = "//div[@class='navFooterVerticalRow navAccessibility']/div[3]/ul/li[10]")
    WebElement Opportunity;
    @FindBy (xpath = "//a[@id='icp-nav-flyout']")
    WebElement language;
    @FindBy (xpath = "//a[@id='icp-touch-link-language']")
    WebElement languagePopUp;
    @FindBy (css = "button.a-button-text")
    WebElement popUpCancel;
    @FindBy (xpath = "//a[@id='icp-touch-link-country']")
    WebElement Country;
    @FindBy (css = "span.a-button-text.a-declarative")
    WebElement languageSelection;



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

    // check to see if the tabs under the seaerchbar is working properly

    public String TabsunderSearcbar(String tablink)
    {
        if (tablink.equalsIgnoreCase("todays deal")){
           TodaysDeal.click();
           System.out.println(driver.getTitle());
           TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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

    public void multipleWindowswithShift()
    {
        Actions a = new Actions(driver);
        a.keyDown(Keys.SHIFT).click(AmazonMusic).perform();
        sleepFor(5);
        System.out.println(driver.getTitle()); //before switching to the child window
        Set<String> windows= driver.getWindowHandles();
        Iterator<String> list = windows.iterator();
        String parentWindow=list.next();
        String childWindow= list.next();
        driver.switchTo().window(childWindow);
        System.out.println(driver.getTitle()); // after switching to the child window
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle()); //switching back
    }

    public void multipletabs()
    {
        Actions a = new Actions(driver);
        a.keyDown(Keys.CONTROL).click(AmazonMusic).perform();
        sleepFor(5);
        System.out.println(driver.getTitle());
        handleNewTab(driver);
        System.out.println(driver.getTitle());

    }

    public void CareerLink()
    {
        Careers.click();
    }

    public void Blog()
    {
        Blog.click();
    }

    public void AboutAmazon()
    {
        AboutAmazon.click();
    }

    public void PressCenter()
    {
        PressCenter.click();
    }

    public void InvestorRelations()
    {
        InvestorRelations.click();
    }

    public void AmazonDevices()
    {
        AmazonDevices.click();
    }

    public void Tour()
    {
        Tour.click();
    }

    public void SellonAmazon()
    {
        SellAmazon.click();
        System.out.println(driver.getTitle());
    }
    public void SellunderBrand()
    {
        SellunderBrand.click();
        System.out.println(driver.getTitle());
    }
    public void SellHandmade()
    {
        SellHandmade.click();
        System.out.println(driver.getTitle());
    }
    public void SellServices()
    {
        SellServices.click();
        System.out.println(driver.getTitle());
    }
    public void SellBusiness()
    {
        SellBusiness.click();
        System.out.println(driver.getTitle());
    }
    public void SellApps()
    {
        SellApp.click();
        System.out.println(driver.getTitle());
    }
    public void BecomeAffiliate()
    {
        BecomeAffiliate.click();
        System.out.println(driver.getTitle());
    }
    public void Advertise()
    {
        Advertise.click();
        System.out.println(driver.getTitle());
    }
    public void SelfPublished()
    {
        SelfPublish.click();
        System.out.println(driver.getTitle());
    }
    public void Opportunity()
    {
        Opportunity.click();
        System.out.println(driver.getTitle());
    }

    public void gotoLanguagePage()
    {
        language.click();
        System.out.println(driver.getTitle());
    }

    public void LanguagePopUp()
    {
        languagePopUp.click();
        sleepFor(2);
        popUpCancel.click();
    }

    public void CountryPopUp()
    {
        Country.click();
        sleepFor(2);
        popUpCancel.click();
    }

    public void CountryDropdown()
    {
        Country.click();
        languageSelection.sendKeys(Keys.ENTER);
        sleepFor(3);
    }
}



