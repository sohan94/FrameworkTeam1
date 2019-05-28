package testCommon;

import base.CommonAPI;
import common.Common;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCommon extends CommonAPI {


    Common common;

    @BeforeMethod
    public void initialization() {
        common = PageFactory.initElements(driver, Common.class);
    }


    @Test(enabled = false)
    public void testClrSearch() throws InterruptedException {
        Assert.assertEquals(common.searchClrSearch("Mobile", "Smartphone"), "Smartphone | eBay");
        System.out.println("Clear command on search bar works");
    }

    @Test(enabled = false)
    public void searchArt() {
        Assert.assertEquals(common.searchArt("Paintings"), "Paintings in Art | eBay");
        System.out.println("Search  in Art passed");
    }

    @Test(enabled = false)
    public void printTopList(){

        System.out.println(common.topBar());
    }

    @Test(enabled = false)
    public void printCSS(){
        common.topBarCSS();
    }

    @Test(enabled = false)
    public void testNewTab(){
        System.out.println(common.newTab());
    }


    @Test(enabled = false)
    public void testPopUp(){
        System.out.println(common.popUp());
    }

    @Test(enabled = false)
    public void testSearchLocator(){
        common.searchByElement();
        System.out.println(driver.getTitle());
    }

    @Test(enabled = false)
    public void testSearch(){
        common.search();
        System.out.println(driver.getTitle());
    }

    @Test(enabled = false)
    public void checkingCart() {
        Assert.assertEquals(common.addToCart("Economics Book"), "Shopping cart");
        System.out.println("Shopping cart is showing");
    }



}
