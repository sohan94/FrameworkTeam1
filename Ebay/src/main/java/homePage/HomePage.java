package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class HomePage extends CommonAPI {
    @FindBy(id = "gh-ac")
    public WebElement searchBar;

    @FindBy(id = "gh-cat")
    public WebElement allCategory;

    @FindBy(id = "gh-shop-a")
    public WebElement category;

    @FindBy(xpath = "//*[@_sp='m570.l3410']")
    public WebElement artCollect;

    @FindBy (linkText = "b-visualnav__title")
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

    public String productSearch(String word){
        searchBar.sendKeys(word,Keys.ENTER);
        return driver.getTitle();
    }

    public String searchClrSearch(String word, String newWord) throws InterruptedException {
        searchBar.sendKeys(word,Keys.ENTER);
        searchBar.clear();
        searchBar.sendKeys(newWord,Keys.ENTER);
        return driver.getTitle();
    }

    public String searchArt(String word){
        searchBar.sendKeys(word);
        allCategory.click();
        Select select = new Select(allCategory);
        //select.selectByVisibleText(word);
        select.selectByIndex(2);
        allCategory.sendKeys(Keys.ENTER);
        return driver.getTitle();
    }

    public String searchBook(String category, String word){
        searchBar.sendKeys(word);
        allCategory.click();
        Select select = new Select(allCategory);
        select.selectByVisibleText(category);
        allCategory.sendKeys(Keys.ENTER);
        return driver.getTitle();
    }

    public String categorySelect(){
        category.click();
        electronics.click();
        return verifyElectronics.getText();
    }

    public String findActionFigures(){
        category.click();
        artCollect.click();
        comics.sendKeys(Keys.ENTER);
        return driver.getTitle();
    }

    public String addToCart(String product){
        searchBar.sendKeys(product,Keys.ENTER);
        economicsBook.click();
        addToCart.click();
        checkCart.click();
        return driver.getTitle();
    }
}
