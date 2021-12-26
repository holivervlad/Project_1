import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Selenide.open;

public abstract class AbstractWebTest {

    private static final String ENVIRONMENT = "https://test.salesforce.com/";

    static {
//        Selenide.webdriver().driver().getWebDriver().manage().window().maximize();
//        Configuration.pageLoadStrategy = "eager";
//        Configuration.browser = "firefox";
//        Configuration.reportsUrl = "some.url";
//        Configuration.fastSetValue = true;
//        Configuration.assertionMode = AssertionMode.SOFT;
//        Configuration.pollingInterval = 200; //интвервал в через который идет поиск элементов на странице
//        Configuration.savePageSource = false; //page sourse теперь будет отсутствовать на странице

//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @Before
    public void openEnvironment() {
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
