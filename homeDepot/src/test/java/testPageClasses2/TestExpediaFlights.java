package testPageClasses2;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses2.ExpediaFlights;

import java.util.concurrent.TimeUnit;

public class TestExpediaFlights extends CommonAPI {
    String flightsUrl = "https://www.expedia.com/Flights";
    ExpediaFlights expediaFlightsPage;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(flightsUrl);
        expediaFlightsPage = PageFactory.initElements(driver,ExpediaFlights.class);
    }

    @AfterMethod
    public void reInit(){
        driver.get(flightsUrl);
    }

    @Test
    public void FlightsPage() throws Exception{
        expediaFlightsPage.getFlightsPage();
        driver.navigate().to(flightsUrl);
    }

    @Test
    public void FlyingFrom()throws Exception{
        expediaFlightsPage.setFlyingfrom();
    }

    @Test
    public void FlyingTo()throws Exception{
        expediaFlightsPage.setFlyingTo("Las Vegas, Nevada");
    }




    @Test
    public void imageTesting1()throws Exception{
        expediaFlightsPage.image1();
    }



    @Test
    public void tradeScrolTest()throws Exception{
        expediaFlightsPage.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        expediaFlightsPage.setTopTitleImage();
    }

    @Test
    public void testSeeflightsSearch()throws Exception{
        expediaFlightsPage.seeflightsSearch();
    }

    @Test
    public void testPaidContent()throws Exception{
        expediaFlightsPage.paidContentImage();
    }
    @Test
    public void testInspiration()throws Exception{
        expediaFlightsPage.seeInspirationforNextTrip();
    }
}
