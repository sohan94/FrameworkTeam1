package testSignIn;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signIn.SignInProcess;

public class TestSignInProcess extends SignInProcess {

    SignInProcess s;

    @BeforeMethod
    public void initialization()
    {
        s = PageFactory.initElements(driver,SignInProcess.class);
    }

    @Test
    public void signInValidUser(){

        s.signIn();
    }
}
