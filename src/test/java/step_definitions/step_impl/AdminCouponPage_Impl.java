package step_definitions.step_impl;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AdminCouponPage;
import testData.CouponPOJO;
import util.DateUtils;
import util.Driver;
import util.SeleniumUtils;

import java.util.List;

public class AdminCouponPage_Impl {
    private static WebDriver driver = Driver.getDriver();
    AdminCouponPage adminCouponPage = new AdminCouponPage();

    String testCode = "Test Boris " + DateUtils.currentDateTime();

    CouponPOJO currentCoupon = new CouponPOJO("25", "5", testCode, DateUtils.currentDatePlus(0), DateUtils.currentDatePlus(5));

    public void creatNewCoupon() {
        SeleniumUtils.click(adminCouponPage.addNewCoupon_Btn);
        SeleniumUtils.sendKeys(adminCouponPage.percentage_field, currentCoupon.getPercentage());
        SeleniumUtils.sendKeys(adminCouponPage.maxUses_field, currentCoupon.getMaxUse());
        SeleniumUtils.sendKeys(adminCouponPage.startDate_field, currentCoupon.getStartDate());
        SeleniumUtils.sendKeys(adminCouponPage.endDate_field, currentCoupon.getEndDate());
        SeleniumUtils.click(adminCouponPage.tours_checkBox);
        SeleniumUtils.click(adminCouponPage.cars_checkBox);
        SeleniumUtils.sendKeys(adminCouponPage.codeInput_field, currentCoupon.getCouponCode());
        SeleniumUtils.click(adminCouponPage.submit_Btn);
        SeleniumUtils.waitForVisibilityOfElement(adminCouponPage.addNewCoupon_Btn);
    }


    public boolean verifyIfCouponExists() {
        try {
            SeleniumUtils.click(adminCouponPage.showAllCoupons_Btn);
        }catch (StaleElementReferenceException e) {
            SeleniumUtils.click(adminCouponPage.showAllCoupons_Btn);
        }
        List<WebElement> ls;
        try {
            ls = driver.findElements(By.xpath(adminCouponPage.allCouponsCodes_XPATH));
        }catch (StaleElementReferenceException e) {
            ls = driver.findElements(By.xpath(adminCouponPage.allCouponsCodes_XPATH));
        }

        for(WebElement e : ls){
            if(e.getText().equals(currentCoupon.getCouponCode())){
                return true;
            }
        }
        return false;
    }
}
