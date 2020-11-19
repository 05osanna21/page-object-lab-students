package project.pages;

import org.openqa.selenium.By;

public class RegisterAccountPage extends BasePage {

    private By firstNameField = By.xpath("//input[@name='firstname']");
    private By lastNameField = By.xpath("//input[@name='lastname']");
    private By emailField = By.xpath("//input[@name='email']");
    private By telephoneField = By.xpath("//input[@name='telephone']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By confirmField = By.xpath("//input[@name='confirm']");
    private By checkbox = By.xpath("//input[@type='checkbox']");
    private By continueButton = By.xpath("//input[@type='submit']");


    public RegisterAccountPage setFirstNameField(String userName) {
        find(firstNameField).sendKeys(userName);
        return this;
    }

    public RegisterAccountPage setLastNameField(String lastName) {
        find(lastNameField).sendKeys(lastName);
        return this;
    }

    public RegisterAccountPage setEmail(String email) {
        find(emailField).sendKeys(email);
        return this;
    }

    public RegisterAccountPage setTelephone(String telephone) {
        find(telephoneField).sendKeys(telephone);
        return this;
    }

    public RegisterAccountPage setPassword(String password) {
        find(passwordField).sendKeys(password);
        return this;
    }

    public RegisterAccountPage setConfirm(String confirm) {
        find(confirmField).sendKeys(confirm);
        return this;
    }

    public RegisterAccountPage clickCheckbox() {
        find(checkbox).click();
        return this;
    }

    public CongrPage clickContinueButton() {
        find(continueButton).click();
        return new CongrPage();
    }

}
