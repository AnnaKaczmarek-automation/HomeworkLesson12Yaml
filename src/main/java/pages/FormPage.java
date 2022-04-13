package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;
import java.util.Random;

public class FormPage {
    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "input#inputFirstName3")
    private WebElement nameInput;

    @FindBy(css = "input#inputLastName3")
    private WebElement secondNameInput;

    @FindBy(css = "input#inputEmail3")
    private WebElement mailInput;

    @FindBy(xpath = "//input[@class='form-check-input'][@name='gridRadiosSex']")
    private List<WebElement> genderOptions;

    @FindBy(css = "input#inputAge3")
    private WebElement ageInput;

    @FindBy(name = "gridRadiosExperience")
    private List<WebElement> yearOfExperience;

    @FindBy(id = "gridCheckAutomationTester")
    private WebElement profession;

    @FindBy(css = "select#selectContinents")
    private WebElement continents;

    @FindBy(css = "select#selectSeleniumCommands")
    private WebElement seleniumCommands;

    @FindBy(css = "input#chooseFile")
    private WebElement fileInput;

    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement signInButton;

    @FindBy(id = "validator-message")
    private WebElement validatorMessage;

    public void fillName(String name) {
        nameInput.sendKeys(name);
    }

    public void fillSecondName(String secondName) {
        secondNameInput.sendKeys(secondName);
    }

    public void fillMail(String mail) {
        mailInput.sendKeys(mail);
    }

    public void selectGenderOption() {
        getRandomElement(genderOptions);

    }

    private WebElement getRandomElement(List<WebElement> elements) {
        Random random = new Random();
        int quantityOfElements = elements.size();
        int randomIndex = random.nextInt(quantityOfElements);
        return elements.get(randomIndex);
    }

    public void fillAge(int age) {
        ageInput.sendKeys(String.valueOf(age));
    }

    public void fillYearOfExperience() {
        getRandomElement(yearOfExperience);
    }

    public void fillAutomationTesterProfession() {
        profession.click();
    }

    public void selectContinent(String continent){
        new Select(continents).selectByValue(continent);
    }

    public void selectSeleniumCommand(){
        new Select(seleniumCommands).selectByValue("switch-commands");
        new Select(seleniumCommands).selectByValue("wait-commands");
    }

    public  void selectFile(){
        File file = new File("src/main/resources/TestingFile");
        fileInput.sendKeys(file.getAbsolutePath());
    }

    public void selectSignInButton(){
        signInButton.click();
    }

    public void varifyValidationMessage(){
        String actualMessage = validatorMessage.getText();
        String expectedMessage = "Form not send, please fill all missing form fields";
        Assert.assertEquals(expectedMessage,actualMessage);
    }

}
