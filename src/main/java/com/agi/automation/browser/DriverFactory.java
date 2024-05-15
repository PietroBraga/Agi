package com.agi.automation.browser;

import org.openqa.selenium.WebDriver;

public class DriverFactory{

    private WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null){
            createDriver();
        }

        return driver;
    }

    private void createDriver() {
        String browser = System.getProperty("browser");

        switch (browser) {
            case "chrome":
                this.driver = new ChromeFactory().getDriver();
                break;
            case "firefox":
                this.driver = new FirefoxFactory().getDriver();
                break;
            default:
                throw new IllegalArgumentException("Not Supported Browser, use chrome or firefox instead.");
        }
    }
}
