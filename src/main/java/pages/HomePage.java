package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {

    private SelenideElement homeTab = $x("//span[text() = 'Home']");
    private SelenideElement accountTab = $x("//span[text() = 'Accounts']");
    private List<SelenideElement> tabs = $$(By.xpath("//nav[@role = 'navigation']//span[@class = 'slds-truncate']"));

    @Step
    public boolean isHomeTabShown() {
        return webElementUtils.isElementVisible(homeTab, 10);
    }

    @Step
    public boolean isAccountTabShown() {
        return webElementUtils.isElementVisible(accountTab, 10);
    }
}
