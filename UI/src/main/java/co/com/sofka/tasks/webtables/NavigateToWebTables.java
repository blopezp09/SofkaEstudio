package co.com.sofka.tasks.webtables;


import co.com.sofka.userinterfaces.webtables.WebTables;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class NavigateToWebTables implements Task {

    private WebTables  webTables;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn(webTables)
        );
    }

    public static NavigateToWebTables navigateToWebTables (){return new NavigateToWebTables();}

}
