package project.pages;

import org.openqa.selenium.By;

public class AccountPage extends BasePage {
    private By myAccount = By.xpath("//h2[text()='My Account']");


    public String findAccountPage() {
        String actualMessage = find(myAccount).getText();
        return actualMessage;
    }

}
