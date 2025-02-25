package PageObject;

import org.junit.jupiter.api.Test;

public class TestDemoQA extends TestBase {

    private final Elements elementsPage = new Elements();
    private final Forms formsPage = new Forms();

    @Test
    public void textFieldTest() {
        openPage();
        elementsPage.openElements();
        elementsPage.openTextBox();
        elementsPage.enterUserName("Какое-то Имя");
        elementsPage.submitTextBox();
        elementsPage.checkUserName("Какое-то Имя");
    }

    @Test
    public void checkBoxTest() {
        openPage();
        elementsPage.openCheckBox();
        elementsPage.selectCheckBox();
        elementsPage.checkCheckBoxSelection();
    }

    @Test
    public void radioButtonTest() {
        openPage();
        elementsPage.openRadioButton();
        elementsPage.selectRadioButton();
        elementsPage.checkRadioButtonSelection();
    }

    @Test
    public void formTextTest() {
        openPage();
        formsPage.openForms();
        formsPage.openPracticeForm();
        formsPage.enterFirstName("Имя");
        formsPage.enterLastName("Фамилия");
        formsPage.selectGender();
        formsPage.enterPhoneNumber("1234567890");
        formsPage.submitForm();
        formsPage.checkSubmission();
    }
}
