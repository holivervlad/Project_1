package utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

public class WebElementUtils {

    private SelenideElement waitUntilVisible(SelenideElement selenideElement, int waitsTime) {
        return selenideElement.shouldBe(Condition.visible, Duration.ofSeconds(waitsTime));
    }

    private SelenideElement waitUntilEnabled(SelenideElement selenideElement, int waitsTime) {
        return selenideElement.shouldBe(Condition.enabled, Duration.ofSeconds(waitsTime));
    }

    private SelenideElement waitUntilVisible(SelenideElement selenideElement) {
        return selenideElement.shouldBe(Condition.visible);
    }

    private SelenideElement waitUntilEnabled(SelenideElement selenideElement) {
        return selenideElement.shouldBe(Condition.enabled);
    }

    public boolean isElementVisible(SelenideElement selenideElement) {
        return waitUntilVisible(selenideElement).exists();
    }

    public boolean isElementVisible(SelenideElement selenideElement, int waitsTime) {
        return waitUntilVisible(selenideElement, waitsTime).exists();
    }

    public void waitUntilVisibleAndClick(SelenideElement selenideElement) {
        waitUntilVisible(selenideElement).click();
    }

    public void waitUntilEnabledAndClick(SelenideElement selenideElement) {
        waitUntilEnabled(selenideElement).click();
    }

    public void moveToElement(SelenideElement selenideElement) {
        Selenide.actions().moveToElement(selenideElement);
    }

    public void dragAndDrop(SelenideElement fromElement, SelenideElement toElement) {
        Selenide.actions().dragAndDrop(fromElement, toElement);
    }

    public void clearAndType(SelenideElement selenideElement, String value) {
        selenideElement.clear();
        selenideElement.setValue(value);
    }

    public String getText(SelenideElement selenideElement) {
        return waitUntilVisible(selenideElement).getText();
    }

    //    public void scrollDown() {
//        Selenide.executeAsyncJavaScript("");
//        Selenide.executeJavaScript("");
//    }
//
    public static void clearBrowserCookieAndStorage() {
        try {
            Selenide.clearBrowserCookies();
            Selenide.clearBrowserLocalStorage();
//            Selenide.executeJavaScript("window.sessionStorage.clear()");
        } catch (Exception ex) {
            System.out.println(String.format("Error message - '%s'", ex.getMessage()));
        }
    }
}
