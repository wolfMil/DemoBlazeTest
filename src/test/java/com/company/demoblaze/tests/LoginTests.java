package com.company.demoblaze.tests;

import com.company.demoblaze.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void verifyLoginWithTestUser() {
        HomePage homePage = new HomePage(driver);
        homePage.openPage();
    }


}
