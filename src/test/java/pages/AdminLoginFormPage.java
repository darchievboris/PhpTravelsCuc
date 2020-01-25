package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class AdminLoginFormPage {

    public AdminLoginFormPage(WebDriver driver){

        PageFactory.initElements(driver,this);
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
        SeleniumUtils.sendKeys(email_Inp, ConfigReader.readProperty("loginAdmin"));
    }

    public void setPasswordAdmin() {
        SeleniumUtils.sendKeys(password_Inp, ConfigReader.readProperty("passwordAdmin"));
    }

    public void loginAsAdmin() {
        setLoginAdmin();
        setPasswordAdmin();
        SeleniumUtils.hiddenElement(hiddenDiv);
        SeleniumUtils.click(login_Btn);
    }


//    public static void main(String[] args) {
//        driver.get(ConfigReader.readProperty("urlAdmin"));
//        AdminLoginFormPage p = new AdminLoginFormPage();
//        p.loginAsAdmin();
//    }
}
