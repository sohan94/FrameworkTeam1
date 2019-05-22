package testPageClasses4;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses3.ExpediaHotels;
import pageClasses4.ExpediaCars;

import java.util.concurrent.TimeUnit;

public class testExpediaCars extends CommonAPI {
    String carsUrl = "https://www.expedia.com/Cars";
    ExpediaCars expediaCarsPage;

    @BeforeClass
    public void initialized() throws Exception{
        driver.get(carsUrl);
        expediaCarsPage = PageFactory.initElements(driver,ExpediaCars.class);
    }

    @AfterMethod
    public void reInit(){
        driver.get(carsUrl);
    }

    @Test
    public void CarsPage() throws Exception{
        expediaCarsPage.getCarsPage();
        driver.navigate().to(carsUrl);
    }

    @Test
    public void carspickup()throws Exception{
        expediaCarsPage.setCarPick();
    }

    @Test
    public void carsdropOff()throws Exception{
        expediaCarsPage.setCarDropoff();
    }




    @Test
    public void imageTesting1()throws Exception{
        expediaCarsPage.image1();
    }



    @Test
    public void tradeScrolTest()throws Exception{
        expediaCarsPage.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        expediaCarsPage.setTopTitleImage();
    }

    @Test
    public void testSeeCarsSearch()throws Exception{
        expediaCarsPage.seeCarsSearch();
    }

    @Test
    public void testPaidContent()throws Exception{
        expediaCarsPage.paidContentImage();
    }
    @Test
    public void testInspiration()throws Exception{
        expediaCarsPage.seeInspirationforNextTrip();
    }
}
