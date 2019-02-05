package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.BurgerButtonPage;
import page.objects.HomePage;
import page.objects.SkipPage;

public class BurgerButtonPageTest extends BurgerButtonPage {

    HomePage objOfHomePage;
    SkipPage objOfSkipPage;
    BurgerButtonPage objOfBurgerButtonPage;

    @BeforeMethod
    public void inIt(){
        objOfHomePage = PageFactory.initElements(ad, HomePage.class);
        objOfSkipPage = PageFactory.initElements(ad, SkipPage.class);
        objOfBurgerButtonPage = PageFactory.initElements(ad, BurgerButtonPage.class);
    }

    @Test
    public void clickSkipTest(){
        objOfHomePage.clickNoThanks();
        objOfSkipPage.clickSkip();
        objOfBurgerButtonPage.clickBurgerButton();
        Assert.assertTrue(objOfBurgerButtonPage.getVerifyBurgerButton().isDisplayed());
    }
}
