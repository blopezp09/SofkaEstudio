package co.com.sofka.setup.ui;

import co.com.sofka.utils.OperativeSystem;
import co.com.sofka.utils.PathWebDriverOerativeSystem;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUp {

    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    @Managed()
    protected WebDriver browser;

    protected void configureWebDriver(){
        if(System.getProperty("os.name").contains(OperativeSystem.OPERATIVE_SYSTEM_WINDOWS.getValue())) {
            System.setProperty(WEBDRIVER_CHROME_DRIVER,PathWebDriverOerativeSystem.WEBDRIVER_CHROME_DRIVER_PATH_WINDOWS.getValue());
        }
        if(System.getProperty("os.name").contains(OperativeSystem.OPERATIVE_SYSTEM_LINUX.getValue())) {
            System.setProperty(WEBDRIVER_CHROME_DRIVER,PathWebDriverOerativeSystem.WEBDRIVER_CHROME_DRIVER_PATH_LINUX.getValue());
        }
    }

    protected void actorSetupTheBrowser(String actorName){
        configureWebDriver();
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
