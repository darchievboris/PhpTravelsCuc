package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.TourPage;
import util.Driver;
import util.SeleniumUtils;

public class TourPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    TourPage tourPage = new TourPage();

    @Given("User navigate to tour")
    public void user_navigate_to_tour() {
        homePage.navigateToTour();
    }


    @Given("User select to tour")
    public void user_select_to_tour() {
        SeleniumUtils.hiddenElement(tourPage.bottomDiv);
        SeleniumUtils.hiddenElement(tourPage.chatWidget);
        SeleniumUtils.scrollBy300();
        SeleniumUtils.moveIntoView(tourPage.bookNow_Btn);
        SeleniumUtils.scrollBy300();
        SeleniumUtils.click(tourPage.bookNow_Btn);
    }

    @Then("Verifies coupon code")
    public void verifies_coupon_code() {
        SeleniumUtils.hiddenElement(tourPage.bottomDiv);
        SeleniumUtils.hiddenElement(tourPage.chatWidget);

        SeleniumUtils.moveIntoView(tourPage.couponCode_Field);
        SeleniumUtils.sendKeys(tourPage.couponCode_Field,"Test Boris promo code");
        SeleniumUtils.click(tourPage.applyCoupon_Btn);
        String expected = "25% coupon discount has been applied to your booking! please continue by clicking book now to see the discounted price on invoice page.";

        Assert.assertEquals(SeleniumUtils.getText(tourPage.alertSuccess),expected);
    }
}
