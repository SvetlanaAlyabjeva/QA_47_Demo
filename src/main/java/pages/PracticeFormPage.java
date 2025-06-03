package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PracticeFormPage extends BasePage{
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
    @FindBy(id =  "react-select-4-input")
    WebElement inputCity;
    @FindBy(css = "button[id='submit']")
    WebElement btnSubmit;

    public void typePracticeForm(){
        hideBanner();
        hideFooter();
        fieldName.sendKeys("Monkey");

    }
}
