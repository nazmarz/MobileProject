package application.page.base;

import ExtentReport.TestLogger;
import base.MobileAPI;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationPageBase extends MobileAPI {

    TouchAction act = new TouchAction(ad);

    //return status of link if it is enabled
    public static boolean isEnableStatus(WebDriver ad, WebElement web) {
        boolean en = web.isEnabled();
        return en;
    }
    public static void sendKeys(WebElement webElement, String webElementName, String keys){
        webElement.clear();
        TestLogger.log("Sending " + keys + " to " + webElementName);
        webElement.sendKeys(keys, Keys.ENTER);
        TestLogger.log("Keys Sent to " + webElementName);
    }

    public static String getText(WebElement webElement, String webElementName){

        TestLogger.log("Getting Text from " + webElementName);
        String actualText =  webElement.getText();
        TestLogger.log("Actual text: " + actualText);
        return actualText;

    }
    public static void click(WebElement webElement, String webElementName){
        TestLogger.log("Click " + webElementName );
        webElement.click();
        TestLogger.log("Clicked " + webElementName);
    }

    public WebElement testLog(WebElement verifyWebelement){
        TestLogger.log("verifying Test passed ");
        WebElement webelement = verifyWebelement;
        TestLogger.log("Verified Test passed" );
        return webelement;
    }

    public static void scroll(String nameOfEleement){
        TestLogger.log("Scrolling to " + nameOfEleement);
        ad.scrollTo(nameOfEleement).click();
        TestLogger.log("Scrolled and Clicked "+nameOfEleement);
    }


}
