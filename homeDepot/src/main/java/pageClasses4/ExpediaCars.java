package pageClasses4;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ExpediaCars extends CommonAPI {

    @FindBy(id = "primary-header-car")
    WebElement cars;

    @FindBy(id = "car-pickup-clp")
    WebElement pickup;

    @FindBy(id = "car-dropoff-clp")
    WebElement dropOff;

    @FindBy(id = "//*[@id=\"gcw-submit-car\"]")
    WebElement searchbutton;



    @FindBy(xpath = "//*[@id=\"top-deals-slider\"]/div/div/div[1]/div/a/div[1]/figure/img[2]")
    WebElement tredeScrolling;



    @FindBy(xpath = "//*[@id=\"top-deals-slider\"]/div/div/div[2]/div")
    WebElement testImage;

    @FindBy(xpath = "//*[@id=\"header-logo\"]/img")
    WebElement topTitleImage;


    @FindBy(xpath = "//*[@id=\"top-deals-slider\"]/div/div/div[1]/div/a/div[1]/figure/img[2]")
    WebElement imageInPaidcontent;

    @FindBy(id = "CARS-header")
    WebElement InspirationforNextTrip;

    @FindBy(xpath = "//*[@id=\"gcw-cars-form-clp\"]/div[2]")
    WebElement aleart;




    @FindBy(xpath = "//*[@id=\"car-tabs\"]/h1")
    WebElement CarsSearch;

    public void seeInspirationforNextTrip(){
        boolean bl = InspirationforNextTrip.isDisplayed();
        System.out.println("Inspiration for next trip is displayed");
        Assert.assertTrue(bl);
    }



    public void getCarsPage() {
        cars.click();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Tech Button in Cars Page");
        driver.navigate().to("https://www.expedia.com/Cars");
    }

    public void setCarPick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify aleart message in Cars Page");
        pickup.sendKeys("New York, NY");
        searchbutton.click();
        boolean al = aleart.isDisplayed();
        Assert.assertTrue(al);
        System.out.println("enter the drop off field");

    }

    public void image1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in Hotels Page");
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }

    public void setCarDropoff() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify aleart message in Cars Page");
        dropOff.sendKeys("New York, NY");
        searchbutton.click();
        boolean al = aleart.isDisplayed();
        Assert.assertTrue(al);
        System.out.println("enter the pick up field");

    }

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify hotels deal in Cars Page");
        boolean selected = tredeScrolling.isDisplayed();
        Assert.assertTrue(selected);
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in Cars Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
    }

    public void seeCarsSearch() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify cars search in Cars Page");
//
        String str = CarsSearch.getText();
        System.out.println(str);
        Assert.assertEquals(str, "Search Rental Car Deals");
    }

    public void paidContentImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Content IMAGE in Cars Page");
        boolean paidContent = imageInPaidcontent.isDisplayed();
        Assert.assertTrue(paidContent);
    }

}
