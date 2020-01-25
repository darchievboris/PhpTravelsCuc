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

    public AdminPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "email")
    public WebElement email_Inp;

    @FindBy(name = "password")
    public WebElement password_Inp;

    @FindBy(css = ".btn.btn-primary.btn-block.ladda-button.fadeIn.animated.btn-lg")
    public WebElement login_Btn;

    @FindBy(css = ".text-center.wow.fadeIn.animated")
    public WebElement bottomDiv;
}
