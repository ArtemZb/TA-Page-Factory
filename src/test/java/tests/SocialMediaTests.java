package tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class SocialMediaTests extends BaseTest {

    private final String INSTAGRAM_URL = "https://www.instagram.com/avicshop/";

    @Test
    public void checkInstagramPageOpenedInNewTab(){
        getHomePage().clickOnInstagramButton();
        getHomePage().waitNumberOfWindowsToBeDisplayed(2,20);
        getHomePage().getBrowserWindows();
        getHomePage().switchToWindow(1);
        assertEquals(getHomePage().getCurrentWindowURL(),INSTAGRAM_URL);
    }
}
