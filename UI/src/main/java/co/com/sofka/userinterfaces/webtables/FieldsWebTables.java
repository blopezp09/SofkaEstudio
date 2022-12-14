package co.com.sofka.userinterfaces.webtables;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class FieldsWebTables extends PageObject {

    public static final Target BUTTON_ADD_USER_WEB_TABLE = Target
            .the("Button add new user web table")
            .locatedBy("//*[@id=\"addNewRecordButton\"]");

    public static final Target FIRST_NAME_WEB_TABLE = Target
            .the("First name Web tables")
            .locatedBy("//*[@id=\"firstName\"]");

    public static final Target LAST_NAME_WEB_TABLE = Target
            .the("Last name Web tables")
            .locatedBy("//*[@id=\"lastName\"]");

    public static final Target EMAIL_WEB_TABLE = Target
            .the("email Web Tables")
            .locatedBy("//*[@id=\"userEmail\"]");

    public static final Target AGE_WEB_TABLE = Target
            .the("Age Web Tables")
            .locatedBy("//*[@id=\"age\"]");

    public static final Target SALARY_WEB_TABLE = Target
            .the("Salary Web Tables")
            .locatedBy("//*[@id=\"salary\"]");

    public static final Target DEPARTMENT_WEB_TABLE = Target
            .the("Department Web Tables")
            .locatedBy("//*[@id=\"department\"]");

    public static final Target BUTTON_SUBMIT_WEB_TABLE = Target
            .the("Button submit web table")
            .locatedBy("//*[@id=\"submit\"]");

    public static final Target FORM_USER_WEB_TABLE = Target
            .the("Form user web table")
            .locatedBy("//*[@id=\"app\"]/div/div/div[2]/div[2]");
}
