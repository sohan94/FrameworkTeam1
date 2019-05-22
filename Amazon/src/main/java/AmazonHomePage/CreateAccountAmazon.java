package AmazonHomePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class CreateAccountAmazon extends CommonAPI {
    @FindBy (xpath = "//a[@id='nav-link-accountList']")
    WebElement signinHomepagebutton;
    @FindBy (xpath = "//a[@id='createAccountSubmit']")
    WebElement createAcctButtoninSignin;
    @FindBy (id = "ap_customer_name")
    WebElement name;
    @FindBy (css = "input[type='email']")
    WebElement email;
    @FindBy (css = "input[name='password']")
    WebElement password;
    @FindBy (xpath = "//input[@id='ap_password_check']")
    WebElement reEnterPassword;
    @FindBy (css = "input[id='continue']")
    WebElement createAcctButtoninCreate;

    public void gotoCreateAccountPage()
    {
        driver.navigate().to("https://amazon.com");
        signinHomepagebutton.click();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        createAcctButtoninSignin.click();
    }
    public void CreateAccountInput(String username, String useremail, String userpassword)
    {
        name.sendKeys(username);
        email.sendKeys(useremail);
        password.sendKeys(userpassword);
        reEnterPassword.sendKeys(userpassword);
        createAcctButtoninCreate.click();
        sleepFor(5);
    }
}
