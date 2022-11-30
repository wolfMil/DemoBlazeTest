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
    }

    public WebElement getUsernameFieldModal() {
        return driver.findElement(By.xpath("//input[@id='loginusername']"));
    }

    public WebElement getPasswordFieldModal() {
        return driver.findElement(By.xpath("//input[@id='loginpassword']"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//button[@onclick='logIn()']"));
    }

    public void enterUsername(String username) {
        this.getUsernameFieldModal().sendKeys(username);
    }

    public void enterPassword(String password) {
        this.getPasswordFieldModal().sendKeys(password);
    }

    public void login(String username, String password) {
        this.getUsernameFieldModal().sendKeys(username);
        this.getPasswordFieldModal().sendKeys(password);
        this.getLoginButton().click();
    }

}
