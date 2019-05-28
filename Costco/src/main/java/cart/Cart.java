package cart;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Cart extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"cart-d\"]")
    public WebElement cartclick;

    @FindBy(xpath = "//*[@id=\"ShopCartForm\"]/div[4]/div/input")
    public WebElement shopping;

    @FindBy(xpath = "/html/body/div[8]/div/div/div[1]/a/div/div")
    public WebElement item;

    public void cart(){
        cartclick.click();
        System.out.println(cartclick.getText());
        System.out.println(getCurrentPageUrl());
        System.out.println(driver.getTitle());
        shopping.click();
        sleepFor(5);
        System.out.println(shopping.getText());
        item.click();
        sleepFor(5);
        System.out.println(item.getText());
    }

}
