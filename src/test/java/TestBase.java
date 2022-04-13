import browser.Browsers;
import browser.BrowsersTemplate;
import model.Environment;
import model.EnvironmentTemplate;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class TestBase {
    protected static WebDriver driver;
    private static Logger log = LoggerFactory.getLogger("BaseData.BaseTest.class");
    private static Browsers browser;
    private static BrowsersTemplate browsersTemplate;
    protected static Environment environment;
    private static EnvironmentTemplate environmentTemplate;
    protected static YamlReader yamlReader;

    @BeforeAll
    static void beforeAll() throws IOException {
        environmentTemplate = EnvironmentTemplate.getActiveTest();
        browser = new Browsers();
        driver = browser.getDriver();


    }

    @AfterAll
    static void tearDown() {
        driver.quit();
        log.info("***** Driver closed *****");
    }
}
