package testSignIn;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signIn.SignInProcess;

public class TestSignInProcess extends SignInProcess {

    SignInProcess sign;

    @BeforeMethod
    public void initialization() {
        sign = PageFactory.initElements(driver, SignInProcess.class);
    }

    @Test(enabled = false)
    public void checkValidSignIn() {
        String success = sign.validSignIn("user11", "pass11");
        Assert.assertEquals(success, "https://www.ebay.com/");
        System.out.println("Sign in with valid credential passed");
    }

    @Test(enabled = false)
    public void checkInValidSignIn() {
        Assert.assertEquals(sign.invalidSignIn("user111", "pass111"), "Oops, that's not a match.");
        System.out.println("Invalid sign in passed");
    }

    // validating create account button on sign in page

    @Test(enabled = false)
    public void checkCreateAccout() {
        Assert.assertEquals(sign.createAccount(), "Create an account");
        System.out.println("Create account button is valid");
    }


    @Test(enabled = false)
    public void checkFB() {
        Assert.assertEquals(sign.signInFB(), true);
        System.out.println("Facebook signin button is working");
    }

    @Test(enabled = false) //5
    public void checkGGL() {
        Assert.assertEquals(sign.signInGoogle(), "Sign in with Google");
        System.out.println("Google button works fine");
    }

    @Test(enabled = false)
    public void tempPass() {
        Assert.assertEquals(sign.tempPasswordPassed("user11@email.com"), "Password");
        System.out.println("Temporary password working fine");
    }

    @Test(enabled = false)
    public void tempPassFail() {
        Assert.assertEquals(sign.tempPasswordFailed("user11@email.com"), "That's not a match. Please try again.");
        System.out.println("Temporary password with wrong email failed");
    }

    @Test(enabled = false)
    public void testStayBox(){
        Assert.assertEquals(sign.staySigned(),true);
        System.out.println("Stay signed in button is selected");
    }

    @Test(enabled = true)
    public void resetPass(){
        Assert.assertEquals(sign.resetPasswordValid("jannatsaikat@gmail.com"),"Email");
        System.out.println("Resetting password is successfull");
    }

    @Test(enabled = false) //10
    public void resetPassFail(){
        Assert.assertEquals(sign.resetPasswordInvalid("user111@gmail.com"), "Oops, that's not a match. Try again?");
        System.out.println("Resetting password Failed");
    }

    @Test(enabled = false)
    public void greetShow(){
        Assert.assertEquals(sign.greet(),true);
        System.out.println("The greetings is displayed");
    }


}
