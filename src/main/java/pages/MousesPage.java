package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class MousesPage extends BasePage{

    @FindBy(xpath = "//div [label[text() ='Сортировать']]//select[@name= 'sort']")
    private WebElement sortItemsDropDown;

    @FindBy(xpath = "//div[@class='prod-cart__prise-new']")
    private List<WebElement> listOfProductItems;

    public MousesPage(WebDriver driver){
        super(driver);
    }

    public void clickOnSortMousesInProvidedOrder(String order){
        Select selectValue = new Select(sortItemsDropDown);
        selectValue.selectByValue(order);
    }

    public List<WebElement> getListOfProductItems(){
        return listOfProductItems;
    }

}
