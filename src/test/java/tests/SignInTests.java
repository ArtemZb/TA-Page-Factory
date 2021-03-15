package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SignInTests extends BaseTest {

    @Test
    public void checkForgotPasswordFormContainsEmailField(){
        getHomePage().clickOnSignInButton();
        getSignInPage().clickOnForgotPasswordButton();
        getSignInPage().waitVisibilityOfElement(getSignInPage().getForgotPasswordPopup(), 20);
        assertTrue(getSignInPage().getEmailFieldForgotPassword().isDisplayed());
    }
}
