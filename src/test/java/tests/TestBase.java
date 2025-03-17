package tests;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    protected static final String url = "https://demoqa.com/";


    @BeforeEach
    protected void openPage() {
        open(TestBase.url);
    }

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();

        Configuration.browser = "chrome";
        Configuration.browserSize = "1366x768";

        Configuration.pageLoadStrategy = "eager";
    }

}
