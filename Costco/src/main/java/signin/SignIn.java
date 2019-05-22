package signin;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.jvm.hotspot.utilities.Assert;

public class SignIn extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"header_sign_in\"]")
    public static WebElement signin;

    @FindBy(xpath = "//*[@id=\"logon\"]/div/div/h1")
    public static WebElement checklogo;

    @FindBy(xpath = "//*[@id=\"LogonForm\"]/fieldset/div[1]/span")
    public static WebElement validtext;

    @FindBy(xpath = "//*[@id=\"logonId\"]")
    public static WebElement email;

    @FindBy(xpath = "//*[@id=\"logonPassword\"]")
    public static WebElement password;

    @FindBy(xpath = "//*[@id=\"LogonForm\"]/fieldset/div[5]/input")
    public static WebElement clicksignin;

    @FindBy(xpath = "//*[@id=\"LogonForm\"]/fieldset/div[4]/div/label")
    public static WebElement rememberme;

    @FindBy(xpath = "//*[@id=\"LogonForm\"]/fieldset/div[6]/a")
    public static WebElement forgot;

    @FindBy(xpath = "//*[@id=\"forgot-password\"]/div/div/h1")
    public static WebElement resetpass;

    @FindBy(xpath = "//*[@id=\"ResetPasswordForm\"]/fieldset/div[1]/span")
    public static WebElement gettext;

    @FindBy(xpath = "//*[@id=\"logonId\"]")
    public static WebElement enterreset;

    @FindBy(xpath = "//*[@id=\"ResetPasswordForm\"]/fieldset/div[3]/input")
    public static WebElement sendpass;

    @FindBy(xpath = "//*[@id=\"reset-password-success\"]/div/div/div/div/div[1]")
    public static WebElement gettextpass;

    @FindBy(xpath = "//*[@id=\"LogonForm\"]/fieldset/div[7]/span")
    public static WebElement costco;

    @FindBy(xpath = "//*[@id=\"LogonForm\"]/fieldset/div[8]/a")
    public static WebElement createaccounttext;


    public void sign() {
        System.out.println(signin.getText());
        signin.click();
    }

    public String checksign() {
        signin.click();
        System.out.println(checklogo.getText());
        String text = checklogo.getText();
        return text;
    }

    public void checktext() {
        System.out.println(validtext.getText());
    }

    public void emailaddress(String emailadd, String passadd) {
        email.sendKeys(emailadd);
        password.sendKeys(passadd);
        clicksignin.click();
    }

    public void emailaddress2(String emailad, String passad) {
        email.sendKeys(emailad);
        password.sendKeys(passad);
        clicksignin.click();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }

    public void clickrememberme(String emailaddd, String passaddd){
        emailaddress(emailaddd, passaddd);
        sleepFor(10);
        rememberme.click();
        System.out.println(rememberme.isEnabled());
        System.out.println(rememberme.getText());
        clicksignin.click();
    }

    public void forgotpass(String emailed){
        email.sendKeys(emailed);
        System.out.println(forgot.getText());
        forgot.click();
        System.out.println(driver.getTitle());
        System.out.println(resetpass.getText());
    }

    public void reset(String resetemail){
        forgot.click();
        System.out.println(gettext);
        enterreset.sendKeys(resetemail);
        System.out.println(sendpass.getText());
        sendpass.click();
    }

    public void pritingpass(String passemail){
        forgot.click();
        enterreset.sendKeys(passemail);
        sendpass.click();
        System.out.println(gettextpass.getText());
    }

    public void setCostco(){
        System.out.println(costco.getText());
        System.out.println(createaccounttext.getText());
        createaccounttext.click();
        System.out.println(driver.getTitle());


    }



}