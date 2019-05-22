package testPageClasses3;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses2.ExpediaFlights;
import pageClasses3.ExpediaHotels;

import java.util.concurrent.TimeUnit;

public class testExpediaHotels extends ExpediaHotels {
    String hotelsUrl = "https://www.expedia.com/Hotels";
    ExpediaHotels expediaHotelsPage;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(hotelsUrl);
        expediaHotelsPage = PageFactory.initElements(driver,ExpediaHotels.class);
    }

    @AfterMethod
    public void reInit(){
        driver.get(hotelsUrl);
    }

    @Test
    public void HotelsPage() throws Exception{
        expediaHotelsPage.getHotelsPage();
        driver.navigate().to(hotelsUrl);
    }

    @Test
    public void hotelDestination()throws Exception{
        expediaHotelsPage.setHotelDestination();
    }

    @Test
    public void sethotelCheckin()throws Exception{
        expediaHotelsPage.setHotelCheckin("06/21/2019");
    }




    @Test
    public void imageTesting1()throws Exception{
        expediaHotelsPage.image1();
    }



    @Test
    public void tradeScrolTest()throws Exception{
        expediaHotelsPage.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        expediaHotelsPage.setTopTitleImage();
    }

    @Test
    public void testSeehotelsSearch()throws Exception{
        expediaHotelsPage.seehotelsSearch();
    }

    @Test
    public void testPaidContent()throws Exception{
        expediaHotelsPage.paidContentImage();
    }
    @Test
    public void testInspiration()throws Exception{
        expediaHotelsPage.seeInspirationforNextTrip();
    }
}
