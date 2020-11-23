package project.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {


    private By emailAdressl = By.xpath("//div[@id='search']//input[@type='text']");
    private By passwordl = By.xpath("//div[@class='form-group']//input[@type='password']");
    private By loginButton = By.xpath("//input[@type='submit']");



    public LoginPage setemailAdress(String emailAdress) {
        find(emailAdressl).sendKeys(emailAdress);
        return this;
    }

    public LoginPage setPassword(String password) {
        find(passwordl).sendKeys(password);
        return this;
    }
    public AccountPage clickLoginButton(){
        find(loginButton).click();
        return new AccountPage();
    }
}
