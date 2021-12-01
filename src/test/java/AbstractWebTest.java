import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

public abstract class AbstractWebTest {

    protected final String ENVIRONMENT = "https://test.salesforce.com/";

    @Before
    public void openEnvironment() {
        open(ENVIRONMENT);
    }

    @After
    public void closeEnvironment() {
        Selenide.closeWebDriver();
    }


}
