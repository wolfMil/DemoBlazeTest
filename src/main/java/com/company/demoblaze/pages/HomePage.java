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

    List<WebElement> ModalLoginDialogWebElements = this.driver.findElements(By.xpath("//div[@class='modal-content']"));

    public WebElement getUsernameFieldWebElement() {
        WebElement toReturn = null;
        for (int i = 0; i < ModalLoginDialogWebElements.size(); i++) {
            WebElement tempElement = ModalLoginDialogWebElements.get(i).findElement(By.xpath("//input[@id='loginusername']"));
            toReturn = tempElement;
            break;
        }
        return toReturn;
    }

    public WebElement getPasswordFieldWebElement() {
        WebElement toReturn = null;
        for (int i = 0; i < ModalLoginDialogWebElements.size(); i++) {
            WebElement tempElement = ModalLoginDialogWebElements.get(i).findElement(By.xpath("//input[@id='loginpassword']"));
            toReturn = tempElement;
            break;
        }
        return toReturn;
    }

    public WebElement getLoginBtnInModalDialog() {
        WebElement toReturn = null;
        for (int i = 0; i < ModalLoginDialogWebElements.size(); i++) {
            WebElement tempElement = ModalLoginDialogWebElements.get(i).findElement(By.xpath("//button[@onclick='logIn()']"));
            toReturn = tempElement;
            break;
        }
        return toReturn;
    }

    public void setUsername(String username) {
        this.getUsernameFieldWebElement().click();
        this.getUsernameFieldWebElement().sendKeys(username);
    }

    public void setPassword(String password) {
        this.getPasswordFieldWebElement().click();
        this.getPasswordFieldWebElement().sendKeys(password);
    }

    public void clickOnLogin() {
        this.getLoginBtnInModalDialog().click();
    }

    public void login(User user) {
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
        this.getLoginBtnInModalDialog().click();
    }



}
