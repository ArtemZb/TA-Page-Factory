package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage{

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'myishi')]")
    private WebElement mousesButton;

    public ComputersPage(WebDriver driver){
        super(driver);
    }

    public void clickOnMousesButton(){
        mousesButton.click();
    }
}
