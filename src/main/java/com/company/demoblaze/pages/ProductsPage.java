package com.company.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public List<WebElement> getInventoryList() {
        WebElement inventoryList = this.driver.findElement(By.xpath("//div[@id='tbodyid']"));
        return inventoryList.findElements(By.xpath("//div[@class='card h-100']"));
    }
}
