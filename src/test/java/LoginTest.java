import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends AbstractWebTest {

    private HomePage homePage;

    @Test
    public void userCanSearchTest() {
        homePage = new LoginPage().loginAsUser("salesrep_phx@oceuiauto.com.devlopment", "crm1OCE2");
        Assert.assertTrue(homePage.isHomeTabShown());
    }


}
