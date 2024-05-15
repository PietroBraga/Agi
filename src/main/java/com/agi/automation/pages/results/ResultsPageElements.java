package com.agi.automation.pages.results;

import com.agi.automation.browser.DriverFactory;
import com.agi.automation.base.BaseElementMap;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultsPageElements extends BaseElementMap {
    @Getter(lazy = true)
    private final WebElement header = driver.findElement(By.xpath("//section[@class = 'ast-archive-description']/h1"));

    @Getter(lazy=true)
    private final WebElement noResultsSection = driver.findElement(By.xpath("//section[@class = 'no-results not-found']"));

    @Getter(lazy=true)
    private final List<WebElement> results = driver.findElements(By.tagName("article"));


    public ResultsPageElements(DriverFactory driverFactory) {
        super(driverFactory);
    }
}
