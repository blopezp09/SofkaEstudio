package co.com.sofka.userinterfaces.webtables;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class NavigateWebTables extends PageObject {

    public static final Target ICON_ELEMENTS = Target
            .the("Icon element")
            .locatedBy("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]");

    public static final Target ELEMENTS_WEB_TABLES = Target
            .the("Elements web tables")
            .locatedBy("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]/span");
}
