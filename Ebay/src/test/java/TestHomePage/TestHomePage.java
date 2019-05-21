package TestHomePage;

import base.CommonAPI;
import homePage.HomePage;
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
    public void testSearch(){
        Assert.assertEquals(home.productSearch("Mobile"),"Mobile | eBay");
        System.out.println("Search is successful");
    }

    @Test(enabled = false)
    public void testClrSearch() throws InterruptedException {
        Assert.assertEquals(home.searchClrSearch("Mobile","Smartphone"), "Smartphone | eBay");
        System.out.println("Clear command on search bar works");
    }



}
