import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTest extends AbstractWebTest {
    private HomePage homePage;
    private static String username;
    private static String password;

    @BeforeClass
    public static void beforeClass() {
        Users users = new Users();
        username = users.getSalesRepUserName();
        password = users.getSalesRepPassword();
    }

    @Test
    public void homeTabShouldBeShownTest() {
        homePage = new LoginPage().loginAsUser(username, password);
        Assert.assertTrue(homePage.isHomeTabShown());
    }

    @Test
    public void accountTabShouldBeShownTest() {
        homePage = new LoginPage().loginAsUser(username, password);
        Assert.assertTrue(homePage.isAccountTabShown());
    }

    @Test
    public void tabsShouldBeShownTest() {
        homePage = new LoginPage().loginAsUser(username, password);
        Assert.assertTrue(homePage.isTabsShown("Accounts", "Home"));
    }

}
