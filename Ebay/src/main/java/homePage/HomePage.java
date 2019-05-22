package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {
    @FindBy(id = "gh-ac")
    public WebElement searchBar;

    @FindBy(id = "gh-cat")
    public WebElement allCategory;

    @FindBy(id = "gh-shop-a")
    public WebElement category;

    @FindBy(xpath = "//*[@_sp='m570.l3410']")
    public WebElement artCollect;

    @FindBy(linkText = "b-visualnav__title")
    public WebElement comics;

    @FindBy(xpath = "//*[@_sp='m570.l3413']")
    public WebElement electronics;

    @FindBy(xpath = "//div[@class='pagecontainer__top']/nav/ol/li[2]")
    public WebElement verifyElectronics;

    @FindBy(className = "s-item__title")
    public WebElement economicsBook;

    @FindBy(id = "atcRedesignId_btn")
    public WebElement addToCart;

    @FindBy(xpath = "//a[@class='btn btn-scnd vi-VR-btnWdth-XL'/span")
    public WebElement checkCart;

    @FindBy(xpath = "//div[@class = 'app-atc-layer__actionRow']/a[2]")
    public WebElement goToCart;

    @FindBy(linkText = "Fashion")
    public WebElement fashionMenu;

    @FindBy(xpath = "//a[@_sp='p2481888.m1380.l3261']")
    public WebElement watches;

    @FindBy(xpath = "//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3")
    public WebElement headphone;

    @FindBy(xpath = "//select[@id='msku-sel-1']")
    public WebElement selectHeadphone;

    @FindBy(xpath = "//a[@id='isCartBtn_btn']")
    public WebElement addToList;

    @FindBy(xpath = "//*[@id=\"ADDON_0\"]/div/div[2]/div/div[4]/div/button[1]")
    public WebElement checkList;

    @FindBy(xpath = "//*[@id='gf-fbtn-arr']")
    public WebElement Country;

    @FindBy(linkText = "China")
    public WebElement china;

    @FindBy(id = "gf-fbtn")
    public WebElement countryReturn;

    @FindBy(css = "#mainContent > div.hl-cat-nav > ul > li:nth-child(7) > a")
    public WebElement homeGarden;

    @FindBy(linkText = "Fashion")
    public WebElement fashion;

    @FindBy(linkText = "Watches")
    public WebElement Watches;

    @FindBy(linkText = "Wristwatches")
    public WebElement wristWatches;


    @FindBy(linkText = "Accessibility")
    public WebElement accessibility;

    @FindBy(linkText = "User Agreement")
    public WebElement userAgreement;

    @FindBy(linkText = "Privacy")
    public WebElement privacy;

    @FindBy(linkText = "Cookies")
    public WebElement cookies;

    @FindBy(id = "gf-AdChoice")
    public WebElement adChoice;

    @FindBy(linkText = "Sell")
    public WebElement sell;

    @FindBy(linkText = "Business tool")
    public WebElement businessTool;

    @FindBy(linkText = "Help")
    public WebElement help;

    @FindBy(id = "lnkFdbk")
    public WebElement comments;

    @FindBy(xpath = "//select[@id='gh-cat']")
    WebElement allcategories;

    @FindBy(css = "select[id='gh-cat'][name='_sacat']")
    WebElement categories;



    public String productSearch(String word) {
        searchBar.sendKeys(word, Keys.ENTER);
        return driver.getTitle();
    }

    public String searchClrSearch(String word, String newWord) throws InterruptedException {
        searchBar.sendKeys(word, Keys.ENTER);
        searchBar.clear();
        searchBar.sendKeys(newWord, Keys.ENTER);
        return driver.getTitle();
    }

    public String searchArt(String word) {
        searchBar.sendKeys(word);
        allCategory.click();
        Select select = new Select(allCategory);
        //select.selectByVisibleText(word);
        select.selectByIndex(2);
        allCategory.sendKeys(Keys.ENTER);
        return driver.getTitle();
    }

    public String searchBook(String category, String word) {
        searchBar.sendKeys(word);
        allCategory.click();
        Select select = new Select(allCategory);
        select.selectByVisibleText(category);
        allCategory.sendKeys(Keys.ENTER);
        return driver.getTitle();
    }

    public String categorySelect() {
        category.click();
        electronics.click();
        return verifyElectronics.getText();
    }

    public String findActionFigures() {
        category.click();
        artCollect.click();
        comics.sendKeys(Keys.ENTER);
        return driver.getTitle();
    }

    public String addToCart(String product) {
        searchBar.sendKeys(product, Keys.ENTER);
        economicsBook.click();
        addToCart.click();
        sleepFor(4);
        goToCart.click();
        return driver.getTitle();
    }

    public String checkHover() {

        Actions actions = new Actions(driver);
        actions.moveToElement(fashionMenu).build().perform();
        watches.click();
        return driver.getTitle();
    }

    public String buyProduct(String product) {
        searchBar.sendKeys(product, Keys.ENTER);
        headphone.click();
        Select select = new Select(selectHeadphone);
        select.selectByIndex(1);
        sleepFor(3);
        addToList.click();
        checkList.click();
        return driver.getTitle();
    }


    public String changeCountry(String country) {
        Actions actions = new Actions(driver);
        actions.moveToElement(Country).perform();
        china.click();
        return driver.getCurrentUrl();

    }

    public String returnCountry() {
        Actions actions = new Actions(driver);
        actions.moveToElement(Country).perform();
        china.click();
        countryReturn.click();
        return driver.getCurrentUrl();
    }

    public String navigate() {
        homeGarden.click();
        String before = driver.getTitle();
        driver.navigate().back();
        driver.navigate().forward();
        return before;
    }


    public void searchWithList(String a, String b, String c) {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add(a);
        itemsList.add(b);
        itemsList.add(c);
        for (String st : itemsList) {
            searchBar.sendKeys(st, Keys.ENTER);
            sleepFor(1);
            searchBar.clear();
        }

    }

    public void searchWithArray(String a, String b, String c) {
        String [] tech = {a,b,c};
        for (String i  : tech) {
            searchBar.sendKeys(i, Keys.ENTER);
            sleepFor(1);
            searchBar.clear();
        }

    }

    public String sellPage(){
        sell.click();
        businessTool.isEnabled();
        help.isDisplayed();
        comments.isDisplayed();
        return driver.getCurrentUrl();
    }

    public void allCategories(){
        categories.click();
        Select select= new Select(  allcategories );
        List<WebElement> all=select.getOptions();
        for (WebElement xpath: all){
            System.out.println(xpath);
        }
    }


    @FindBy(linkText = "Shop Watches")
    public WebElement shopWatches;

    @FindBy(className = "b-img")
    public WebElement rolex;

    @FindBy(xpath = "//*[@id=\"w5-xCarousel-x-carousel-items\"]/ul/li[1]/a/p")
    public WebElement sorting;

    @FindBy(xpath = "//*[@class='b-img']")
    public WebElement sortbox;

    @FindBy(className = "srp-controls--selected-value")
    public WebElement dropDown;

    @FindBy(linkText = "Time: newly listed")
    public WebElement newly;

    public void selectingRolex(){

        Actions actions = new Actions(driver);
        actions.moveToElement(fashion).perform();
        Watches.click();
        rolex.click();
    }


}
