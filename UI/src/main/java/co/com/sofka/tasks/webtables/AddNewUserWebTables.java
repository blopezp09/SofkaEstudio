package co.com.sofka.tasks.webtables;

import co.com.sofka.models.userwebtables.AddNewUserWebTablesModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.userinterfaces.webtables.FieldsWebTables.*;

public class AddNewUserWebTables implements Task {

    private AddNewUserWebTablesModel addNewUserWebTablesModel;

    public AddNewUserWebTables usingInformationUser(AddNewUserWebTablesModel addNewUserWebTablesModel){
        this.addNewUserWebTablesModel = addNewUserWebTablesModel;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(BUTTON_ADD_USER_WEB_TABLE),
                Click.on(BUTTON_ADD_USER_WEB_TABLE),

                Scroll.to(FIRST_NAME_WEB_TABLE),
                Clear.field(FIRST_NAME_WEB_TABLE),
                Enter.theValue(addNewUserWebTablesModel.getFirstName()).into(FIRST_NAME_WEB_TABLE),

                Scroll.to(LAST_NAME_WEB_TABLE),
                Clear.field(LAST_NAME_WEB_TABLE),
                Enter.theValue(addNewUserWebTablesModel.getLastName()).into(LAST_NAME_WEB_TABLE),

                Scroll.to(EMAIL_WEB_TABLE),
                Clear.field(EMAIL_WEB_TABLE),
                Enter.theValue(addNewUserWebTablesModel.getEmail()).into(EMAIL_WEB_TABLE),

                Scroll.to(AGE_WEB_TABLE),
                Clear.field(AGE_WEB_TABLE),
                Enter.theValue(addNewUserWebTablesModel.getAge()).into(AGE_WEB_TABLE),

                Scroll.to(SALARY_WEB_TABLE),
                Clear.field(SALARY_WEB_TABLE),
                Enter.theValue(addNewUserWebTablesModel.getSalary()).into(SALARY_WEB_TABLE),

                Scroll.to(DEPARTMENT_WEB_TABLE),
                Clear.field(DEPARTMENT_WEB_TABLE),
                Enter.theValue(addNewUserWebTablesModel.getDepartment()).into(DEPARTMENT_WEB_TABLE),

                Scroll.to(BUTTON_SUBMIT_WEB_TABLE),
                Click.on(BUTTON_SUBMIT_WEB_TABLE),
                WaitUntil.the(FORM_USER_WEB_TABLE, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(10)
                        .seconds()
        );

    }
    public static AddNewUserWebTables addNewUserWebTables(){
        return new AddNewUserWebTables();
    }

}
