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
    private By errorMessage = By.xpath("//div[@class='text-danger']");


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

    public BasePage clickContinueButton() {
        find(continueButton).click();
        if (getDriver().getCurrentUrl().contains("register")) {
            return new RegisterAccountPage();
        } else {
            return new CongrPage();
        }
    }

    public String appearErrorMessage() {
        String actResAppearErrorMessage = find(errorMessage).getText();
        return actResAppearErrorMessage;
    }
}

