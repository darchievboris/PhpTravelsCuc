//package step_definitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import pages.AdminPage;
//import util.ConfigReader;
//import util.Driver;
//
//public class AdminPage_STEPS1 {
//    private static WebDriver driver = Driver.getDriver();
//    AdminPage adminPage = new AdminPage();
//
//
//    @Given("User opens admin login page")
//    public void user_opens_admin_login_page() {
//        System.out.println("=====================");
////        Driver.getDriver().get(ConfigReader.readProperty("urlAdmin"));
////        driver.get(ConfigReader.readProperty("urlAdmin"));
//    }
//
//
//    @When("User is authorized")
//    public void user_is_authorized() {
//        adminPage.loginAsAdmin();
//    }
//    @Then("Verifies title is Dashbord")
//    public void verifies_title_is_Dashbord() {
//        Assert.assertEquals("Dashbord",adminPage.getTitle());
//    }
//
//}
