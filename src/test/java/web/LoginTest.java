package web;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.HomePage;

public class LoginTest extends AbstractWebTest {
    private static HomePage homePage;

    @BeforeClass
    public static void beforeClass() {
        username = users.getSalesRepUserName();
        password = users.getSalesRepPassword();
        homePage = openEnvironment().loginAsUser(username, password);
    }

    @Test
    public void homeTabShouldBeShownTest() {
        Assert.assertTrue(homePage.isHomeTabShown());
    }

    @Test
    public void accountTabShouldBeShownTest() {
        Assert.assertTrue(homePage.isAccountTabShown());
    }

}
