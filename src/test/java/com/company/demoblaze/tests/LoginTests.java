package com.company.demoblaze.tests;

import com.company.demoblaze.models.User;
import com.company.demoblaze.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void verifyLoginWithTestUser() {
        HomePage homePage = new HomePage(driver);
        homePage.openPage();

        homePage.getLoginBtnFromNavBar();
        homePage.openModalLoginDialog();

        User user1 = new User("test", "test");
        homePage.login(user1);

        Assert.assertEquals(homePage.logoutBtnIsDisplayed(), true, "You're successfully logged in!");
    }

    @Test
    public void addToCartTest() {

    }

}
