package testhomepage;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage homePage;

    @BeforeMethod
    public void initialization() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test(enabled = false)
    public void getTitle() {
        homePage.checkTitle();
    }

    @Test(enabled = false)
    public void typingSearch() {
        homePage.writeSearch();
    }

    @Test(enabled = false)
    public void dropping() {
        homePage.dropAll();
    }

    @Test(enabled = false)
    public void lookShop() {
        homePage.shopdepart();
    }

    @Test(enabled = false)
    public void checkgrocery() {
        homePage.groceryclick();
    }

    @Test(enabled = false)
    public void checkOptical() {
        homePage.opticalClick();
    }

    @Test(enabled = false)
    public void checkWH() {
        homePage.warehouse();
    }

    @Test(enabled = false)
    public void searchBYState() {
        homePage.lookWH("11419");
    }

    @Test(enabled = false)
    public void countCheckBoxes() {
        homePage.checkboxesWH("Queens");
    }

    @Test(enabled = false)
    public void checktry() {
        homePage.checkmarkWH("New YORK");

        // Assert.assertEquals(homePage.checkmarkWH("new"),true);
        //System.out.println("whatwebeb");
    }

    @Test(enabled = false)
    public void testingAnyPM() {
        homePage.any("11420");
    }


    @Test(enabled = false)
    public void testarrow() {
        homePage.arrow();
    }
}

