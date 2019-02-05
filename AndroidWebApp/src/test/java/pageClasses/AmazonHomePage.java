package pageClasses;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends ApplicationPageBase {

    @FindBy(id = "nav-search-keywords")
    private WebElement searchBox;

    @FindBy(id = "nav-logobar-greeting")
    private WebElement signInButton;

    @FindBy(id = "nav-search-keywords")
    private WebElement verifySearch;

    @FindBy(id = "register_accordion_header")
    private WebElement verifysignInButton;

    @FindBy(id = "deals")
    private WebElement video;

    @FindBy(xpath = "//android.view.View[@text='Prime Video']")
    private WebElement verifyVideo;

//    @FindBy(xpath = "//android.view.View[@text='rice cooker']")
//    private WebElement verifySearch;

    public void search() {
        sendKeys(searchBox, "searchBox", "rice cooker");
    }

    public WebElement getVerifySearch() {
        return verifySearch;
    }

    public boolean signInButtonDisplay() {
        TestLogger.log("Looking for Show Password Check Box");
        boolean result = signInButton.isDisplayed();
        return result;
    }

    public WebElement verifySignIn() {
        return signInButton;
    }

    public void signIn(){
        click(signInButton,"signInButton");
    }

    public WebElement verifyAccount(){
        return verifysignInButton;
    }

    public void video(){

        click(video, "video");
    }

    public WebElement getVerifyVideo(){
        return verifyVideo;
    }


}