package createaccount;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"header_sign_in\"]")
    public static WebElement register;

    @FindBy(xpath = "//*[@id=\"LogonForm\"]/fieldset/div[8]/a")
    public static WebElement createAcc;

    @FindBy(linkText = "Create a new Costco.com account.")
    public static WebElement text;

    @FindBy(xpath = "//input[@id=\"register_email1\"]")
    public static WebElement email;

    @FindBy(xpath = "//*[@id=\"logonPassword\"]")
    public static WebElement pass;

    @FindBy(xpath = "//*[@id=\"logonPasswordVerify\"]")
    public static WebElement confirmpass;

    @FindBy(xpath = "//*[@id=\"RegisterForm\"]/fieldset/div[7]/input")
    public static WebElement clickcreate;

    @FindBy(xpath = "//*[@id=\"PasswordStrength\"]/div[2]")
    public static WebElement passstrength;

    @FindBy(xpath = "//*[@id=\"RegisterForm\"]/fieldset/h6[1]")
    public static WebElement printwhy;

    @FindBy(xpath = "//*[@id=\"RegisterForm\"]/fieldset/h6[1]/span")
    public static WebElement clickwhy;

    @FindBy(xpath = "//*[@id=\"RegisterForm\"]/fieldset/h6[1]/span")
    public static WebElement printedwhy;

    public void registerAccount(){
        register.click();
        createAcc.click();
        System.out.println(driver.getTitle());
        if(text.isDisplayed()){
            System.out.println(text);}
        else
            System.out.println("false text");
    }

    public void email1(String emailenter, String passenter, String conpass){
        register.click();
        createAcc.click();
        email.sendKeys(emailenter);
        pass.sendKeys(passenter);
        sleepFor(5);
        confirmpass.sendKeys(conpass);
        clickcreate.click();
    }

    public void email2(String email2enter,String pass2, String conpas2 ){
        register.click();
        createAcc.click();
        email.sendKeys(email2enter);
        pass.sendKeys(pass2);
        sleepFor(5);
        confirmpass.sendKeys(conpas2);
        System.out.println(passstrength.getText());
    }

    public void email3(String email3enter, String pass3, String conpas3){
        register.click();
        createAcc.click();
        email.sendKeys(email3enter);
        pass.sendKeys(pass3);
        sleepFor(5);
        confirmpass.sendKeys(conpas3);
        System.out.println(passstrength.getText());
        System.out.println(printwhy.getText());
    }

    public void email4(String email4enter, String pass4, String conpas4){
        register.click();
        createAcc.click();
        email.sendKeys(email4enter);
        pass.sendKeys(pass4);
        sleepFor(5);
        confirmpass.sendKeys(conpas4);
        System.out.println(passstrength.getText());
        System.out.println(printwhy.getText());
        clickwhy.click();
        System.out.println(clickwhy.getText());
    }

    public void email5(String email5enter, String pass5, String conpas5){
        register.click();
        createAcc.click();
        email.sendKeys(email5enter);
        pass.sendKeys(pass5);
        sleepFor(5);
        confirmpass.sendKeys(conpas5);
        System.out.println(passstrength.getText());
        System.out.println(printwhy.getText());
        clickwhy.click();
        System.out.println(printedwhy.getText());
        clickcreate.click();
    }







    }

