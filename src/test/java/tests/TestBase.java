package tests;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;
import config.ConfigProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
    private static final ConfigProperties config = ConfigFactory.create(ConfigProperties.class);

    @BeforeEach
    protected void openPage() {
        open(config.baseUrl());
    }

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();

        // Берём все параметры из config.properties
        Configuration.browser = config.browser();
        Configuration.browserSize = config.browserSize();
        Configuration.pageLoadStrategy = config.pageLoadStrategy();

/*        // Если браузер - Brave
        if ("chrome".equals(config.browser())) {
            ChromeOptions options = new ChromeOptions();
            options.setBinary(config.browserBinary());
            Configuration.browserCapabilities = options;
        }*/
    }

}