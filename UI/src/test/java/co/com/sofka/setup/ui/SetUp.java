package co.com.sofka.setup.ui;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUp {

    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROME_DRIVER_PATH = "src/test/resources/webdriver/linux/chromedriver";
    @Managed()
    protected WebDriver browser;

    protected void actorSetupTheBrowser(String actorName){
        System.setProperty(WEBDRIVER_CHROME_DRIVER,WEBDRIVER_CHROME_DRIVER_PATH);
        setupBrowser(browser);
        setupUser(actorName, browser);
    }

    private void setupBrowser(WebDriver browser){
        browser.manage().deleteAllCookies();
        browser.manage().window().maximize();
    }

    private void setupUser(String name, WebDriver driver){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(driver));
    }

}
