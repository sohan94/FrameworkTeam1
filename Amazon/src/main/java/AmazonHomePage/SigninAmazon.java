package AmazonHomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SigninAmazon extends CommonAPI {

    @FindBy (id ="ap_email")
    WebElement email;
    @FindBy (id ="ap_password")
    WebElement pass;
    @FindBy (xpath = "//a[@id='nav-link-accountList']")
    WebElement signinHomepagebutton;
    @FindBy (xpath = "//input[@id='signInSubmit']")
    WebElement signInPagebutton;
    @FindBy (xpath = "//a[@id='auth-fpp-link-bottom']")
    WebElement forgetpassword;
    @FindBy (xpath = "//div[@id=\"legalTextRow\"]/a[1]")
    WebElement ConditionofUselink;
    @FindBy (xpath = "//div[@id=\"legalTextRow\"]/a[2]" )
    WebElement privacyNoticeLink;
    @FindBy (css = "input[type='checkbox']")
    WebElement signInCheckbox;
    @FindBy (xpath = "/span[class='a-list-item']")
    WebElement InvalidsigninText;
    @FindBy (css = "a[id='createAccountSubmit']")
    WebElement createAmazonAccountbutton;



    public void gotosignInPage()
    {
        driver.navigate().to("https://amazon.com");
        signinHomepagebutton.click();

    }
    public void checkForgetPassword()
    {
        forgetpassword.click();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Amazon Password Assistance");
    }
    public void checkConditionLink()
    {
        ConditionofUselink.click();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Amazon.com Help: Conditions of Use");
    }

    public String checkPrivacyNotice()
    {
        privacyNoticeLink.click();
        return driver.getTitle();
    }

    public boolean checkboxsignIn()
    {
        signInCheckbox.click();
        return signInCheckbox.isEnabled();
    }
    public void signInInvalid(String username, String password)
    {
        email.sendKeys(username);
        pass.sendKeys(password);
        sleepFor(5);
        signInPagebutton.click();

    }
    public String signInValid(String username, String password)
    {
        email.sendKeys(username);
        pass.sendKeys(password);
        sleepFor(5);
        signInPagebutton.click();
        sleepFor(5);
        return InvalidsigninText.getText();
    }
    public String AmazonCreateAccount()
    {
        createAmazonAccountbutton.sendKeys(Keys.ENTER);
        sleepFor(3);
        return driver.getTitle();
    }
}
