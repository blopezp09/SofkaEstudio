package co.com.sofka.stepdefinitions.stepdefinitionagregarregistro;

import co.com.sofka.setup.ui.SetUp;
import co.com.sofka.tasks.webtables.NavigateToWebTables;
import co.com.sofka.utils.Actors;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.webtables.NavigateToWebTables.navigateToWebTables;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarRegistroExitosoStepDefinition extends SetUp {

    @Dado("que el usuario esté en la página y navegue hasta el apartado web tables")
    public void queElUsuarioEsteEnLaPaginaYNavegueHastaElApartadoWebTables() {
        actorSetupTheBrowser(Actors.OPEN_LANDING_PAGE_ACTOR.getValue());
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navigateToWebTables()
        );

    }
    @Cuando("el usuario suministra los campos solicitados")
    public void elUsuarioSuministraLosCamposSolicitados() {

    }
    @Entonces("el sistema validará y agregará el registro exitosamente")
    public void elSistemaValidaraYAgregaraElRegistroExitosamente() {

    }
}
