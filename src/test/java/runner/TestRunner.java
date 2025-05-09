package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", // Indicamos la ruta de las features
    glue = "steps", // Indicamos la ruta donde tenemos nuestras clases definiendo los steps
    plugin = { "pretty", "html:target/cucumber-reports.html" })

// Ejecutamos las pruebas de Cucumber
public class TestRunner {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }	

}
