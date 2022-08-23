package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private SelenideElement userNameField = $x("//input[@id = 'username']");
    private SelenideElement passwordField = $x("//input[@id = 'password']");
    private SelenideElement loginButton = $x("//input[@id = 'Login']");

    @Step
    public LoginPage setUserName(String userName) {
        userNameField.click();
        userNameField.setValue(userName);
        return this;
    }

    @Step
    public LoginPage setPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    @Step
    public void clickLoginButton() {
        loginButton.click();
    }

    @Step("Log in with '{0}' user name and '{1}' password")
    public HomePage loginAsUser(String userName, String password) {
        setUserName(userName);
        setPassword(password);
        clickLoginButton();
        return new HomePage();
    }
}
