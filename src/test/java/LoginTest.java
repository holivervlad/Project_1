import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTest extends AbstractWebTest {
    private HomePage homePage;
    private static String username;
    private static String password;
    private static LoginPage loginPage;

    @BeforeClass
    public static void beforeClass() {
        Users users = new Users();
        username = users.getSalesRepUserName();
        password = users.getSalesRepPassword();
        loginPage = new LoginPage();
    }

    @Test
    public void homeTabShouldBeShownTest() {
        homePage = loginPage.loginAsUser(username, password);
        Assert.assertTrue(homePage.isHomeTabShown());
    }

    @Test
    public void accountTabShouldBeShownTest() {
        homePage = loginPage.loginAsUser(username, password);
        Assert.assertTrue(homePage.isAccountTabShown());
    }

}
