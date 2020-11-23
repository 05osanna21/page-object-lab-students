package project.tests;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import project.pages.MainPage;

public class LoginTest extends BaseTest {
    private MainPage mainPage;

    @Test
    public void login() {
        String emailAdress = "ivantest@gmail.com";
        String password = "1qazxsw2";
        String messageText = "My Account";


        mainPage = new MainPage();
       String actualMessage =  mainPage.openMainPage().getTopMenu()
                .clickIconMyAccount()
                .clickLogin()
                .setemailAdress(emailAdress)
                .setPassword(password)
                .clickLoginButton()
                .findAccountPage();
        Assertions.assertThat(actualMessage).isEqualTo(messageText);
    }
}
