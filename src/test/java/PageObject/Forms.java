package PageObject;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class Forms {
    public void openForms() {
        $x("//h5[contains(text(), 'Forms')]").click();
    }

    public void openPracticeForm() {
        $x("//span[contains(text(), 'Practice Form')]").click();
    }

    public void enterFirstName(String firstName) {
        $x("//input[@id='firstName']").setValue(firstName);
    }

    public void enterLastName(String lastName) {
        $x("//input[@id='lastName']").setValue(lastName);
    }

    public void selectGender() {
        $x("//div[@class='custom-control custom-radio custom-control-inline']").click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        $x("//input[@id='userNumber']").setValue(phoneNumber);
    }

    public void submitForm() {
        $x("//button[@id='submit']").scrollTo().click();
    }

    public void checkSubmission() {
        $x("//div[contains(text(), 'Thanks for submitting the form')]").shouldHave(text("Thanks for submitting the form"));
    }
}
