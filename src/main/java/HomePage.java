import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private static WebElementUtils webElementUtils = new WebElementUtils();
    private SelenideElement homeTab = $x("//span[text() = 'Home']");
    private SelenideElement accountTab = $x("//span[text() = 'Accounts']");
    private List<SelenideElement> tabs = $$("//span");

    @Step
    public boolean isHomeTabShown() {
        return webElementUtils.isElementVisible(homeTab);
    }

    @Step
    public boolean isAccountTabShown() {
        return webElementUtils.isElementVisible(accountTab);
    }

    @Step
    public boolean isTabsShown(String... tabName) {
        return $$("//span").shouldHave(exactTexts(tabName)).contains(tabName);
    }
}
