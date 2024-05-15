package com.agi.automation.steps;

import com.agi.automation.browser.DriverFactory;
import com.agi.automation.pages.results.ResultsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

public class ResultsPageSteps {
    private final WebDriver driver;
    private final ResultsPage page;

    public ResultsPageSteps(DriverFactory driverFactory, ResultsPage page) {
        this.driver = driverFactory.getDriver();
        this.page = page;
    }

    @Then("eu vejo a página de resultados")
    public void euVejoAPaginaDeResultados() {
        assertTrue(driver.getCurrentUrl().contains("?s="));
    }

    @And("eu vejo um header com o texto {string}")
    public void euVejoUmHeaderComOTexto(String expectedText) {
        String actualText = page.getElements()
                .getHeader()
                .getAttribute("innerText");

        assertEquals(expectedText, actualText);
    }

    @And("a seção de resultados está vazia")
    public void aSecaoDeResultadosEstaVazia() {
        assertTrue(page.getElements()
                .getNoResultsSection()
                .isDisplayed());
    }

    @And("a seção de resultados exibe a mensagem {string}")
    public void aSecaoDeResultadosExibeAMensagem(String expectedText) {
        String actualText = page.getElements()
                .getNoResultsSection()
                .getText();

        assertTrue(actualText.contains(expectedText));
    }

    @And("a lista de resultados é maior que {int}")
    public void aListaDeResultadosEMaiorQue(int count) {
        assertTrue(page.getElements()
                .getResults()
                .size() > count);
    }
}
