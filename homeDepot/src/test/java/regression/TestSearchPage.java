package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.SearchPage;

import java.util.concurrent.TimeUnit;

public class TestSearchPage extends SearchPage {
    SearchPage searchPage;

    @BeforeMethod
    public void initializePageObjects() {

        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    //test homepage landing
    @Test
    public void verifyhomePagelanding1() {
        searchPage.displayPageLogo();

    }

    public void verifyhomePagelanding2() {
        searchPage.displayPageFooter();
    }


    //set origin and departure, roundtrip
    @Test
    public void RoundTripTest() {
        searchPage.clickFlightTab();
        searchPage.clickRoundTrip();
        searchPage.setOriginCity("New York (NYC-All Airports)");
        searchPage.setDestinationCity("Chicago, IL (ORD-O'Hare Intl.)");
        searchPage.setDepartureDate("05/21/2019");
        searchPage.setReturnDate("06/21/2019");
        searchPage.clickSearchButton();
    }

    //set origin and departure, roundtrip, advanced options
    @Test
    public void RoundTripTest2() {
        searchPage.clickFlightTab();
        searchPage.clickRoundTrip();
        searchPage.setOriginCity("New York (NYC-All Airports)");
        searchPage.setDestinationCity("Chicago, IL (ORD-O'Hare Intl.)");
        searchPage.setDepartureDate("05/21/2019");
        searchPage.setReturnDate("06/21/2019");
        searchPage.clickAdvancedOption();
        searchPage.clickNonstop();
        searchPage.clickRefundable();
        searchPage.clickSearchButton();
    }

    //set origin and departure, roundtrip with Preferred Class and airline
    @Test
    public void RoundTripTest3() {
        searchPage.clickFlightTab();
        searchPage.clickRoundTrip();
        searchPage.setOriginCity("New York (NYC-All Airports)");
        searchPage.setDestinationCity("Chicago, IL (ORD-O'Hare Intl.)");
        searchPage.setDepartureDate("05/21/2019");
        searchPage.setReturnDate("06/21/2019");
        try {
            searchPage.clickadvancedPreferredAirline();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            searchPage.clickadvancedPreferredClass();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchPage.clickSearchButton();
    }

    //set origin and departure, roundtrip with Preferred Class, airline and hotel
    @Test
    public void RoundTripTest4() throws InterruptedException {
        searchPage.clickFlightTab();
        searchPage.clickRoundTrip();
        searchPage.setOriginCity("New York (NYC-All Airports)");
        searchPage.setDestinationCity("Chicago, IL (ORD-O'Hare Intl.)");
        searchPage.setDepartureDate("05/21/2019");
        searchPage.setReturnDate("06/21/2019");
        searchPage.clickAdvancedOption();
        searchPage.clickNonstop();
        searchPage.clickRefundable();
        searchPage.clickadvancedPreferredAirline();
        searchPage.clickadvancedPreferredClass();
        searchPage.addahotel();
        searchPage.hotelcheckin("05/21/2019");
        searchPage.hotelcheckout("06/21/2019");
        searchPage.clickSearchButton();
    }


    //One way Trip, origin and departure
    @Test
    public void OneWayTripTest() {
        searchPage.clickFlightTab();
        searchPage.clickOneWayTab();
        searchPage.setOriginCity("New York (NYC-All Airports)");
        searchPage.setDestinationCity("Chicago, IL (ORD-O'Hare Intl.)");
        searchPage.setDepartureDate("05/21/2019");

        searchPage.clickSearchButton();

    }

    //One way Trip, origin and departure, with advanced options
    @Test
    public void OneWayTripTest2() throws InterruptedException {
        searchPage.clickFlightTab();
        searchPage.clickOneWayTab();
        searchPage.setOriginCity("New York (NYC-All Airports)");
        searchPage.setDestinationCity("Chicago, IL (ORD-O'Hare Intl.)");
        searchPage.setDepartureDate("05/21/2019");

        searchPage.clickAdvancedOption();
        searchPage.clickNonstop();
        searchPage.clickRefundable();
        searchPage.clickSearchButton();
    }

    //One way Trip, origin and departure, with advanced options, preferred class and airline
    @Test
    public void OneWayTripTest3() throws InterruptedException {
        searchPage.clickFlightTab();
        searchPage.clickOneWayTab();
        searchPage.setOriginCity("New York (NYC-All Airports)");
        searchPage.setDestinationCity("Chicago, IL (ORD-O'Hare Intl.)");
        searchPage.setDepartureDate("05/21/2019");

        searchPage.clickAdvancedOption();
        searchPage.clickNonstop();
        searchPage.clickRefundable();
        searchPage.clickadvancedPreferredAirline();
        searchPage.clickadvancedPreferredClass();
        searchPage.clickSearchButton();
    }

    //MultiCity Trip, origin and departure, flying from ...flying to,
    @Test
    public void MultiCityTripTest() {
        searchPage.clickFlightTab();
        searchPage.clickMulticity();
        searchPage.setOriginCity("New York (NYC-All Airports)");
        searchPage.setDestinationCity("Chicago, IL (ORD-O'Hare Intl.)");
        searchPage.setDepartureDate("05/21/2019");

        searchPage.setFlyingfrom("Los Angeles, CA (LAX-Los Angeles Intl.)");
        searchPage.setFlyingTo("Cancun, Quintana Roo, Mexico (CUN-Cancun Intl.)");
        searchPage.setDeparting("06/21/2019");

        searchPage.clickSearchButton();
    }
    //MultiCity Trip, origin and departure , flying from ...flying to, with advanced settings

    @Test
    public void MultiCityTripTest2() {
        searchPage.clickFlightTab();
        searchPage.clickMulticity();
        searchPage.setOriginCity("New York (NYC-All Airports)");
        searchPage.setDestinationCity("Chicago, IL (ORD-O'Hare Intl.)");
        searchPage.setDepartureDate("05/21/2019");

        searchPage.setFlyingfrom("Los Angeles, CA (LAX-Los Angeles Intl.)");
        searchPage.setFlyingTo("Cancun, Quintana Roo, Mexico (CUN-Cancun Intl.)");
        searchPage.setDeparting("06/21/2019");

        searchPage.clickAdvancedOption();
        searchPage.clickNonstop();
        searchPage.clickRefundable();

        searchPage.clickSearchButton();
    }

    //MultiCity Trip, origin and departure , with advanced settings, with advanced settings ,with preferred airline and class
    @Test
    public void MultiCityTripTest3() throws InterruptedException {
        searchPage.clickFlightTab();
        searchPage.clickMulticity();
        searchPage.setOriginCity("New York (NYC-All Airports)");
        searchPage.setDestinationCity("Chicago, IL (ORD-O'Hare Intl.)");
        searchPage.setDepartureDate("05/21/2019");

        searchPage.setFlyingfrom("Los Angeles, CA (LAX-Los Angeles Intl.)");
        searchPage.setFlyingTo("Cancun, Quintana Roo, Mexico (CUN-Cancun Intl.)");
        searchPage.setDeparting("06/21/2019");

        searchPage.clickAdvancedOption();
        searchPage.clickNonstop();
        searchPage.clickRefundable();

        searchPage.clickadvancedPreferredAirline();
        searchPage.clickadvancedPreferredClass();
        searchPage.clickSearchButton();
    }

    //sign up for new account
    @Test
    public void SignUpTest() {
        searchPage.clickAccount();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchPage.clickCreatanAccount();
        searchPage.setFirstName("Sarah");
        searchPage.setLastName("Marium");
        searchPage.setEmailAddress("smarium@gmail.com");
        searchPage.setPassword("jajavaag");
        searchPage.setSignUp();
    }

    //signin in my account
    @Test
    public void SignInTest() {
        searchPage.clickAccount();
        searchPage.clickSignin();
        searchPage.setEmailAddress("smarium@gmail.com");
        searchPage.setPassword("jajavaag");
        searchPage.clickSigninSubmit();
    }

    @Test
    public void Test() {
        searchPage.returnBali();

    }

    // hotels , without selecting traveler(using default setup)
    @Test
    public void hotelsTest() {
        searchPage.clickhotels();
        searchPage.setHotelsDestination("New York, NY");
        searchPage.setHotelsCheckIn("06/21/2019");
        searchPage.setHotelsCheckOut("06/26/2019");
        searchPage.clickSearchButton();
    }

    //hotels, with selecting traveler

    @Test
    public void hotelsTest2() {
        searchPage.clickhotels();
        searchPage.setHotelsDestination("New York, NY");
        searchPage.setHotelsCheckIn("06/21/2019");
        searchPage.setHotelsCheckOut("06/26/2019");
        searchPage.clickTravelers();
        searchPage.clickSearchButton();
    }


}
