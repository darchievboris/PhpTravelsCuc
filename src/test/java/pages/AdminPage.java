package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class AdminPage {
    private static WebDriver driver = Driver.getDriver();
    AdminLoginFormPage adminLoginFormPage;
    public AdminPage(){
        PageFactory.initElements(driver,this);
        adminLoginFormPage = new AdminLoginFormPage();
        adminLoginFormPage.loginAsAdmin();
    }


    public String getTitle(){
        SeleniumUtils.sleep(2000);
        return driver.getTitle();
    }

//    public static void main(String[] args) {
//        driver.get(ConfigReader.readProperty("urlAdmin"));
//        AdminPage p = new AdminPage();
//        System.out.println(p.getTitle());
//    }
}
