package steps;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();


    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

    @And("I select Introduccion al Testing")
    public void navigateToIntro() {
        cursosPage.clickFundamentosTestingLink();
        // Tengo que mirar este metodo porque creo que no es necesario pero en el curso lo añaden y puede que este desactualizado este punto
        // fundamentosPage.clickIntroduccionTestingLink();
    }

}
