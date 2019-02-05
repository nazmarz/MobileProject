package testClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.AccountPage;
import pageClasses.AmazonHomePage;

public class AccountPageTest extends AmazonHomePage {

    AccountPage objOfAccountPage;

    @BeforeMethod
    public void inIt(){
        objOfAccountPage = PageFactory.initElements(ad,AccountPage.class);
    }

    @Test
    public void incorrectLoginTest(){
        objOfAccountPage.incorrectLogin();
        Assert.assertTrue(objOfAccountPage.getVerifyLogin().isDisplayed());
    }
}
