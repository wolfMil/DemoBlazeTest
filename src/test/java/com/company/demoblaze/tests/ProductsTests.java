package com.company.demoblaze.tests;

import com.company.demoblaze.models.User;
import com.company.demoblaze.pages.HomePage;
import com.company.demoblaze.pages.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ProductsTests extends BaseTest {

    @Test
    public void getListOfProducts() {
        HomePage homePage = new HomePage(driver);
        homePage.openPage();
        homePage.getLoginBtnFromNavBar();
        homePage.openModalLoginDialog();
        User user1 = new User("test", "test");
        homePage.login(user1);

        ProductsPage productsPage = new ProductsPage(driver);
        List<WebElement> listOfItems = productsPage.getInventoryList();

        for(WebElement element : listOfItems) {
            System.out.println(element.getText());
        }


    }
}
