package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.Elements;
import pages.Forms;
import pages.Widgets;
import utils.TestData;

public class TestDemoQA extends TestBase {

    private final Elements elementsPage = new Elements();
    private final Forms formsPage = new Forms();
    private final Widgets widgetPage = new Widgets();

    String name = TestData.firstName;
    String surname = TestData.lastName;
    String phone = (TestData.phone);

    @BeforeEach
    public void openingPage() {
        openPage();
    }

    @Test
    public void textFieldTest() {

        elementsPage.openElements();
        elementsPage.openTextBox();
        elementsPage.enterUserName(name);
        elementsPage.submitTextBox();
        elementsPage.checkUserName(name);
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
        formsPage.enterFirstName(name);
        formsPage.enterLastName(surname);
        formsPage.selectGender();
        formsPage.enterPhoneNumber(String.valueOf(phone));
        formsPage.submitForm();
        formsPage.checkSubmission();
    }

    @Test
    public void statementInWidget() {
        widgetPage.openWidgets();
        widgetPage.openTabsForm();
        widgetPage.clickOnOriginTab();
        widgetPage.checkTextInOriginTab();
    }
}