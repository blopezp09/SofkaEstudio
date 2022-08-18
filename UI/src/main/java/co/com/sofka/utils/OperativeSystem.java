package co.com.sofka.utils;

public enum  OperativeSystem {

    OPERATIVE_SYSTEM_WINDOWS("windows"),
    OPERATIVE_SYSTEM_LINUX("linux");
    private final String value;
    OperativeSystem (String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
