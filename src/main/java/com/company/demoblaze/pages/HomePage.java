package com.company.demoblaze.pages;

import com.company.demoblaze.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public WebElement getLoginBtnFromNavBar() {
        return driver.findElement(By.xpath("//a[@id='login2']"));
    }

    public void openModalLoginDialog() {
        getLoginBtnFromNavBar().click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //lociranje elemenata
    public WebElement getUsernameFieldModal() {
        return driver.findElement(By.xpath("//input[@id='loginusername']"));
    }

    public WebElement getPasswordFieldModal() {
        return driver.findElement(By.xpath("//input[@id='loginpassword']"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//button[@onclick='logIn()']"));
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.xpath("//a[@id='logout2']"));
    }

    //akcije sa elementima
    public void enterUsername(String username) {
        this.getUsernameFieldModal().sendKeys(username);
    }

    public void enterPassword(String password) {
        this.getPasswordFieldModal().sendKeys(password);
    }

    public void clickOnLogin() {
        this.getLoginButton().click();
    }

    public boolean logoutBtnIsDisplayed() {
        boolean toReturn = false;
        WebElement logoutButton = driver.findElement(By.xpath("//a[@id='logout2']"));
        if (logoutButton != null) {
            toReturn = true;
        }
        return toReturn;
    }

    public void login(String username, String password) {
        this.getUsernameFieldModal().sendKeys(username);
        this.getPasswordFieldModal().sendKeys(password);
        this.clickOnLogin();
    }

    public void login(User user) {
        this.enterUsername(user.getUsername());
        this.enterPassword(user.getPassword());
        this.clickOnLogin();
    }

}
