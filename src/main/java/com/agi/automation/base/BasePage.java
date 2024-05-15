package com.agi.automation.base;

import com.agi.automation.browser.DriverFactory;
import org.openqa.selenium.WebDriver;

public abstract class BasePage<BaseElementMap> {
    protected final WebDriver driver;
    protected BaseElementMap elements;
    public String url;

    public BasePage(DriverFactory driverFactory, BaseElementMap elementMap) {
        this.driver = driverFactory.getDriver();
        this.elements = elementMap;
    }

    public BaseElementMap getElements(){
        return elements;
    }

    public void open(){
        driver.get(url);
    }
}
