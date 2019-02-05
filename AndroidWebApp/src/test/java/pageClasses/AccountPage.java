package pageClasses;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage extends ApplicationPageBase {
    @FindBy(id = "ap_email_login")
    private WebElement emailBox;

    @FindBy(id = "ap_password")
    private WebElement passwordBox;

    @FindBy(id = "signInSubmit")
    private WebElement submitButton;

    @FindBy(xpath = "//android.view.View[@text='Your password is incorrect']")
    private WebElement verifyLogin;

    public void incorrectLogin(){
        tapOn(ad,"emailBox");
        sendKeys(emailBox,"emailBox","naz913@hotmail.com");
        sendKeys(passwordBox,"passwordBox","12345");
        click(submitButton,"submitButton");
    }

    public WebElement getVerifyLogin(){
        return verifyLogin;
    }


}
