import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private SelenideElement userNameField = $(By.xpath("//input[@id = 'username']"));
    private SelenideElement passwordField = $(By.xpath("//input[@id = 'password']"));
    private SelenideElement loginButton = $(By.xpath("//input[@id = 'Login']"));


    public LoginPage setUserName(String userName) {

        userNameField.click();
        userNameField.setValue(userName);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public HomePage loginAsUser(String userName, String password) {
        setUserName(userName);
        setPassword(password);
        clickLoginButton();
        return new HomePage();
    }
}
