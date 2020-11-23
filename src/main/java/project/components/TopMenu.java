package project.components;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project.pages.LoginPage;
import project.pages.RegisterAccountPage;


public class TopMenu {
    private static WebDriver webDriver;

    public TopMenu(WebDriver driver) {
        webDriver = driver;
    }

    private By myAccount = By.xpath("//span[@ class='hidden-xs hidden-sm hidden-md' and text()='My Account']");
    private By buttonRegister = By.xpath("//a[text()='Register']");
    private By login = By.xpath("//li//a[text()='Login']");
    private By wishList = By.xpath("//a[@id='wishlist-total']");


    public TopMenu clickIconMyAccount() {
        webDriver.findElement(myAccount).click();
        return this;
    }

    public RegisterAccountPage clickOnTheButtonRegister() {
        webDriver.findElement(buttonRegister).click();
        return new RegisterAccountPage();
    }


    public LoginPage clickLogin() {
        webDriver.findElement(login).click();
        return new LoginPage();
    }

}
