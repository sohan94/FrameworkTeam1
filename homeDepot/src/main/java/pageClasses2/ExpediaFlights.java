package pageClasses2;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ExpediaFlights extends CommonAPI {



    @FindBy(id = "primary-header-flight")
    WebElement flights;

    @FindBy(id = "flight-origin-flp")
    WebElement flyingfrom;

    @FindBy(id = "flight-destination-flp")
    WebElement flyingTo;

    @FindBy(id = "//*[@id=\"gcw-flights-form-flp\"]/div[8]/label/button")
    WebElement searchbutton;



    @FindBy(xpath = "//*[@id=\"aoa-container\"]/div[1]/div/div[2]")
    WebElement tredeScrolling;



    @FindBy(xpath = "//*[@id=\"top-deals-slider\"]/div/div/div[3]/div/a/div[1]/figure/img[2]")
    WebElement testImage;

    @FindBy(xpath = "//*[@id=\"header-logo\"]/img")
    WebElement topTitleImage;


    @FindBy(xpath = "//*[@id=\"native-FLIGHTS-NT1\"]/div[2]/a")
    WebElement imageInPaidcontent;

    @FindBy(id = "FLIGHTS-header")
    WebElement InspirationforNextTrip;

    @FindBy(xpath = "//*[@id=\"gcw-flights-form-flp\"]/div[2]")
    WebElement aleart;

    @FindBy(xpath = "//*[@id=\"flight-tabs\"]/h1")
    WebElement flightsSearch;

    public void seeInspirationforNextTrip(){
        boolean bl = InspirationforNextTrip.isDisplayed();
        System.out.println("Inspiration for next trip is displayed");
    }



    public void getFlightsPage() {
        flights.click();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Tech Button in Flights Page");
        driver.navigate().to("https://www.expedia.com/Flights");
    }

    public void setFlyingfrom() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify aleart message in Flights Page");
        flyingfrom.sendKeys("New York, NY");
        searchbutton.click();

        boolean al = aleart.isDisplayed();
        System.out.println("aleart is displayed");

    }

    public void image1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in Flights Page");
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }

    public void setFlyingTo(String locator) throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Search for"+locator);
        flyingTo.sendKeys(locator, Keys.ENTER);
        Thread.sleep(2000);
    }

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify flights deal in Flights Page");
        boolean selected = tredeScrolling.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in Flights Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
    }

    public void seeflightsSearch() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify flights search in Flights Page");
//
        String str = flightsSearch.getText();
        System.out.println(str);
        Assert.assertEquals(str, "Search Flights");
    }

    public void paidContentImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Content IMAGE in Flights Page");
        boolean paidContent = imageInPaidcontent.isDisplayed();
        Assert.assertTrue(paidContent);
    }
}
