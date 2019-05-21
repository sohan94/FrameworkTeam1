package AmazonTestHomePage;

import AmazonHomePage.AmazonObjectHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonTestObjectHomePage extends CommonAPI {

    AmazonObjectHomePage obj1;

    @BeforeMethod
    public void AmazonTestObjectHomePage() {
        obj1 = PageFactory.initElements(driver, AmazonObjectHomePage.class);
    }

    @Test (enabled = false)
    public void searchBarInputTest() throws InterruptedException {
        obj1.searchBarInput();
    }

    @Test
    public void AllDropdownHomepageTest()
    {
        obj1.AllDropdownHomepage("Alexa Skills");
    }
 /*   @DataProvider
    public Object[][] Info()
    {
        Object data[][] = new Object[2][1];
        data[0][0] = "sohan";
        data[0][1] = "rifat";
        data[1][0] = "jannat";
        data[1][1] = "shawkat";
        data[2][0] = "daljeet";
        data[2][1] = "alli";
        return data;
    }

  */
}

