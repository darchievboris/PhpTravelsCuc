package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AdminPage;
import util.ConfigReader;
import util.Driver;

public class AdminPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminPage adminPage = new AdminPage();

    @Given("User opens admin login page")
    public void user_opens_admin_login_page() {
        Driver.getDriver().get(ConfigReader.readProperty("urlAdmin"));

    }

    @When("User is authorized")
    public void user_is_authorized() {
        adminPage.getTitle();
    }

    @Then("Verifies title is Dashbord")
    public void verifies_title_is_Dashbord() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
