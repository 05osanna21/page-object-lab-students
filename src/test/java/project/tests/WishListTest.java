package project.tests;

import org.junit.Before;
import org.junit.Test;
import project.components.TopBar;
import project.pages.AccountPage;
import project.pages.MainPage;
import project.pages.WishListPage;

public class WishListTest extends BaseTest  {
    private MainPage mainPage;


    @Before

    public void login() {
        String emailAdress = "ivantest@gmail.com";
        String password = "1qazxsw2";
        String messageText = "My Account";


        mainPage = new MainPage();
        AccountPage actualMessage =  mainPage.openMainPage().getTopMenu()
                .clickIconMyAccount()
                .clickLogin()
                .setemailAdress(emailAdress)
                .setPassword(password)
                .clickLoginButton();}

    @Test
    public void wishList() {


        mainPage = new MainPage();
        WishListPage wishListOnTheTopOfThePage = mainPage.openMainPage().getTopMenu()






    }
}
