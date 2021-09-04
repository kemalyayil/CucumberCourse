package POM;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ParentClass {

    WebDriver driver;
    WebDriverWait wait;

    public ParentClass(){
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void clickFunction(WebElement element){
        waitUntilElementClickable(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value){
        waitUntilElementVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilElementClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilElementVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void elementContainsText(WebElement element, String whichText){
        waitUntilElementVisible(element);
        Assert.assertTrue(element.getText().contains(whichText));
    }


}
