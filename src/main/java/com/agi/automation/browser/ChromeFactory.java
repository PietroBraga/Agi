package com.agi.automation.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFactory extends AbstractDriverFactory{

    @Override
    void createWebDriver() {
        WebDriverManager.chromiumdriver().setup();
        this.driver = new ChromeDriver();
    }
}
