package signIn;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.xml.xpath.XPath;

public class SignInProcess extends CommonAPI {

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement signInButton;
    @FindBy(how = How.ID, using = "userid")
    public static WebElement userName;
    @FindBy(how = How.XPATH, using = "//*[@id='pass']")
    public static WebElement password;
    @FindBy(id = "sgnBt")
    public static WebElement submitSignIn;
    @FindBy(id = "errf")
    public static WebElement errorMessageSignin;
    @FindBy(xpath = "//*[@id='otpanch']")
    public static WebElement temporaryPassword;
    @FindBy(id = "userid_otp")
    public static WebElement emailTemporary;
    @FindBy(id = "otp-btn")
    public static WebElement submitTemporaryPass;
    @FindBy(id ="otpErrMsg")
    public static WebElement errorMessageTemp;
    @FindBy(xpath = "//*[@id='inflowfyp']")
    public static WebElement resetPassword;


    @FindBy(id = "InLineCreateAnAccount")
    public static WebElement createAccount;
    @FindBy(id = "signin_fb_btn")
    public static WebElement facebookSignin;
    @FindBy(id ="signin_ggl_btn")
    public static WebElement googleSignin;
    @FindBy(className = "checkbox__control")
    public static WebElement staySignedin;
    @FindBy(id = "signinanch1")
    public static WebElement learnMore;



    public void signIn(){
        signInButton.click();
        userName.sendKeys("user1");
        password.sendKeys("pass1");
        submitSignIn.click();
    }

    public String signInInvalid(){
        signInButton.click();
        userName.sendKeys("user1");
        password.sendKeys("pass1");
        submitSignIn.click();
        String errorMessage = errorMessageSignin.getText();
        return errorMessage;
    }

    public String createAccount(){
        createAccount.click();
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }



}
