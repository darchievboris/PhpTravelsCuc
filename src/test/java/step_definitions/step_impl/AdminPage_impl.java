package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.AdminPage;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class AdminPage_impl {
    private static WebDriver driver = Driver.getDriver();
    AdminPage adminPage = new AdminPage();

    public void login(){
        SeleniumUtils.sendKeys(adminPage.email_Inp, ConfigReader.readProperty("loginAdmin"));
        SeleniumUtils.sendKeys(adminPage.password_Inp, ConfigReader.readProperty("passwordAdmin"));
        SeleniumUtils.hiddenElement(adminPage.bottomDiv);
        SeleniumUtils.click(adminPage.login_Btn);
    }

    public void navigateToPage(String pageName){
        switch (pageName.toLowerCase()){
            case "coupons":
                SeleniumUtils.click(adminPage.coupons_Nav);
                break;
        }

    }


}
