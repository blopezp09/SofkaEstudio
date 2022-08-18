package co.com.sofka.runners.agregarregistro;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/AgregarUnNuevoRegistro.feature"},
        glue = {"co.com.sofka.stepdefinitions.stepdefinitionagregarregistro"}
)
public class AgregarUnNuevoRegistroExitoso {
}
