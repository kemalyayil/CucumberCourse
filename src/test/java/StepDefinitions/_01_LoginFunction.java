package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginFunction {
    @Given("^Navigate to the website$")
    public void navigate_to_the_website() {
        System.out.println("Navigate to website");
    }

    @When("^User enters valid username and password$")
    public void user_enters_valid_username_and_password() {
        System.out.println("Enter username and password");
    }

    @Then("^User should be able to login their account$")
    public void user_should_be_able_to_login_their_account() {
        System.out.println("Login successful");
    }
    @When("User enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        System.out.println("Enter invalid username and password");
    }
    @Then("User should not login to their account")
    public void user_should_not_login_to_their_account() {
        System.out.println("Login failed");
    }

}
