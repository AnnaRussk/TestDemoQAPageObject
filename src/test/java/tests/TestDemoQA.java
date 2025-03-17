package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.Elements;
import pages.Forms;

public class TestDemoQA extends TestBase {

    private final Elements elementsPage = new Elements();
    private final Forms formsPage = new Forms();

    @BeforeEach
    public void openingPage() {
        openPage();
    }

    @Test
    public void textFieldTest() {
        elementsPage.openElements();
        elementsPage.openTextBox();
        elementsPage.enterUserName("Евгений");
        elementsPage.submitTextBox();
        elementsPage.checkUserName("Евгений");
    }

    @Test
    public void checkBoxTest() {
        elementsPage.openCheckBox();
        elementsPage.selectCheckBox();
        elementsPage.checkCheckBoxSelection();
    }

    @Test
    public void radioButtonTest() {
        elementsPage.openRadioButton();
        elementsPage.selectRadioButton();
        elementsPage.checkRadioButtonSelection();
    }

    @Test
    public void formTextTest() {
        formsPage.openForms();
        formsPage.openPracticeForm();
        formsPage.enterFirstName("Евгения");
        formsPage.enterLastName("Коробкова");
        formsPage.selectGender();
        formsPage.enterPhoneNumber("1234567890");
        formsPage.submitForm();
        formsPage.checkSubmission();
    }
}