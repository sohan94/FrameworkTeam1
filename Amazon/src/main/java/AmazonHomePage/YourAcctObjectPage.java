package AmazonHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAcctObjectPage extends CommonAPI {

    @FindBy (css = "i.hm-icon.nav-sprite")
    WebElement Icon;
    @FindBy (xpath = "//*[@id=\"hmenu-content\"]/ul[34]/li[40]/a")
    WebElement AcctTab;
    @FindBy (xpath = "//div[@class='ya-card-row'] /div[1]")
    WebElement Yourorders;
    @FindBy (xpath = "//div[@class='ya-card-row'] /div[2]")
    WebElement LoginSecurity;
    @FindBy (xpath = "//div[@class='ya-card-row'] /div[3]")
    WebElement Prime;
    @FindBy (xpath = "//div[@class='a-section ya-personalized']/div[3]/div[1]")
    WebElement GiftCards;
    @FindBy (xpath = "//div[@class='a-section ya-personalized']/div[3]/div[2]")
    WebElement AllthingsAlexa;
    @FindBy (xpath = "//div[@class='a-section ya-personalized']/div[3]/div[3]")
    WebElement DevicesandContent;
    @FindBy (xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[1]/span/a")
    WebElement YourAddresses;
    @FindBy (xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[2]/span/a")
    WebElement Payment;
    @FindBy (xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[3]/span/a")
    WebElement AmazonProfile;
    @FindBy (xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[4]/span/a")
    WebElement ArchivedOrders;
    @FindBy (xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[5]/span/a")
    WebElement ManageLists;
    @FindBy (xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[6]/span/a")
    WebElement DownloadReport;
    @FindBy (xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[7]/span/a")
    WebElement OneClick;
    @FindBy (xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[8]/span/a")
    WebElement AmazonFresh;
    @FindBy (xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[9]/span/a")
    WebElement LanguangePreferences;
    @FindBy (xpath = "//*[@id=\"a-page\"]/div[2]/div/div[4]/div[1]/div/div/ul/li[10]/span/a")
    WebElement Coupons;


    public void goToYourAcct()
    {
        Icon.click();
        sleepFor(2);
        AcctTab.click();
    }

    public void yourOrders()
    {
        Yourorders.click();
        System.out.println(driver.getTitle());
    }

    public void LoginSecurity()
    {
        LoginSecurity.click();
        System.out.println(driver.getTitle());
    }

    public void Prime()
    {
        Prime.click();
        System.out.println(driver.getTitle());
    }

    public void GiftCards()
    {
        GiftCards.click();
        System.out.println(driver.getTitle());
    }

    public void AllthingsAlexa()
    {
        AllthingsAlexa.click();
        System.out.println(driver.getTitle());
    }

    public void DevicesandContent()
    {
        DevicesandContent.click();
        System.out.println(driver.getTitle());
    }

    public void YourAddresses()
    {
        System.out.println(YourAddresses.getText());
        YourAddresses.click();
        sleepFor(2);
    }
    public void Payment()
    {
        System.out.println(Payment.getText());
        Payment.click();
        sleepFor(2);
    }
    public void AmazonProfile()
    {
        System.out.println(AmazonProfile.getText());
        AmazonProfile.click();
        sleepFor(2);
    }
    public void ArchivedOrder()
    {
        System.out.println(ArchivedOrders.getText());
        ArchivedOrders.click();
        sleepFor(2);
    }
    public void ManageLists()
    {
        System.out.println(ManageLists.getText());
        ManageLists.click();
        sleepFor(2);
    }
    public void DownloadReports()
    {
        System.out.println(DownloadReport.getText());
        DownloadReport.click();
        sleepFor(2);
    }
    public void OneClick()
    {
        System.out.println(OneClick.getText());
        OneClick.click();
        sleepFor(2);
    }
    public void AmazonFresh()
    {
        System.out.println(AmazonFresh.getText());
        AmazonFresh.click();
        sleepFor(2);
    }
    public void LanguagePreferences()
    {
        System.out.println(LanguangePreferences.getText());
        LanguangePreferences.click();
        sleepFor(2);
    }
    public void Coupons()
    {
        System.out.println(Coupons.getText());
        YourAddresses.click();
        sleepFor(2);
    }


}
