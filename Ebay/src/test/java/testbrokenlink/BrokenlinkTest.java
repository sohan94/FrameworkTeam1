package testbrokenlink;

import base.CommonAPI;
import brokenlink.Brokenlinks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class BrokenlinkTest extends CommonAPI {

    Brokenlinks brokenLin;

    String url = "https://www.ebay.com";
    @BeforeMethod
    public void init(){
        brokenLin = PageFactory.initElements(driver,Brokenlinks.class);
        driver.get(url);
    }

    @Test(enabled = true)
    public void testeBayActivlinks() throws IOException {
        brokenLin.linksbroken();
    }
}