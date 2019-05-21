package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(id = "gh-ac")
    public WebElement searchBar;




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

}
