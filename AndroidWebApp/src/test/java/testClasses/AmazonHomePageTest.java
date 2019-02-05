package testClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.AmazonHomePage;

public class AmazonHomePageTest extends AmazonHomePage {

    AmazonHomePage objOfAmazonHomePage;

    @BeforeMethod
    public void inIt(){
        objOfAmazonHomePage = PageFactory.initElements(ad,AmazonHomePage.class);
    }

//   @Test
//    public void searchTest(){
//      objOfAmazonHomePage.search();
//      Assert.assertTrue(objOfAmazonHomePage.getVerifySearch().isDisplayed());
//    }

//    @Test
//    public void verifySignInButtonTest(){
//        objOfAmazonHomePage.signInButtonDisplay();
//        Assert.assertTrue(objOfAmazonHomePage.verifySignIn().isDisplayed());
//    }

//    @Test
//    public void signInTest(){
//        objOfAmazonHomePage.signIn();
//        Assert.assertTrue(objOfAmazonHomePage.verifyAccount().isDisplayed());
//    }

    @Test
    public void videoTest(){
        objOfAmazonHomePage.video();
        Assert.assertTrue(objOfAmazonHomePage.getVerifyVideo().isDisplayed());
    }
}
