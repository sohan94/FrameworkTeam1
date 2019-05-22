package testcreateaccount;

import base.CommonAPI;
import createaccount.CreateAccount;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCreateAccount extends CommonAPI {
    CreateAccount createAccount;

    @BeforeMethod
    public void initialization() {
        createAccount = PageFactory.initElements(driver, CreateAccount.class);
    }

    @Test(enabled = false)
    public void testregisterAcc(){
        createAccount.registerAccount();
    }

    @Test(enabled = false)
    public void testemail1(){
        createAccount.email1("daljeet@gmail.com","daljeet1234","daljeet1234");
    }

    @Test(enabled = false)
    public void testemail2(){
        createAccount.email2("sohan@gmail.com","sohan12345","sohan12345");
    }

    @Test(enabled = false)
    public void testemail3(){
        createAccount.email3("jannat@gmail.com","jannat12345","jannat12345");
    }

    @Test(enabled = false)
    public void testemail4(){
        createAccount.email4("jeff@gmail.com","jeff12345","jeff12345");
    }

    @Test(enabled = false)
    public void testemail5(){
        createAccount.email5("winsen@gmail.com","winsen12345","winsen12345");
    }




}
