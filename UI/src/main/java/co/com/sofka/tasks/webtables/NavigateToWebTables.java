package co.com.sofka.tasks.webtables;

import co.com.sofka.models.userwebtables.AddNewUserWebTablesModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.webtables.NavigateWebTables.ELEMENTS_WEB_TABLES;
import static co.com.sofka.userinterfaces.webtables.NavigateWebTables.ICON_ELEMENTS;


public class NavigateToWebTables implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(ICON_ELEMENTS),
                Click.on(ICON_ELEMENTS),
                WaitUntil.the(ELEMENTS_WEB_TABLES, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(10)
                        .seconds(),
                Scroll.to(ELEMENTS_WEB_TABLES),
                Click.on(ELEMENTS_WEB_TABLES)
        );
    }
    public static NavigateToWebTables navigateToWebTables (){return new NavigateToWebTables();}

}
