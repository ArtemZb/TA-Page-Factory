package tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class ViewContactsInformationTests extends BaseTest {
    private final String WEB_ELEMENT_ATTRIBUTE_TYPE_CLASS = "class";


    @Test
    public void checkContactsBoxIsDisplayed(){
        getHomePage().openContactsBoxPopover(getDriver());
        getHomePage().implicitWait(5);
        assertTrue(getHomePage().getContactsBoxPopover().getAttribute(WEB_ELEMENT_ATTRIBUTE_TYPE_CLASS).contains("visible"));
    }
}
