import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private SelenideElement homeTab = $x("//span[text() = 'Home']");
    private SelenideElement accountTab = $x("//span[text() = 'Accounts']");

    @Step
    public boolean isHomeTabShown() {
        return homeTab.shouldBe(Condition.visible, Duration.ofSeconds(20)).exists();
    }

    @Step
    public boolean isAccountTabShown() {
        return accountTab.shouldBe(Condition.visible, Duration.ofSeconds(20)).exists();
    }

    @Step
    public boolean isTabsShown(String... tabName) {
        return $$("//span").shouldHave(exactTexts(tabName)).contains(tabName);
    }
}
