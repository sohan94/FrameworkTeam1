package testcart;

import base.CommonAPI;
import cart.Cart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCart extends CommonAPI {
    Cart cart;

    @BeforeMethod
    public void initialization() {
        cart = PageFactory.initElements(driver, Cart.class);
    }

    @Test(enabled = true)
    public void testcart(){
        cart.cart();
    }
}
