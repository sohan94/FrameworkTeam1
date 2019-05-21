package signIn;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInProcess extends CommonAPI {

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public WebElement signInButton;
    @FindBy(how = How.ID, using = "userid")
    public WebElement userName;
    @FindBy(how = How.XPATH, using = "//*[@id='pass']")
    public WebElement password;
    @FindBy(id = "sgnBt")
    public WebElement submitSignIn;
    @FindBy(id = "errf")
    public WebElement errorMessageSignin;
    @FindBy(xpath = "//*[@id='otpanch']")
    public WebElement temporaryPassword;
    @FindBy(id = "userid_otp")
    public WebElement emailTemporary;
    @FindBy(id = "otp-btn")
    public WebElement submitTemporaryPass;
    @FindBy(id = "otpErrMsg")
    public WebElement errorMessageTemp;
    @FindBy(className = "ds6")
    public WebElement tempSuccess;
    @FindBy(xpath = "//*[@id='inflowfyp']")
    public WebElement resetPassword;
    @FindBy(xpath = "//*[@id='userInfo']")
    public WebElement resetEmail;
    @FindBy(name = "submitBtn")
    public WebElement submitReset;
    @FindBy(className = "caption")
    public WebElement resetSuccess;
    @FindBy(id = "errf")
    public WebElement resetFailed;
    @FindBy(id = "InLineCreateAnAccount")
    public WebElement createAccount;
    @FindBy(className = "giant-text-2")
    public WebElement createAccText;
    @FindBy(id = "signin_fb_btn")
    public WebElement facebookSignin;
    @FindBy(id = "signin_ggl_btn")
    public WebElement googleSignin;
    @FindBy(className = "Fmgc2c")
    public WebElement googleText;
    @FindBy(className = "checkbox__control")
    public WebElement staySignedin;
    @FindBy(id = "GREET-SIGN-IN-TO-EBAY")
    public WebElement greetings;
    @FindBy(id = "signinanch1")
    public WebElement learnMore;


    public String validSignIn(String user, String pass) {
        signInButton.click();
        userName.sendKeys(user);
        password.sendKeys(pass);
        submitSignIn.click();
        return driver.getCurrentUrl();

    }

    public String invalidSignIn(String user, String pass) {
        signInButton.click();
        userName.sendKeys(user);
        password.sendKeys(pass);
        submitSignIn.click();
        return errorMessageSignin.getText();

    }

    public String createAccount() {
        signInButton.click();
        createAccount.click();
        return createAccText.getText();
    }

    public boolean signInFB() {
        signInButton.click();
        return facebookSignin.isEnabled();

    }

    public String signInGoogle() {
        signInButton.click();
        googleSignin.click();
        return googleText.getText();
    }


    public String tempPasswordPassed(String email) {
        signInButton.click();
        temporaryPassword.click();
        emailTemporary.sendKeys(email,Keys.ENTER);
        return tempSuccess.getText();
    }

    public String tempPasswordFailed(String email) {
        signInButton.click();
        temporaryPassword.click();
        emailTemporary.sendKeys(email);
        submitTemporaryPass.sendKeys(Keys.ENTER);
        return errorMessageTemp.getText();

    }

    public boolean staySigned() {
    signInButton.click();
    return staySignedin.isSelected();
    }

    public String resetPasswordValid(String email){
        signInButton.click();
        resetPassword.click();
        resetEmail.sendKeys(email);
        submitReset.click();
        return resetSuccess.getText();
        }

    public String resetPasswordInvalid(String email){
        signInButton.click();
        resetPassword.click();
        resetEmail.sendKeys(email,Keys.ENTER);
        return resetFailed.getText();
    }

    public boolean greet(){
        signInButton.click();
        return greetings.isDisplayed();
    }

}
