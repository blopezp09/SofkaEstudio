package co.com.sofka.utils;

public enum PathWebDriverOerativeSystem {

    WEBDRIVER_CHROME_DRIVER_PATH_LINUX("src/test/resources/webdriver/linux/chromedriver"),
    WEBDRIVER_CHROME_DRIVER_PATH_WINDOWS("src/test/resources/webdriver/windows/chromedriver.exe");

    private final String value;
    PathWebDriverOerativeSystem(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
