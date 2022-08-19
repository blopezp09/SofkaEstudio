package co.com.sofka.tasks.webtables;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.webtables.FieldsWebTables.*;

public class AddNewUserWebTables implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(BUTTON_ADD_USER_WEB_TABLE),
                Click.on(BUTTON_ADD_USER_WEB_TABLE),

                Scroll.to(FIRST_NAME_WEB_TABLE),
                Clear.field(FIRST_NAME_WEB_TABLE)

        );

    }
}
