package tests;

import dto.Student;
import enums.Gender;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTests extends AppManager {
    @Test
    public void studentRegFormPositive(){
        Student student = new Student("Vasya", "Vasilev", "vasya@mail.ru",
                Gender.OTHER, "0123456789",
                "05 Jun 2020", "Maths,Physics,Chemistry",
                "Sports", " ", "avenue 12", "NCR", "Deli");
new HomePage(getDriver()).clickBtnForms();
new FormsPage(getDriver()).clickBtnPracticeForm();
new PracticeFormPage(getDriver()).typePracticeForm(student);
    }
}
