package StepDefinitions;

import POM.DialogContentElements;
import POM.LeftNavElements;
import io.cucumber.java.en.*;

public class _05_Fees {

    LeftNavElements leftNavElements = new LeftNavElements();
    DialogContentElements dialogContentElements = new DialogContentElements();

    @And("User navigate to Fees page")
    public void user_navigate_to_fees_page() {

        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("FeesButton");

    }

    @And("User create a Fee {string} and {string} and {string} and {string}")
    public void user_create_a_fee_and_and_and(String name, String code, String intCode, String priority) {

        dialogContentElements.findElementAndClickFunction("AddButton");
        dialogContentElements.findElementAndSendKeys("NameInput", name);
        dialogContentElements.findElementAndSendKeys("CodeInput", code);
        dialogContentElements.findElementAndSendKeys("IntegrationCodeInput", intCode);
        dialogContentElements.findElementAndSendKeys("PriorityInput", priority);
        dialogContentElements.findElementAndClickFunction("SaveButton");

    }


}