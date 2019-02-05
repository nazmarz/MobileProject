package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.BurgerButtonPage;
import page.objects.HomePage;
import page.objects.SignInPage;
import page.objects.SkipPage;

public class SignInPageTest extends SignInPage {

    HomePage objOfHomePage;
    SkipPage objOfSkipPage;
    SignInPage objOfSignInPage;


    @BeforeMethod
    public void inIt(){
        objOfHomePage = PageFactory.initElements(ad, HomePage.class);
        objOfSkipPage = PageFactory.initElements(ad, SkipPage.class);
        objOfSignInPage = PageFactory.initElements(ad, SignInPage.class);
    }

    @Test
    public void clickSkipTest(){
        objOfHomePage.clickNoThanks();
        objOfSkipPage.clickSkip();
        objOfSignInPage.signIn();
        Assert.assertTrue(objOfSignInPage.getVerifySignIn().isDisplayed());
    }
}
