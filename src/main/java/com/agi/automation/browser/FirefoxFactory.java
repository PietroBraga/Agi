package com.agi.automation.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxFactory extends AbstractDriverFactory{
    @Override
    void createWebDriver() {
        WebDriverManager.firefoxdriver().setup();
        this.driver = new FirefoxDriver();
    }
}
