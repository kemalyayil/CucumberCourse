package StepDefinitions;


import POM.DialogContentElements;
import POM.LeftNavElements;
import POM.ParentClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class _03_Country extends ParentClass {
    WebDriver driver;

    LeftNavElements leftNavElements = new LeftNavElements();
    DialogContentElements dialogContentElements = new DialogContentElements();

    @When("User create a country")
    public void user_create_a_country() {
        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("CountriesButton");

        dialogContentElements.findElementAndClickFunction("AddButton");
        dialogContentElements.findElementAndSendKeys("NameInput", "Test Country10");
        dialogContentElements.findElementAndSendKeys("CodeInput", "10101010");
        dialogContentElements.findElementAndClickFunction("SaveButton");
    }
    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dialogContentElements.findElementAndVerifyElementContainsText("SuccessMessage", "success");
    }

    @When("User edit the country")
    public void user_edit_the_country() {
        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("CountriesButton");

        dialogContentElements.findElementAndSendKeys("SearchNameInput", "Test Country10");
        dialogContentElements.findElementAndClickFunction("SearchButton");
        dialogContentElements.findElementAndClickFunction("EditButton");
        dialogContentElements.findElementAndSendKeys("NameInput", "Changed Country");
        dialogContentElements.findElementAndClickFunction("SaveButton");
    }

    @When("User delete the country")
    public void user_delete_the_country() {
        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("CountriesButton");

        dialogContentElements.findElementAndSendKeys("SearchNameInput", "Changed Country");
        dialogContentElements.findElementAndClickFunction("SearchButton");
        dialogContentElements.findElementAndClickFunction("DeleteButton");
        dialogContentElements.findElementAndClickFunction("ConfirmDeleteButton");
    }


}
