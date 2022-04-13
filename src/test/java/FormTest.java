import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.FormPage;

import java.io.IOException;

public class FormTest extends TestBase {
    YamlReader yamlReader = new YamlReader();
    Logger log = LoggerFactory.getLogger("FormTest.class");

    @Test
    public void fillForm() throws IOException {
        FormPage formPage = new FormPage(driver);
        formPage.fillName(yamlReader.getApplicationProperties().getActiveTest().getFirstName());
        log.info("***** Name is correctly set *****");
        formPage.fillSecondName(yamlReader.getApplicationProperties().getActiveTest().getSecondName());
        log.info("***** Second name is correctly set *****");
        formPage.fillMail(yamlReader.getApplicationProperties().getActiveTest().getMail());
        log.info("***** Mail is correctly set *****");
        formPage.selectGenderOption();
        log.info("***** Gender option is correctly selected *****");
        formPage.fillAge(Integer.parseInt(yamlReader.getApplicationProperties().getActiveTest().getAge()));
        log.info("***** Age is correctly set *****");
        formPage.fillYearOfExperience();
        log.info("***** Year of experience is correctly selected *****");
        formPage.fillAutomationTesterProfession();
        log.info("***** Profession is correctly selected *****");
        formPage.selectContinent(yamlReader.getApplicationProperties().getActiveTest().getContinent());
        log.info("***** Continent is correctly selected *****");
        formPage.selectSeleniumCommand();
        log.info("***** Selenium commands are correctly selected *****");
        formPage.selectFile();
        log.info("***** File is correctly selected *****");
        formPage.selectSignInButton();
        log.info("***** 'Sign in' button is correctly selected *****");
        formPage.varifyValidationMessage();
        log.info("***** Correct validation message is displayed *****");
    }
}
