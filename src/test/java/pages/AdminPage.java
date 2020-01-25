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
    AdminLoginFormPage adminLoginFormPage = new AdminLoginFormPage();
    public AdminPage(){
        PageFactory.initElements(driver,this);
        adminLoginFormPage.loginAsAdmin();
    }

    @FindBy(name = "email")
    public WebElement email_Inp;

    @FindBy(name = "password")
    public WebElement password_Inp;

    @FindBy(css = ".btn.btn-primary.btn-block.ladda-button.fadeIn.animated.btn-lg")
    public WebElement login_Btn;

    @FindBy(css = ".text-center.wow.fadeIn.animated")
    public WebElement hiddenDiv;

    public void setLoginAdmin() {
    }

    public void setPasswordAdmin() {
    }

    public void loginAsAdmin() {
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
