package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'elektronika')]")
    private WebElement computersButton;

    @FindBy(xpath = "//div[contains (@class,'header-top__item js-cont-btn')]")
    private WebElement contactsBoxPopover;

    @FindBy(xpath = "//a[contains(@href, 'sign-in')]//div[contains(@class, 'login')]")
    private WebElement signInButton;

    @FindBy(xpath = "//li//a[contains(@href,'instagram')]")
    private WebElement instagramButton;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void clickOnProductCatalogButton(){
        productCatalogButton.click();
    }

    public void clickOnComputersButton(){
        computersButton.click();
    }

    public void openContactsBoxPopover(WebDriver driver){
        Actions builder = new Actions(driver);
        builder.moveToElement(contactsBoxPopover).build().perform();
    }

    public WebElement getContactsBoxPopover(){
        return contactsBoxPopover;
    }

    public void clickOnSignInButton(){
        signInButton.click();
    }

    public void clickOnInstagramButton(){
        instagramButton.click();
    }
}
