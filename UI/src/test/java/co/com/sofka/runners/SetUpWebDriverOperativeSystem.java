package co.com.sofka.runners;

import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SetUpWebDriverOperativeSystem {
    @BeforeClass
    public static void setup() {

        String rutaEvidencias;
        if(System.getProperty("os.name").contains("Windows")) {
        }else {
            //rutaEvidencias = propertiesFile.getFieldValue("files.evidence.linux");
        }
        //propertiesFile.updateFieldValue("files.evidence", rutaEvidencias);
    }

}
