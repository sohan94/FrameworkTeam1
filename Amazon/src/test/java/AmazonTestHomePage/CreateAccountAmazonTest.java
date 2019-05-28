package AmazonTestHomePage;

import AmazonHomePage.CreateAccountAmazon;
import AmazonHomePage.SigninAmazon;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountAmazonTest extends CommonAPI {

    CreateAccountAmazon create;
    @BeforeMethod
    public void intializationSignInPage() {
        create = PageFactory.initElements(driver, CreateAccountAmazon.class);
    }
    //test the input of the create account page.

    @Test (enabled = false)
    public void CreateAccountInputTest()
    {
        create.gotoCreateAccountPage();
        create.CreateAccountInput("Sohan","rifat@gmail.com","1233431");
    }
    @Test
    public void AlreadyHaveAnAcctLinkTest()
    {
        create.gotoCreateAccountPage();
        create.AlreadyHaveAnAcctLink();
        Assert.assertEquals(create.AlreadyHaveAnAcctLink(),"Amazon Sign In");
    }


}
