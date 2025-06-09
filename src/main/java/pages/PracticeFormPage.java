package pages;

import dto.Student;
import enums.Gender;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PracticeFormPage extends BasePage {
    public PracticeFormPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement fieldName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement fieldLastName;
    @FindBy(id = "userEmail")
    WebElement fieldEmail;
    @FindBy(css = "input[id = 'userNumber']")
    WebElement fieldMobile;
    @FindBy(id = "dateOfBirthInput")
    WebElement fieldOfDateBirth;
    @FindBy(id = "subjectsInput")
    WebElement fieldSubject;
    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    WebElement textAreaCurAdd;
    @FindBy(xpath = "//input[@id='react-select-3-input']")
    WebElement inputState;
    @FindBy(id = "react-select-4-input")
    WebElement inputCity;
    @FindBy(css = "button[id='submit']")
    WebElement btnSubmit;

    public void typePracticeForm(Student student) {
        hideBanner();
        hideFooter();
        fieldName.sendKeys(student.getName());
        fieldLastName.sendKeys(student.getLastName());
        fieldEmail.sendKeys(student.getEmail());
        typeGender(student.getGender());
        fieldMobile.sendKeys(student.getMobile());
        //fieldOfDateBirth.sendKeys(student.getDateOfBirth());
        typeDateOfBirth(student.getDateOfBirth());
        textAreaCurAdd.sendKeys(student.getAddress());
    }

    private void typeGender(Gender gender) {
        WebElement btnGender = driver.findElement(By.xpath(gender.getLocator()));
        btnGender.click();
    }
    private void typeDateOfBirth(String dateOfBirth){
        fieldOfDateBirth.click();
        String operationSystem = System.getProperty("os.name");
        System.out.println(operationSystem);
        if (operationSystem.startsWith("Win"))
            fieldOfDateBirth.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        else if (operationSystem.startsWith("Mac"))
            fieldOfDateBirth.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        fieldOfDateBirth.sendKeys(dateOfBirth);
        fieldOfDateBirth.sendKeys(Keys.ENTER);
    }
}
