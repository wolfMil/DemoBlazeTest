package com.company.demoblaze.tests;

import com.company.demoblaze.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductsTests extends BaseTest {

    @Test
    public void getListOfProducts() {

        HomePage homePage = new HomePage(driver);
        homePage.loginToWebPage();

        List<WebElement> listOfProducts = new ArrayList<>();

        while (homePage.isPrevoiusPageButtonDisplayed()) {
            List<WebElement> items = homePage.getInventoryList();
            for (int i = 0; i < items.size(); i++) {
                WebElement e = items.get(i);
                listOfProducts.add(e);
            }

            homePage.getNextPageButton().click();
        }

        //List<WebElement> listOfProducts = homePage.getInventoryList();

        for (WebElement e : listOfProducts) {
            System.out.println(e.getText());
        }

    }

    }
