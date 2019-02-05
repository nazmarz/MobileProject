package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends ApplicationPageBase {

    @FindBy(id = "com.hcom.android:id/hp_hcom_rewards_signin")
    private WebElement signInButton;

    @FindBy(id = "com.hcom.android:id/hp_hcom_rewards_signin")
    private WebElement verifySignIn;

    public void signIn(){
        click(signInButton,"signInButton");
    }

    public WebElement getVerifySignIn () {
        return verifySignIn;
    }
}
