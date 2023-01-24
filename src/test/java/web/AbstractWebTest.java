package web;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import pages.LoginPage;
import utils.Users;
import utils.WebElementUtils;

import static com.codeborne.selenide.Selenide.open;

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
        open(ENVIRONMENT);
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
        Selenide.closeWebDriver();
        WebElementUtils.clearBrowserCookieAndStorage();
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
