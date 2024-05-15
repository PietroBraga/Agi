package com.agi.automation.pages.homepage;

import com.agi.automation.base.BasePage;
import com.agi.automation.browser.DriverFactory;
import org.openqa.selenium.Keys;

public class HomePage extends BasePage<HomePageElements> {
    public HomePage(DriverFactory driverFactory, HomePageElements homePageElements) {
        super(driverFactory, homePageElements);
        this.url = System.getProperty("base.url");
    }

    public HomePage search(String searchName) {
        elements.getSearchIcon()
                .click();

        elements.getSearchBox()
                .sendKeys(searchName);

        elements.getSearchIcon()
                .click();

        return this;
    }

    public HomePage clickOnSearchIcon(){
        elements.getSearchIcon()
                .click();

        return this;
    }

    public HomePage sendSearchTerm(CharSequence... keysToSend) {
        elements.getSearchBox()
                .sendKeys(keysToSend);

        return this;
    }
}
