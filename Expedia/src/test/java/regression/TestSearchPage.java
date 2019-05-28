package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.SearchPage;

public class TestSearchPage extends SearchPage {

    SearchPage searchPage;

    @BeforeMethod
    public void initializePageObjects() {

        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @Test
    public void test(){
        searchPage.clickFlightTab();
        searchPage.setOriginCity("New York");
        searchPage.setDestinationCity("Chicago");
        searchPage.setDepartureDate("05/21/2019");
        searchPage.setReturnDate("06/21/2019");
        searchPage.clickSearchButton();
    }


}
