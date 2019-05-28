package AmazonTestHomePage;

import AmazonHomePage.YourAcctObjectPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YourAcctObjectPageTest extends CommonAPI {

    YourAcctObjectPage Acct;

    @BeforeMethod
    public void initMethod()
    {
        Acct = PageFactory.initElements(driver,YourAcctObjectPage.class);
    }

    @Test (enabled = false)
    public void yourOrdersTest()
    {
        Acct.goToYourAcct();
        sleepFor(2);
        Acct.yourOrders();
    }
    @Test (enabled = false)
    public void LoginSecurityTest()
    {
        Acct.goToYourAcct();
        sleepFor(2);
        Acct.LoginSecurity();
    }
    @Test (enabled = false)
    public void PrimeTest()
    {
        Acct.goToYourAcct();
        sleepFor(2);
        Acct.Prime();
    }
    @Test (enabled = false)
    public void GiftCardsTest()
    {
        Acct.goToYourAcct();
        sleepFor(2);
        Acct.GiftCards();
    }
    @Test (enabled = false)
    public void AllthingsAlexaTest()
    {
        Acct.goToYourAcct();
        sleepFor(2);
        Acct.AllthingsAlexa();
    }
    @Test (enabled = false)
    public void DevicesandContentTest()
    {
        Acct.goToYourAcct();
        sleepFor(2);
        Acct.DevicesandContent();
    }
    @Test (enabled = false)
    public void yourAddressesTest()
    {
        Acct.goToYourAcct();
        Acct.YourAddresses();
    }
    @Test (enabled = false)
    public void PaymentTest()
    {
        Acct.goToYourAcct();
        Acct.Payment();
    }
    @Test
    public void AmazonProfileTest()
    {
        Acct.goToYourAcct();
        Acct.AmazonProfile();
    }
    @Test (enabled = false)
    public void ArchivedOrdersTest()
    {
        Acct.goToYourAcct();
        Acct.ArchivedOrder();
    }
    @Test (enabled = false)
    public void ManageListsTest()
    {
        Acct.goToYourAcct();
        Acct.ManageLists();
    }
    @Test (enabled = false)
    public void DownloadReportsTest()
    {
        Acct.goToYourAcct();
        Acct.DownloadReports();
    }
    @Test (enabled = false)
    public void OneClickTest()
    {
        Acct.goToYourAcct();
        Acct.OneClick();
    }
    @Test (enabled = false)
    public void AmazonFreshTest()
    {
        Acct.goToYourAcct();
        Acct.AmazonFresh();
    }
    @Test (enabled = false)
    public void LanguagePreferenceTest()
    {
        Acct.goToYourAcct();
        Acct.LanguagePreferences();
    }
    @Test (enabled = false)
    public void CouponsTest()
    {
        Acct.goToYourAcct();
        Acct.Coupons();
    }
}
