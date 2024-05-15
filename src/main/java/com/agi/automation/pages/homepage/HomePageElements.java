package com.agi.automation.pages.homepage;

import com.agi.automation.browser.DriverFactory;
import com.agi.automation.base.BaseElementMap;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class HomePageElements extends BaseElementMap {

    @Getter(lazy=true)
    private final WebElement searchIcon = driver.findElement(By.xpath("//div[contains(@class, 'ast-search-menu-icon')]"));

    @Getter(lazy=true)
    private final WebElement searchBox = driver.findElement(By.id("search-field"));

    public HomePageElements(DriverFactory driverFactory) {
        super(driverFactory);
    }


}
