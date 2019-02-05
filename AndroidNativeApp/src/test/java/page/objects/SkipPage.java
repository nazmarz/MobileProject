package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SkipPage extends ApplicationPageBase {

    @FindBy(id = "com.hcom.android:id/skip_button")
    private WebElement skipButton;

    @FindBy(id = "com.hcom.android:id/hp_text_search")
    private WebElement verifySkip;

    public void clickSkip(){
            click(skipButton,"skipButton");
        }

        public WebElement getVerifySkip(){
            return verifySkip;
        }
    }




