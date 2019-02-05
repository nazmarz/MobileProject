package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.DestinationPage;
import page.objects.HomePage;
import page.objects.SkipPage;

import static base.MobileAPI.ad;


public class DestinationPageTest extends DestinationPage {
    HomePage objOfHomePage;
    SkipPage objOfSkipPage;
    DestinationPage objOfDestinationPage;

    @BeforeMethod
    public void inIt(){
        objOfHomePage = PageFactory.initElements(ad, HomePage.class);
        objOfSkipPage = PageFactory.initElements(ad, SkipPage.class);
        objOfDestinationPage = PageFactory.initElements(ad, DestinationPage.class);
    }

    @Test
    public void clickSkipTest() {
        objOfHomePage.clickNoThanks();
        objOfSkipPage.clickSkip();
        objOfDestinationPage.enterAddress();
        Assert.assertTrue(objOfDestinationPage.getVerifyAddress().isDisplayed());
    }
}
