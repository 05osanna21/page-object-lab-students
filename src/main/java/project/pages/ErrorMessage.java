package project.pages;

import org.openqa.selenium.By;

public class ErrorMessage extends BasePage {

    private By errorMessage = By.xpath("//div[@class='text-danger']");

    public String appearErrorMessage(){
        String actResAppearErrorMessage = find(errorMessage).getText();
        return actResAppearErrorMessage;
    }
}
