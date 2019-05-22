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

    @Test(enabled = false)
    public void testchecktest(){
        signIn.checksign();
        signIn.checktext();
    }

    @Test(enabled = false)
    public void testemail(){
        signIn.checksign();
        signIn.emailaddress("daljeet@gmail.com","12345");
    }

    @Test(enabled = false)
    public void test2email(){
        signIn.checksign();
        signIn.emailaddress2("sohan@gmail.com", "34567");
    }

    @Test(enabled = false)
    public void testrememberme(){
        signIn.checksign();
        signIn.clickrememberme("jannat@gmail.com", "3456789");
    }

    @Test(enabled = false)
    public void testforgot(){
        signIn.checksign();
        signIn.forgotpass("jeff@gmail.com");
    }

    @Test(enabled = false)
    public void testreset(){
        signIn.checksign();
        signIn.reset("winsen@gmail.com");
    }

    @Test(enabled = false)
    public void testprinting(){
        signIn.checksign();
        signIn.pritingpass("sahin@gmail.com");
    }

    @Test(enabled = false)
    public void testsetcostco(){
        signIn.checksign();
        signIn.setCostco();
    }
    }


