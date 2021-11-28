import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {

    @BeforeAll
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        // or for fine-tuning:
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(false)
                .savePageSource(true)
        );
    }

    HomePage homePage;

    @Test
    public void userCanSearchTest() {
        open("https://test.salesforce.com/");
        homePage = new LoginPage().loginAsUser("salesrep_phx@oceuiauto.com.devlopment", "crm1OCE2");
        homePage.isHomeTabShown();
    }


}
