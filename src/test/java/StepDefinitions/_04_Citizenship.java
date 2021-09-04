package StepDefinitions;

import POM.DialogContentElements;
import POM.LeftNavElements;
import io.cucumber.java.en.*;

public class _04_Citizenship {

    LeftNavElements leftNavElements = new LeftNavElements();
    DialogContentElements dialogContentElements = new DialogContentElements();

    @Given("User navigate to Citizenship page")
    public void user_navigate_to_citizenship_page() {

        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("CitizenshipButton");

    }


    @And("User create a citizenship with {string} name and {string} shortname")
    public void user_create_a_citizenship_with_name_and_shortname(String name, String shortName) {

        dialogContentElements.findElementAndClickFunction("AddButton");
        dialogContentElements.findElementAndSendKeys("NameInput", name);
        dialogContentElements.findElementAndSendKeys("ShortNameInput", shortName);
        dialogContentElements.findElementAndClickFunction("SaveButton");
    }

    @And("User edit the {string} citizenship to {string}")
    public void user_edit_the_country(String name, String newCitizenshipName) {

        dialogContentElements.findElementAndSendKeys("SearchNameInput", name);
        dialogContentElements.findElementAndClickFunction("SearchButton");
        dialogContentElements.findElementAndClickFunction("EditButton");
        dialogContentElements.findElementAndSendKeys("NameInput", newCitizenshipName);
        dialogContentElements.findElementAndClickFunction("SaveButton");

    }

    @And("User delete {string} citizenship")
    public void user_delete_citizenship(String citizenshipToDelete) {

        dialogContentElements.findElementAndSendKeys("SearchNameInput", citizenshipToDelete);
        dialogContentElements.findElementAndClickFunction("SearchButton");
        dialogContentElements.findElementAndClickFunction("DeleteButton");
        dialogContentElements.findElementAndClickFunction("ConfirmDeleteButton");

    }

}