package com.agi.automation.base;

import com.agi.automation.browser.DriverFactory;
import org.openqa.selenium.WebDriver;

public abstract class BaseElementMap {
    public final WebDriver driver;

    public BaseElementMap(DriverFactory driverFactory) {
        this.driver = driverFactory.getDriver();
    }
}
