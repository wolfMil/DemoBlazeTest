package com.company.demoblaze.pages;

import org.openqa.selenium.WebDriver;

public class ProductsPage {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        this.driver.get("https://demoblaze.com/");
        this.driver.manage().window().maximize();
    }

    //mapiranje elemenata

}
