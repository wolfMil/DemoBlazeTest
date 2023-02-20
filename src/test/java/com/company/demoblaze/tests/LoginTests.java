package com.company.demoblaze.tests;

import com.company.demoblaze.models.User;
import com.company.demoblaze.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void verifyLoginWithTestUser() {
        HomePage homePage = new HomePage(driver);
        homePage.loginToWebPage();

        Assert.assertEquals(homePage.logoutBtnIsDisplayed(), true, "You're successfully logged in!");
    }

}
