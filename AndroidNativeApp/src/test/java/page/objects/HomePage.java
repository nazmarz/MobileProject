package page.objects;

import application.page.base.ApplicationPageBase;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ApplicationPageBase {

    @FindBy(id = "com.hcom.android:id/skip_button")
    private WebElement noThanksButton;

    @FindBy(id = "com.hcom.android:id/skip_button")
    private WebElement verifyNoThanks;

    public void clickNoThanks(){
        click(noThanksButton,"noThanksButton");
    }

    public WebElement getVerifyNoThanks(){
        return verifyNoThanks;
    }
}
