package web;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import pages.LoginPage;
import utils.Users;
import utils.WebElementUtils;

public abstract class AbstractWebTest {

    private static final String ENVIRONMENT = "https://test.salesforce.com/";
    static String username;
    static String password;
    static Users users = new Users();

    public void setUp() {
//        WebDriverManager.firefoxdriver().setup();
//        Configuration.browser = "firefox";
//        Configuration.driverManagerEnabled = true;
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    public static LoginPage openEnvironment() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = false;
        Selenide.open(ENVIRONMENT);
        return new LoginPage();
    }

//    @AfterEach
//    @Attachment
//    public void addScreenShotToAllureReport() {
//        Selenide.screenshot("screenShot");
//        attacheScreenshotToAllure();
//    }

    @AfterClass
    public static void closeEnvironment() {
        WebElementUtils.clearBrowserCookieAndStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }

//    @Attachment
//    public byte[] attacheScreenshotToAllure() {
//        if (WebDriverRunner.hasWebDriverStarted()) {
//            return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
//        } else {
//            return null;
//
//        }
//    }


}
