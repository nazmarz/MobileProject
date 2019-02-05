package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class HomePageTest extends HomePage {

    HomePage objOfHomePage;

    @BeforeMethod
    public void inIt(){
        objOfHomePage = PageFactory.initElements(ad, HomePage.class);
    }

    @Test
    public void clickNoThanksTest(){
        objOfHomePage.clickNoThanks();
        Assert.assertTrue(objOfHomePage.getVerifyNoThanks().isDisplayed());
    }
}
