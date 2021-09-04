package StepDefinitions;

import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class _02_LoginMersys {
    WebDriver driver;


    @Given("Navigate to Mersys")
    public void navigate_to_mersys() {
        driver = Driver.getDriver();
        driver.get("https://test.mersys.io/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement acceptCookies = driver.findElement(By.xpath("//button[text()='Accept all cookies']"));
        acceptCookies.click();
    }

    @When("User enter valid username and password")
    public void user_enter_valid_username_and_password() {
        driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("i.muratov");
        driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("QWEasd@1901");

        driver.findElement(By.xpath("//button[@aria-label='LOGIN']")).click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() throws InterruptedException {
        WebElement verifyLogin = driver.findElement(By.xpath("//span[text()='Dashboard']"));
        Assert.assertNotNull(verifyLogin);
    }

}
