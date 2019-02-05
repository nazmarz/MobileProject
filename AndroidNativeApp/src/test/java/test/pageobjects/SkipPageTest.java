package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.SkipPage;

public class SkipPageTest extends SkipPage {
    HomePage objOfHomePage;
    SkipPage objOfSkipPage;

    @BeforeMethod
    public void inIt(){
        objOfHomePage = PageFactory.initElements(ad, HomePage.class);
        objOfSkipPage = PageFactory.initElements(ad, SkipPage.class);
    }

    @Test
    public void clickSkipTest(){
        objOfHomePage.clickNoThanks();
        objOfSkipPage.clickSkip();
        Assert.assertTrue(objOfSkipPage.getVerifySkip().isDisplayed());
    }
}


