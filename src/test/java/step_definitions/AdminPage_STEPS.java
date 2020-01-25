package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.step_impl.AdminPage_impl;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class AdminPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminPage_impl adminPage = new AdminPage_impl();

    @Given("User opens admin login page")
    public void user_opens_admin_login_page() {
        driver.get(ConfigReader.readProperty("urlAdmin"));
    }

    @When("User logsin with admin account")
    public void user_logsin_with_admin_account() {
        adminPage.login();
    }

    @Then("Verifies title is Dashboard")
    public void verifies_title_is_Dashboard() {
        SeleniumUtils.sleep(2000);
        Assert.assertEquals("Dashboard",driver.getTitle());
    }

}
