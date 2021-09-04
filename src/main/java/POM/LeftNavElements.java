package POM;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeftNavElements extends ParentClass{

    public LeftNavElements(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement Setup1Button;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement ParametersButton;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement CountriesButton;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement CitizenshipButton;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement FeesButton;

    WebElement myElement;

    public void findElementAndClickFunction(String elementName){

        switch (elementName){

            case "Setup1Button":
                myElement = Setup1Button;
                break;

            case "ParametersButton":
                myElement = ParametersButton;
                break;

            case "CountriesButton":
                myElement = CountriesButton;
                break;

            case "CitizenshipButton":
                myElement = CitizenshipButton;
                break;

            case "FeesButton":
                myElement = FeesButton;
                break;

        }
        waitUntilElementClickable(myElement);
        waitUntilElementVisible(myElement);
        clickFunction(myElement);

    }

}
