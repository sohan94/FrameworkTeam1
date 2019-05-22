package pageClasses;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonAPI {


    @FindBy(id = "header-history-sm")
    WebElement headerHistory;

    @FindBy(id = "tab-flight-tab-flp")
    WebElement flightTab;

    @FindBy(id="flight-origin-flp")
    WebElement originCity;

    @FindBy(id="flight-destination-flp")
    WebElement destinationCity;

    @FindBy(id="flight-departing-flp")
    WebElement departureDate;

    @FindBy(id = "flight-returning-flp")
    WebElement returnDate;

    @FindBy(id= "flight-type-roundtrip-label-hp-flight")
    WebElement roundTrip;

    @FindBy(id = "flight-type-multi-dest-label-flp")
    WebElement multiCity;

    @FindBy(className = "btn-primary btn-action gcw-submit")
    WebElement searchButton;


    public void clickRoundTrip(){
        roundTrip.click();
    }
    public void clickMulticity(){
        multiCity.click();
    }
    public void clickSearchButton(){
        searchButton.click();
    }



    public void clickFlightTab(){
        headerHistory.click();
        flightTab.click();
    }
    public void setOriginCity(String origin){
        originCity.sendKeys(origin);
    }
    public void setDestinationCity(String destination){
        originCity.sendKeys(destination);
    }
    public void setDepartureDate(String date){
        departureDate.sendKeys(date);
    }
    public void setReturnDate(String date){
        returnDate.sendKeys(date);
    }
}
