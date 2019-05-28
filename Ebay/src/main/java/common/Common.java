package common;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

import java.util.List;

public class Common extends CommonAPI {

    @FindBy(id= "gh-ac")
    public WebElement searchBar;

    @FindBy(id = "gh-cat")
    public WebElement allCategory;

    @FindBy(linkText = "Daily Deals")
    public WebElement dailyDeals;

    @FindBy(partialLinkText = "Men's")
    public WebElement selectDeal;

    @FindBy(partialLinkText = "Learn more")
    public WebElement authentication;

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public WebElement signInButton;

    @FindBy(className = "s-item__title")
    public WebElement economicsBook;

    @FindBy(id = "atcRedesignId_btn")
    public WebElement addToCart;

    @FindBy(xpath = "//div[@class = 'app-atc-layer__actionRow']/a[2]")
    public WebElement goToCart;



    public String searchClrSearch(String word, String newWord) throws InterruptedException {
        searchBar.sendKeys(word, Keys.ENTER);
        captureScreenshot(driver,"clearSearch");
        searchBar.clear();
        searchBar.sendKeys(newWord, Keys.ENTER);
        TestLogger.log(getClass().getSimpleName() + ":  searchClrSearch" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.getTitle();

    }

    public String searchArt(String word) {
        searchBar.sendKeys(word);
        allCategory.click();
        Select select = new Select(allCategory);
        //select.selectByVisibleText(word);
        select.selectByIndex(2);
        allCategory.sendKeys(Keys.ENTER);
        getScreenshot(driver);
        TestLogger.log(getClass().getSimpleName() + ":  searchArt" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.getTitle();
    }

    public List<String> topBar(){
        List<String> topList = getTextFromWebElements("ul[class='hl-cat-nav__container']");
        TestLogger.log(getClass().getSimpleName() + ":  topBar" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return topList;

    }

    public void topBarCSS(){
        List<WebElement> topList = getListOfWebElementsByCss("ul[class='hl-cat-nav__container']");

        for(WebElement i:topList) {
            System.out.println(i.getText() );

        }
        TestLogger.log(getClass().getSimpleName() + ": topBarCSS" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

    }

    public String newTab(){
        dailyDeals.click();
        selectDeal.click();
        authentication.click();
        handleNewTab(driver);
        TestLogger.log(getClass().getSimpleName() + ": newTab" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.getTitle();

    }

    public boolean popUp(){
        signInButton.click();
        boolean b = isPopUpWindowDisplayed(driver,"button[id=signin_fb_btn]");
        TestLogger.log(getClass().getSimpleName() + ": popUp" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return b;
    }

    public void searchByElement(){
        typeOnElementNEnter("gh-ac","economics book");
        TestLogger.log(getClass().getSimpleName() + ": searchByElement" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

    }

    public void search(){
        typeOnElementNEnter("gh-ac","new phone", driver);
        TestLogger.log(getClass().getSimpleName() + ": search" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

    }

    public String addToCart(String product) {
        searchBar.sendKeys(product, Keys.ENTER);
        economicsBook.click();
        addToCart.click();
        sleepFor(4);
        goToCart.click();
        TestLogger.log(getClass().getSimpleName() + ": addToCart" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return driver.getTitle();
    }


}
