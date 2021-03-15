package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href, 'forgot')]")
    private WebElement forgotPasswordButton;

    @FindBy(id = "js_forgotPassword")
    private WebElement forgotPasswordPopup;

    @FindBy(xpath = "//form[contains(@action, 'forgot')]//input[@name='login']")
    private WebElement emailFieldForgotPassword;

    public SignInPage(WebDriver driver){
        super(driver);
    }

    public void clickOnForgotPasswordButton(){
        forgotPasswordButton.click();
    }

    public WebElement getForgotPasswordPopup(){
        return forgotPasswordPopup;
    }

    public WebElement getEmailFieldForgotPassword(){
        return  emailFieldForgotPassword;
    }
}
