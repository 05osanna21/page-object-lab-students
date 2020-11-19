package project.pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {

    By myAccount = By.xpath("//span[@ class='hidden-xs hidden-sm hidden-md' and text()='My Account']");
    By buttonRegister = By.xpath("//a[text()='Register']");

    public MainPage openMainPage() {
        getDriver().get("https://demo.opencart.com/");
        return this;
    }

    public MainPage clickIconMyAccount(){
        find(myAccount).click();
        return this;
    }

    public RegisterAccountPage clickOnTheButtonRegister(){
        find(buttonRegister).click();
        return new RegisterAccountPage();
    }
}
