package TestHomePage;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;


public class TestHomePage extends CommonAPI {

    HomePage home;

    @BeforeMethod
    public void initialization() {
        home = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = false)
    public void testSearch(){
        Assert.assertEquals(home.productSearch("Mobile"),"Mobile | eBay");
        System.out.println("Search is successful");
    }

    @Test(enabled = false)
    public void testClrSearch() throws InterruptedException {
        Assert.assertEquals(home.searchClrSearch("Mobile","Smartphone"), "Smartphone | eBay");
        System.out.println("Clear command on search bar works");
    }

    @Test(enabled = false)
    public void searchArt() {
        Assert.assertEquals(home.searchArt("Paintings"), "Paintings in Art | eBay");
        System.out.println("Search  in Art passed");
    }

    @Test(enabled = false)
    public void searchBooks() {
        Assert.assertEquals(home.searchBook("Books","Freakonomics"),"Freakonomics in Books | eBay");
        System.out.println("Desiered book is found");
    }

    @Test(enabled = false)
    public void categoryTest(){
        Assert.assertEquals(home.categorySelect(),"Electronics");
        System.out.println("Matched with expected text");
    }

    @Test(enabled = false)
    public void actionFigure(){
        Assert.assertEquals(home.findActionFigures(),"Collectible for sale | eBay");
        System.out.println("Sub categories are working");
    }

    @Test(enabled = true)
    public void checkingCart(){
        Assert.assertEquals(home.addToCart("Economics Book"),"Shopping cart");
        System.out.println("Shopping cart is showing");
    }


}
