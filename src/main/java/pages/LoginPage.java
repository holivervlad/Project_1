package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BasePage {

    private SelenideElement userNameField = $x("//input[@id = 'username']");
    private SelenideElement passwordField = $x("//input[@id = 'password']");
    private SelenideElement loginButton = $x("//input[@id = 'Login']");

    @Step
    public LoginPage setUserName(String userName) {
        webElementUtils.waitUntilVisibleAndClick(userNameField);
        webElementUtils.clearAndSetValue(userNameField, userName);
        return this;
    }

    @Step
    public LoginPage setPassword(String password) {
        webElementUtils.waitUntilVisibleAndClick(passwordField);
        webElementUtils.clearAndSetValue(passwordField, password);
        return this;
    }

    @Step
    public void clickLoginButton() {
        webElementUtils.waitUntilVisibleAndClick(loginButton);
    }

    @Step("Log in with '{0}' user name and '{1}' password")
    public HomePage loginAsUser(String userName, String password) {
        setUserName(userName);
        setPassword(password);
        clickLoginButton();
        return new HomePage();
    }
}
