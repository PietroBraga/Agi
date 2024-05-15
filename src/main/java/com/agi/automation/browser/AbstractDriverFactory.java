package com.agi.automation.browser;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public abstract class AbstractDriverFactory {
    protected WebDriver driver;

    public AbstractDriverFactory() {
        this.createWebDriver();
        this.setTimeouts();
        this.maximizeWindow();
    }

    protected WebDriver getDriver(){
        return this.driver;
    }
    abstract void createWebDriver();

    private void maximizeWindow() {
        this.driver.manage().window().maximize();
    }

    private void setTimeouts() {
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }
}
