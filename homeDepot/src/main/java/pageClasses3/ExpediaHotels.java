package pageClasses3;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ExpediaHotels extends CommonAPI {

    @FindBy(id = "primary-header-hotel")
    WebElement hotels;

    @FindBy(id = "hotel-destination-hlp")
    WebElement hotelDestination;

    @FindBy(id = "hotel-checkin-hlp")
    WebElement hotelCheckin;

    @FindBy(id = "//*[@id=\"gcw-hotel-form-hlp\"]/div[10]/label/button")
    WebElement searchbutton;



    @FindBy(xpath = "//*[@id=\"top-deals-slider\"]/div/div/div[1]/div/a/div[1]/figure/img[2]")
    WebElement tredeScrolling;



    @FindBy(xpath = "//*[@id=\"native-HOTELS-NT1\"]/div[2]/a")
    WebElement testImage;

    @FindBy(xpath = "//*[@id=\"header-logo\"]/img")
    WebElement topTitleImage;


    @FindBy(xpath = "//*[@id=\"top-deals-slider\"]/div/div/div[2]/div")
    WebElement imageInPaidcontent;

    @FindBy(id = "HOTELS-header")
    WebElement InspirationforNextTrip;

    @FindBy(xpath = "//*[@id=\"gcw-hotel-form-hlp\"]/div[2]")
    WebElement aleart;

    @FindBy(xpath = "//*[@id=\"hotel-tabs\"]/h1")
    WebElement hotelsSearch;

    public void seeInspirationforNextTrip(){
        boolean bl = InspirationforNextTrip.isDisplayed();
        System.out.println("Inspiration for next trip is displayed");
        Assert.assertTrue(bl);
    }



    public void getHotelsPage() {
        hotels.click();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Tech Button in Hotels Page");
        driver.navigate().to("https://www.expedia.com/Hotels");
    }

    public void setHotelDestination() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify aleart message in Hotels Page");
        hotelDestination.sendKeys("New York, NY");
        searchbutton.click();
        String ActualURL = driver.getCurrentUrl();

        String ExpectedURL="https://www.expedia.com/Hotel-Search?adults=2&destination=New%20York%2C%20New%20York&endDate=2019-05-23&latLong=40.75668%2C-73.98647&regionId=178293&rooms=1&startDate=2019-05-22";

        Assert.assertEquals(ActualURL,ExpectedURL);
        driver.navigate().back();

    }

    public void image1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in Hotels Page");
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }

    public void setHotelCheckin(String locator) throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Search for"+locator);
        hotelCheckin.sendKeys(locator, Keys.ENTER);
        aleart.isDisplayed();
        Thread.sleep(2000);
    }

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify hotels deal in Hotels Page");
        boolean selected = tredeScrolling.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in Hotels Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
    }

    public void seehotelsSearch() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify hotels search in Hotels Page");
//
        String str = hotelsSearch.getText();
        System.out.println(str);
        Assert.assertEquals(str, "Search Hotels");
    }

    public void paidContentImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Content IMAGE in Flights Page");
        boolean paidContent = imageInPaidcontent.isDisplayed();
        Assert.assertTrue(paidContent);
    }
}
