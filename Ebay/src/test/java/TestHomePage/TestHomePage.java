package TestHomePage;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestHomePage extends CommonAPI {

    HomePage home;

    @BeforeMethod
    public void initialization() {
        home = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = false)
    public void testSearch() {
        Assert.assertEquals(home.productSearch("Mobile"), "Mobile | eBay");
        System.out.println("Search is successful");
    }

    @Test(enabled = false)
    public void testClrSearch() throws InterruptedException {
        Assert.assertEquals(home.searchClrSearch("Mobile", "Smartphone"), "Smartphone | eBay");
        System.out.println("Clear command on search bar works");
    }

    @Test(enabled = false)
    public void searchArt() {
        Assert.assertEquals(home.searchArt("Paintings"), "Paintings in Art | eBay");
        System.out.println("Search  in Art passed");
    }

    @Test(enabled = false)
    public void searchBooks() {
        Assert.assertEquals(home.searchBook("Books", "Freakonomics"), "Freakonomics in Books | eBay");
        System.out.println("Desiered book is found");
    }

    @Test(enabled = false)
    public void categoryTest() {
        Assert.assertEquals(home.categorySelect(), "Electronics");
        System.out.println("Matched with expected text");
    }

    @Test(enabled = false)
    public void actionFigure() {
        Assert.assertEquals(home.findActionFigures(), "Collectible for sale | eBay");
        System.out.println("Sub categories are working");
    }

    @Test(enabled = false)
    public void checkingCart() {
        Assert.assertEquals(home.addToCart("Economics Book"), "Shopping cart");
        System.out.println("Shopping cart is showing");
    }

    @Test(enabled = false)
    public void checkWatches() {
        Assert.assertEquals(home.checkHover(), "Watches, Parts & Accessories for sale | eBay");
        System.out.println("Hover over top menu is working");
    }

    @Test(enabled = false)
    public void buyHeadphone() {
        Assert.assertEquals(home.buyProduct("Samsung Headphones"), "Shopping cart");
        System.out.println("Headphone is selected for cashout");
    }

    @Test(enabled = false)
    public void countrySelection() {
        Assert.assertEquals(home.changeCountry("China"), "https://www.ebay.cn/");
        System.out.println("Country is selected successfully");
    }

    @Test(enabled = false)
    public void returnToUSA(){
        Assert.assertEquals(home.returnCountry(), "https://www.ebay.com/");
        System.out.println("Country change back successfull");
    }

    @Test(enabled = false)
    public void checkNevigation(){
        Assert.assertEquals(home.navigate(),"Home & Garden products for sale | eBay");
        System.out.println("Navigate is working smoothly");
    }


    @Test(enabled = false)
    public void searchMultiple(){
        home.searchWithList("Samsung", "Apple", "Google");

    }

    @Test(enabled = false)
    public void searchWithArray(){
        home.searchWithArray("Samsung","Huawei", "Apple");
    }

    @Test(enabled = false)
    public void testSellPage(){
        Assert.assertEquals(home.sellPage(),"https://www.ebay.com/sl/sell");
        System.out.println("Home Page is working");
    }

    @Test(enabled = false)
    public void testCategories(){
        home.allCategories();
    }

    @Test(enabled = false)
    public void productSorting(){
        home.selectingRolex();
    }
}
