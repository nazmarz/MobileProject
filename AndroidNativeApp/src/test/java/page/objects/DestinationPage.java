package page.objects;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;


public class DestinationPage extends ApplicationPageBase {

    @FindBy(id = "com.hcom.android:id/hp_text_search")
    private WebElement addressBar;

    @FindBy(id = "com.hcom.android:id/search_field")
    private WebElement addressBar2;

    @FindBy(id = "com.hcom.android:id/sqm_apply_button")
    private WebElement verifyAddress;

    public void enterAddress() {

        click(addressBar, "addressBar");
        sendKeysWithOutEnter(addressBar2,"addressBar2","Vancouver, British Columbia, Canada");
        TestLogger.log("Pressing ENTER");
        Robot robot;
        try {
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        TestLogger.log("Pressed ENTER");
    }

    public WebElement getVerifyAddress(){
        return verifyAddress;
    }
}




