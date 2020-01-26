package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.step_impl.AdminCouponPage_Impl;
import util.Driver;

public class AdminCouponPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminCouponPage_Impl adminCouponPage = new AdminCouponPage_Impl();

    @When("Creates a new coupon")
    public void creates_a_new_coupon() {
        adminCouponPage.creatNewCoupon();
    }

    @Then("Verifies coupon is created")
    public void verifies_coupon_is_created() {
        Assert.assertTrue(adminCouponPage.verifyIfCouponExists());
    }

}
