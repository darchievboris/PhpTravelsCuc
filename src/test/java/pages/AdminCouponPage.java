package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.List;

public class AdminCouponPage {
    private static WebDriver driver = Driver.getDriver();
    public AdminCouponPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[text()=' Add']")
    public WebElement addNewCoupon_Btn;


    @FindBy(xpath = "(//select[@name='status'])[1]")
    public WebElement status_field;

    @FindBy(xpath = "(//input[@placeholder='Percentage'])[1]")
    public WebElement percentage_field;

    @FindBy(xpath = "(//input[@placeholder='Maximum Uses'])[1]")
    public WebElement maxUses_field;

    @FindBy(xpath = "(//input[@placeholder='Start Date'])[1]")
    public WebElement startDate_field;

    @FindBy(xpath = "(//input[@placeholder='Expiration Date'])[1]")
    public WebElement endDate_field;

    @FindBy(xpath = "(//input[@value='tours'])[1]")
    public WebElement tours_checkBox;

    @FindBy(xpath = "(//input[@value='cars'])[1]")
    public WebElement cars_checkBox;

    @FindBy(xpath = "//input[@placeholder='Coupon Code']")
    public WebElement codeInput_field;

    @FindBy(xpath = "//button[text()=' Submit']")
    public WebElement submit_Btn;

    @FindBy(xpath = "(//tr[contains(@class,'xcrud-row xcrud-row')])/td[4]")
    public List<WebElement> allCouponCodes;

    @FindBy(xpath = "//button[contains(text(),'All')]")
    public WebElement showAllCoupons_Btn;

    public String allCouponsCodes_XPATH = "(//tr[contains(@class,'xcrud-row xcrud-row')])/td[4]";
}
