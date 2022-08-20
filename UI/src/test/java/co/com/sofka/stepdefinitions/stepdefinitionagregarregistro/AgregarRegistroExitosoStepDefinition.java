package co.com.sofka.stepdefinitions.stepdefinitionagregarregistro;

import co.com.sofka.models.userwebtables.AddNewUserWebTablesModel;
import co.com.sofka.setup.ui.SetUp;
import co.com.sofka.utils.Actors;
import com.github.javafaker.Faker;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.webtables.AddNewUserWebTables.addNewUserWebTables;
import static co.com.sofka.tasks.webtables.NavigateToWebTables.navigateToWebTables;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarRegistroExitosoStepDefinition extends SetUp {

    Faker faker = new Faker();
    AddNewUserWebTablesModel addNewUserWebTablesModel;

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
        theActorInTheSpotlight().attemptsTo(
                addNewUserWebTables()
                        .usingInformationUser(newUser())
        );


    }
    @Entonces("el sistema validará y agregará el registro exitosamente")
    public void elSistemaValidaraYAgregaraElRegistroExitosamente() {

    }

    private AddNewUserWebTablesModel newUser() {

        addNewUserWebTablesModel = new AddNewUserWebTablesModel();
        addNewUserWebTablesModel.setFirstName(
                faker.name().firstName());
        addNewUserWebTablesModel.setLastName(
                faker.name().lastName());
        addNewUserWebTablesModel.setEmail(
                faker.internet().emailAddress());
        addNewUserWebTablesModel.setAge(
                String.valueOf(faker.number().randomNumber()));
        addNewUserWebTablesModel.setSalary(
                String.valueOf(faker.number().numberBetween(1000,2000)));
        addNewUserWebTablesModel.setDepartment(
                faker.demographic().demonym());

        return addNewUserWebTablesModel;
    }

}
