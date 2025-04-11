package tests;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import config.ConfigProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestBase {
    private static final ConfigProperties config = ConfigFactory.create(ConfigProperties.class);

    @BeforeEach
    protected void openPage() {
        open(config.baseUrl());

        // Прячем iframe-рекламу
        WebDriver driver = WebDriverRunner.getWebDriver();
        ((JavascriptExecutor) driver).executeScript(
                "document.querySelectorAll('iframe').forEach(e => e.style.display = 'none')"
        );
    }



    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();

        // Берём все параметры из config.properties
        Configuration.browser = config.browser();
        Configuration.browserSize = config.browserSize();
        Configuration.pageLoadStrategy = config.pageLoadStrategy();

    }

}