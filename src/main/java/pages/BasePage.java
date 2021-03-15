package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {

    private  WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void implicitWait(long timeToWait){
        driver.manage().timeouts().implicitlyWait(timeToWait, TimeUnit.SECONDS);
    }

    public void waitForPageLoadComplete(long timeToWait){
        new WebDriverWait(driver,timeToWait).until(
            webDriver->((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void waitVisibilityOfElement(WebElement webElement, long timeToWait){
        WebDriverWait wait = new WebDriverWait(driver, timeToWait);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitNumberOfWindowsToBeDisplayed (int numberOfWindowsToBeDisplayed, long timeToWait){
        WebDriverWait wait = new WebDriverWait(driver, timeToWait);
        wait.until(ExpectedConditions.numberOfWindowsToBe(numberOfWindowsToBeDisplayed));
    }

    public List<String> getBrowserWindows(){
       return new ArrayList<String>(driver.getWindowHandles());
    }

    public void switchToWindow(int windowNumber){
        if(windowNumber >= 0 && windowNumber < getBrowserWindows().size()){
            driver.switchTo().window(getBrowserWindows().get(windowNumber));
        }
    }
    public String getCurrentWindowURL(){
        return driver.getCurrentUrl();
    }

}
