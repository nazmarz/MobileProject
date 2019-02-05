package testClasses;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import pageClasses.AccountPage;
import pageClasses.VideoPage;

public class VideoPageTest extends VideoPage {
    AccountPage objOfAccountPage;

    @BeforeMethod
    public void inIt(){
        objOfAccountPage = PageFactory.initElements(ad,AccountPage.class);
    }
}
