package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BurgerButtonPage extends ApplicationPageBase {

    @FindBy(xpath = "//android.widget.ImageButton[@index=0]")
    private WebElement burgerButton;

    @FindBy(id = "com.hcom.android:id/hp_search_button_layout")
    private WebElement verifyBurgerButton;

    public void clickBurgerButton(){
        click(burgerButton,"burgerButton");
    }

    public WebElement getVerifyBurgerButton(){
        return verifyBurgerButton;
    }
}
