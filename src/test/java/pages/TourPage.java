package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
import util.SeleniumUtils;

public class TourPage {
    private static WebDriver driver = Driver.getDriver();

    public TourPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".btn.btn-secondary.btn-block.mt-20.btn-action.btn-lg.loader")
    public WebElement bookNow_Btn;

    @FindBy(css = ".o2.coupon.form-bg-light")
    public WebElement couponCode_Field;

    @FindBy(xpath = "//button[@class='btn btn-danger applycoupon btn-block']")
    public WebElement applyCoupon_Btn;

    @FindBy(id = "cookyGotItBtnBox")
    public WebElement bottomDiv;

    @FindBy(id = "chat-widget")
    public WebElement chatWidget;

    @FindBy(css = ".alert.alert-success")
    public WebElement alertSuccess;

    public void clickBookNow(){
        SeleniumUtils.moveIntoView(bookNow_Btn);
        SeleniumUtils.click(bookNow_Btn);
    }

}
