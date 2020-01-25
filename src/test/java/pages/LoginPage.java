package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class LoginPage {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    public LoginPage() {
        homePage.clickLogin();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    public WebElement login_Inp;

    @FindBy(name = "password")
    public WebElement password_Inp;

    @FindBy(css = ".btn.btn-primary.btn-lg.btn-block.loginbtn")
    public WebElement login_Btn;

    public void setLoginAdmin() {
        SeleniumUtils.sendKeys(login_Inp, ConfigReader.readProperty("loginAdmin"));
    }

    public void setPasswordAdmin() {
        SeleniumUtils.sendKeys(password_Inp, ConfigReader.readProperty("passwordAdmin"));
    }

    public void loginAsAdmin() {
        setLoginAdmin();
        setPasswordAdmin();
        SeleniumUtils.click(login_Btn);
    }

    public static void main(String[] args) {
        driver.get(ConfigReader.readProperty("url"));
        LoginPage p = new LoginPage();
        p.loginAsAdmin();
    }
}
