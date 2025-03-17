package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class Elements {
    public void openElements() {
        $x("//h5[contains(text(), 'Elements')]").scrollTo().click();
    }

    public void openTextBox() {
        $x("//span[contains(text(), 'Text Box')]").click();
    }

    public void enterUserName(String name) {
        $x("//input[@id='userName']").scrollTo().setValue(name);
    }

    public void submitTextBox() {
        $x("//button[@id='submit']").click();
    }

    public void checkUserName(String expectedText) {
        $x("//p[@id='name']").shouldHave(text("Name:" + expectedText));
    }

    public void openCheckBox() {
        $x("//span[contains(text(), 'Check Box')]").click();
    }

    public void selectCheckBox() {
        $x("//span[contains(text(), 'Check Box')]").click();
    }

    public void checkCheckBoxSelection() {
        $x("//span[contains(text(), 'You have selected')]").shouldHave(text("You have selected :"));
    }

    public void openRadioButton() {
        $x("//span[contains(text(), 'Radio Button')]").click();
    }

    public void selectRadioButton() {
        $x("//label[@class='custom-control-label']").click();
    }

    public void checkRadioButtonSelection() {
        $x("//span[@class='text-success']").shouldHave(text("Yes"));
    }
}
