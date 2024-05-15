package com.agi.automation.steps;

import com.agi.automation.browser.DriverFactory;
import com.agi.automation.utils.PropertiesLoader;
import com.agi.automation.EvidenceHandler;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks {
    private final DriverFactory driverFactory;
    private final EvidenceHandler evidenceHandler;
    private final PropertiesLoader propertiesLoader;

    public Hooks(DriverFactory driverFactory, EvidenceHandler evidenceHandler, PropertiesLoader loader) {
        this.driverFactory = driverFactory;
        this.evidenceHandler = evidenceHandler;
        this.propertiesLoader = loader;
    }

    @Before
    public void beforeScenarios() throws IOException {
        propertiesLoader.loadProperties();
    }

    @After(order = 2)
    public void takeScreenshot(Scenario scenario){
        byte[] screenshot = ((TakesScreenshot) driverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/jpg", scenario.getName());
    }

    @After(order = 1)
    public void attachEvidences(Scenario scenario){
        for (String key : evidenceHandler.getEvidences().keySet()) {
            scenario.log(String.format("%s: %s", key, evidenceHandler.getEvidences().get(key)));
        }
    }

    @After( order = 1)
    public void quitDriver(){
        driverFactory.getDriver().quit();
    }
}
