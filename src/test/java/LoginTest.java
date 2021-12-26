import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends AbstractWebTest {
    private HomePage homePage;

    @Test
    public void homeTabShouldBeShownTest() {
        homePage = new LoginPage().loginAsUser("salesrep_phx@oceuiauto.com.devlopment", "crm1OCE3");
        Assert.assertTrue(homePage.isHomeTabShown());
    }

    @Test
    public void accountTabShouldBeShownTest() {
        homePage = new LoginPage().loginAsUser("salesrep_phx@oceuiauto.com.devlopment", "crm1OCE3");
        Assert.assertTrue(homePage.isAccountTabShown());
    }

    @Test
    public void tabsShouldBeShownTest() {
        homePage = new LoginPage().loginAsUser("salesrep_phx@oceuiauto.com.devlopment", "crm1OCE3");
        Assert.assertTrue(homePage.isTabsShown("Accounts", "Home"));
    }

}
