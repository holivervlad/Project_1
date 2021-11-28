import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private SelenideElement homeTab = $( By.xpath("//span[text() = 'Home']"));

    public boolean isHomeTabShown() {
        return homeTab.shouldBe(Condition.visible, Duration.ofSeconds(10)).exists();
    }
}
