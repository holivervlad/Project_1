package web;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import utils.WebElementUtils;

import static com.codeborne.selenide.Selenide.open;

public abstract class AbstractWebTest {

    private static final String ENVIRONMENT = "https://test.salesforce.com/";

    public void setUp() {
//        WebDriverManager.firefoxdriver().setup();
//        Configuration.browser = "firefox";
//        Configuration.driverManagerEnabled = true;

//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @Before
    public void openEnvironment() {
//        setUp();
        open(ENVIRONMENT);
    }

//    @AfterEach
//    @Attachment
//    public void addScreenShotToAllureReport() {
//        Selenide.screenshot("screenShot");
//        attacheScreenshotToAllure();
//    }

    @After
    public void closeEnvironment() {
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
