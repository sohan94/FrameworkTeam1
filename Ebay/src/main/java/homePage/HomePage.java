package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(linkText = "Accessibility")
    public static WebElement accessibility;
    @FindBy(linkText = "User Agreement")
    public static WebElement userAgreement;
    @FindBy(linkText = "Privacy")
    public static WebElement privacy;
    @FindBy(linkText = "Cookies")
    public static WebElement cookies;
    @FindBy(id = "gf-AdChoice")
    public static WebElement adChoice;

}
