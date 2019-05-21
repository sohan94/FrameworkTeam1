package AmazonTestHomePage;

import AmazonHomePage.AmazonObjectHomePage;
import AmazonHomePage.SigninAmazon;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SigninAmazonTest extends CommonAPI {

     SigninAmazon sign;

    //before all the methods, the object is being initialized and given value
    @BeforeMethod
    public void intializationSignInPage() {
        sign = PageFactory.initElements(driver, SigninAmazon.class);
    }

    //go to signIn page from the homepage
    @Test (enabled = false)
    public void gotoSigninPageTest()
    {
        sign.gotosignInPage();
    }
    //check forget account link and see if it goes to the right page.
    @Test (enabled = false)
    public void checkForgetPasswordTest()
    {
        sign.gotosignInPage();
        sign.checkForgetPassword();
    }
    //check condition link and see if it goes to the right page.
    @Test (enabled =false)
    public void checkConditionLinkTest()
    {
        sign.gotosignInPage();
        sign.checkConditionLink();
    }
    //check privacy link and see if it goes to the right page
    @Test (enabled = false)
    public void checkPrivacyNoticeTest()
    {
        sign.gotosignInPage();
        String title = sign.checkPrivacyNotice();
        Assert.assertEquals(title,"Amazon.com Help: Amazon.com Privacy Notice");
    }
    //checks if the checkbox is marked or not.
    @Test (enabled = false)
    public void checkboxsignIn()
    {
        sign.gotosignInPage();
        sign.checkboxsignIn();
        Assert.assertEquals(sign.checkboxsignIn(),true);
    }
    //check SignIn with invalid user and password


    @Test (enabled = false)
    public void signInTestInvalid()
    {
        sign.gotosignInPage();
        sign.signInInvalid("sohan","rifat");


    }
    //check SignIn with valid user and password
    @Test (enabled = false)
    public void signInTestValid()
    {
        sign.gotosignInPage();
        sign.signInValid("jannat","shawkat");
    }
    //check if the create amazon acct works and goes to the crete acct page.
    @Test (enabled = false)
    public void AmazonCreateAccountTest()
    {
        sign.gotosignInPage();
        String title =sign.AmazonCreateAccount();
        Assert.assertEquals(title,"Amazon Registration");
    }

}
