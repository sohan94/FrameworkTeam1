package AmazonHomePage;

import base.CommonAPI;
import org.openqa.selenium.*;
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

    public void searchBarInput() throws InterruptedException {
        searchbar.sendKeys("samsung headphones");
        sleepFor(2);
        searchbar.clear();
        searchbar.sendKeys("123456");
        sleepFor(2);
        searchbar.clear();
        searchbar.sendKeys("Samsung Phone");

    }
    public void AllDropdownHomepage(String Catergory)
    {
        Select select = new Select(homepageDropdown);
        homepageDropdown.click();
        select.selectByVisibleText(Catergory);
        homepageDropdown.sendKeys(Keys.ENTER);
    }

}

