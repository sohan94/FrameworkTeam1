package testsignin;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signin.SignIn;

public class TestSignIn extends CommonAPI {

    SignIn signIn;

    @BeforeMethod
    public void initialization() {
        signIn = PageFactory.initElements(driver, SignIn.class);
    }

    @Test (enabled = false)
    public void checksign(){
        signIn.sign();
    }

    @Test (enabled = false)
    public void testchecksign(){
        signIn.checksign();
        Assert.assertEquals(signIn.checksign(),"Sign In");
    }

    @Test(enabled = true)
    public void testchecktest(){
        signIn.checksign();
        signIn.checktext();
    }

}
