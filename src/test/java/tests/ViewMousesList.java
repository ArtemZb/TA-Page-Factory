package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ViewMousesList extends BaseTest {

    private final String SORT_ORDER_PRICEASCENDING = "priceasc";

    @Test
    public void checkItemsAreSortedInAscendingOrder() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnComputersButton();
        getComputersPage().clickOnMousesButton();
        getMousesPage().waitForPageLoadComplete(30);
        getMousesPage().clickOnSortMousesInProvidedOrder(SORT_ORDER_PRICEASCENDING);
        getMousesPage().waitForPageLoadComplete(30);
        for (int i = 0; i < getMousesPage().getListOfProductItems().size()-1; i++){
            String currentItemPrice = getMousesPage().getListOfProductItems().get(i).getText();
            String nextItemPrice =  getMousesPage().getListOfProductItems().get(i+1).getText();
            assertTrue(Integer.parseInt(currentItemPrice.substring(0,currentItemPrice.indexOf(" "))) <=
                    Integer.parseInt(nextItemPrice.substring(0,nextItemPrice.indexOf(" "))));
        }
    }
}
