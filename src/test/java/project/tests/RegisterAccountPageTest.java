package project.tests;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import project.pages.CongrPage;
import project.pages.MainPage;
import project.pages.RegisterAccountPage;
import project.utils.RandomEmail;

public class RegisterAccountPageTest extends BaseTest {

  private MainPage mainPage;

  @Test
  public void registrationWithValidCredentials() {
    String userName = "Ivan";
    String lastName = "Ivanov";
    String email = RandomEmail.generateString();
    String telephone = "+38651234879";
    String password = "1qazxsw2";
    String confirm = "1qazxsw2";
    String messageText = "Your Account Has Been Created!";


    mainPage = new MainPage();
    mainPage.openMainPage();
   String actualMessage   = mainPage.clickIconMyAccount()
           .clickOnTheButtonRegister()
           .setFirstNameField(userName)
           .setLastNameField(lastName)
           .setEmail(email)
           .setTelephone(telephone)
           .setPassword(password)
           .setConfirm(confirm)
           .clickCheckbox()
           .clickContinueButton()
           .getCongMessage();

    Assertions.assertThat(actualMessage).isEqualTo(messageText);

}
}

