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


    public void sign(){
        System.out.println(signin.getText());
        signin.click();
    }

    public String checksign(){
        signin.click();
        System.out.println(checklogo.getText());
        String text = checklogo.getText();
        return text;
    }

    public void checktext(){
        System.out.println(validtext.getText());
    }


}
