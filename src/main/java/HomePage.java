import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private SelenideElement homeTab = $x("//span[text() = 'Home']");

    public boolean isHomeTabShown() {
        return homeTab.shouldBe(Condition.visible, Duration.ofSeconds(20)).exists();
    }
}
