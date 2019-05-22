package AmazonTestHomePage;

import AmazonHomePage.AmazonObjectHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
    public void searchBarInputTest() throws InterruptedException
    {
        obj1.searchBarInput("Headphones");
    }

    @Test (enabled = false)
    public void AllDropdownHomepageTest()
    {
        obj1.AllDropdownHomepage("Computers");
    }

    @Test (enabled = false)
    public void DropdownAndSearch() throws InterruptedException {
         obj1.AllDropdownHomepage("Computers");
         obj1.searchBarInput("Mac 2019");

    }
    @Test (enabled = false)
    public void TabsunderSearcbar()
    {
        obj1.TabsunderSearcbar("buy again");
    }
    @Test (enabled = false)
    public void GetreadyforSummerListtest()
    {
        obj1.GetreadyforSummerList("health");
    }
    @Test (enabled = false)
    public void hoveroverLanguage()
    {
        obj1.hoveroverLanguage();
    }
    @Test (enabled = false)
    public void icononHomepageTest()
    {
        obj1.icononHomepage();
    }
    @Test
    public void onetabfromiconTest()
    {
        obj1.icononHomepage();
        Assert.assertEquals(obj1.onetabfromicon(),"Amazon.com: Books");
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

