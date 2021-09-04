package POM;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContentElements extends ParentClass{

    public DialogContentElements(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement AddButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement NameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement CodeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement SaveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessMessage;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement SearchNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement SearchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement EditButton;

    @FindBy(xpath = "//ms-delete-button//button")
    //span[text()='Delete']
    private WebElement DeleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement ConfirmDeleteButton;

    @FindBy(xpath = "//ms-text-field[@formControlName='shortName']//input")
    private WebElement ShortNameInput;

    @FindBy(xpath = "//ms-text-field[@formControlName='budgetAccountIntegrationCode']//input")
    private WebElement IntegrationCodeInput;

    @FindBy(xpath = "//ms-integer-field[@formControlName='priority']//input")
    private WebElement PriorityInput;




    WebElement myElement;

    public void findElementAndClickFunction(String elementName){

        switch (elementName){

            case "AddButton":
                myElement = AddButton;
                break;
            case "SaveButton":
                myElement = SaveButton;
                break;
            case "SearchButton":
                myElement = SearchButton;
                break;
            case "EditButton":
                myElement = EditButton;
                break;
            case "DeleteButton":
                myElement = DeleteButton;
                break;
            case "ConfirmDeleteButton":
                myElement = ConfirmDeleteButton;
                break;
        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeys(String elementName, String value){

        switch (elementName){

            case "NameInput":
                myElement = NameInput;
                break;
            case "CodeInput":
                myElement = CodeInput;
                break;
            case "SearchNameInput":
                myElement = SearchNameInput;
                break;
            case "ShortNameInput":
                myElement = ShortNameInput;
                break;
            case "IntegrationCodeInput":
                myElement = IntegrationCodeInput;
                break;
            case "PriorityInput":
                myElement = PriorityInput;
                break;
        }

        // Create sendkeys method in Parent class which is going to wait and send keys
        sendKeysFunction(myElement, value);
    }

    public void findElementAndVerifyElementContainsText(String elementName, String whichText){

        switch (elementName){

            case "SuccessMessage":
                myElement = SuccessMessage;
                break;

        }

        elementContainsText(myElement, whichText);
    }
}
