package project.tests;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import project.pages.MainPage;
import project.pages.RegisterAccountPage;

public class ErrorMessageTest extends BaseTest {


    private MainPage mainPage;

    @Test
    public void registrationWithValidCredentials() {
        String lastName = "Ivanov";
        String email = utils.RandomEmail.generateString();
        String telephone = "+38651234879";
        String password = "1qazxsw2";
        String confirm = "1qazxsw2";
        String messageText = "First Name must be between 1 and 32 characters!";


        mainPage = new MainPage();
        //CongrPage actualResualt = (CongrPage) mainPage
        RegisterAccountPage actualResualt = (RegisterAccountPage) mainPage.openMainPage().getTopMenu()
                .clickIconMyAccount()
                .clickOnTheButtonRegister()
                .setLastNameField(lastName)
                .setEmail(email)
                .setTelephone(telephone)
                .setPassword(password)
                .setConfirm(confirm)
                .clickCheckbox()
                .clickContinueButton();
        Assertions.assertThat(actualResualt.appearErrorMessage()).isEqualTo(messageText);
    }
}
