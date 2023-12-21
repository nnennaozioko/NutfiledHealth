package pageObjects;

import lombok.var;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.thread.ThreadTimeoutException;

import static Hooks.HookTest.driver;

public class NearestGymPage {

    public NearestGymPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "ccc-notify-accept")
    private WebElement AcceptCookies;

    public void clickAcceptCookies() {
        AcceptCookies.click();
    }

//   @FindBy(css = "#location-finder__input-00000160-4eeb-de17-a579-dffb7ab70000")
//    private WebElement Postcode;
//   public  void enterPostcode(String code) throws InterruptedException {
//       Postcode.sendKeys(code);
//       Thread.sleep(10000);
//       Postcode.sendKeys(Keys.ENTER);


    @FindBy(css = ".location-finder__toggle__link.js-location-finder-toggle-link.js-active")
    private WebElement ListView;
}




















































