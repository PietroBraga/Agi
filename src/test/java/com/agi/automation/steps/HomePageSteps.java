package com.agi.automation.steps;

import com.agi.automation.pages.homepage.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;

public class HomePageSteps {
    private final HomePage page;

    public HomePageSteps(HomePage page) {
        this.page = page;
    }

    @Given("eu navego para a página inicial")
    public void euNavegoParaAPaginaInicial() {
        page.open();
    }

    @And("eu pesquiso pelo termo {string}")
    public void euPesquisoPeloTermo(String searchTerm) {
        page.search(searchTerm);
    }

    @And("eu pesquiso pelo termo {string} e aperto Enter")
    public void euPesquisoPeloTermoEApertoEnter(String searcTerm) {
        page.clickOnSearchIcon()
                .sendSearchTerm(searcTerm)
                .sendSearchTerm(Keys.ENTER);
    }
}
