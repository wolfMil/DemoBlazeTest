package com.company.demoblaze.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver() {
        this.driver = driver;
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        this.driver.get("https://www.demoblaze.com/");
        this.driver.manage().window().maximize();
    }

    //mapiranje elemenata


}
