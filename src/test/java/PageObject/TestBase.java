package PageObject;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    protected static final String url = "https://demoqa.com/";

    protected void openPage() {
        open(TestBase.url);
    }

    @BeforeAll
    public static void setUp() {
        Configuration.pageLoadStrategy = "eager";
    }

    @AfterAll
    public static void tearDown() {
        closeWebDriver();
    }
}
