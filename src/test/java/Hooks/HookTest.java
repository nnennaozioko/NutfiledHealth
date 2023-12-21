package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HookTest {

    public static WebDriver driver;

    @Before
    public void BrowserSetup(){
//    {WebDriverManager.chromedriver().setup();
//       driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-notifications");
        //driver.switchTo().alert().accept();

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        // FirefoxDriverService service = new GeckoDriverService.Builder().withLogFile(logLocation).build();
        //driver.get("https://tfl.gov.uk");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @After
    public void TearDown()
    {
//        driver.close();
//        driver.quit();
   }

}
